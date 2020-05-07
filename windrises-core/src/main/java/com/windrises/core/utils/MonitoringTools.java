package com.windrises.core.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 详见https://www.cnblogs.com/erbing/p/9799098.html
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/5/7 16:32
 */
@Slf4j
@Component
public class MonitoringTools {

    private static CuratorFramework client;

    @Autowired
    public void setClient(CuratorFramework client) {
        MonitoringTools.client = client;
    }

    /**
     * 在注册监听器的时候，如果传入此参数，当事件触发时，逻辑由线程池处理
     */
    static ExecutorService pool = Executors.newFixedThreadPool(2);


    public static void method1(String path) throws Exception {
        final NodeCache nodeCache = new NodeCache(client, path, false);
        nodeCache.start(true);
        nodeCache.getListenable().
                addListener(
                        () -> System.out.println("Node data is changed, new data: " +
                                new String(nodeCache.getCurrentData().getData()))
                );
    }

    public static void method2(String path) throws Exception {
        final PathChildrenCache childrenCache = new PathChildrenCache(client, path, true);
        childrenCache.start(PathChildrenCache.StartMode.POST_INITIALIZED_EVENT);
        childrenCache.getListenable().
                addListener(
                        (client, event) -> {
                            switch (event.getType()) {
                                case CONNECTION_RECONNECTED:
                                    childrenCache.rebuild();
                                    break;
                                case CONNECTION_SUSPENDED:
                                    break;
                                case CONNECTION_LOST:
                                    System.out.println("Connection lost");
                                    break;
                                case CHILD_ADDED:
                                    System.out.println("CHILD_ADDED: " + event.getData().getPath());
                                    break;
                                case CHILD_REMOVED:
                                    System.out.println("CHILD_REMOVED: " + event.getData().getPath());
                                    break;
                                case CHILD_UPDATED:
                                    System.out.println("CHILD_UPDATED: " + event.getData().getPath());
                                    break;
                                default:
                                    break;
                            }
                        }
                );
    }

    public static void treeCache(String path) throws Exception {
        final TreeCache treeCache = TreeCache.newBuilder(client, path).build();
        treeCache.start();
        treeCache.getListenable().addListener((client1, event) -> {
            switch (event.getType()) {
                case NODE_ADDED:
                    log.info("A node was added." + event.getData().getPath());
                    break;
                case NODE_UPDATED:
                    log.info("A node's data was changed" + event.getData().getPath());
                    break;
                case NODE_REMOVED:
                    log.info("A node was removed from the tree" + event.getData().getPath());
                    break;
                case CONNECTION_SUSPENDED:
                    log.info("CONNECTION_SUSPENDED");
                    break;
                case CONNECTION_RECONNECTED:
                    log.info("CONNECTION_RECONNECTED");
                    break;
                case CONNECTION_LOST:
                    log.info("CONNECTION_LOST");
                    break;
                case INITIALIZED:
                    log.info("INITIALIZED");
                    break;
                default:
                    break;
            }
        }, pool);
    }
}

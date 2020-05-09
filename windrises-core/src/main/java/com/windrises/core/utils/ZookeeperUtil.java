package com.windrises.core.utils;


import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * zk的crud工具类
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/5/4 9:29
 */
@Slf4j
@Component
public class ZookeeperUtil {


    private static CuratorFramework client;

    @Autowired
    public void setClient(CuratorFramework client) {
        ZookeeperUtil.client = client;
    }


    /**
     * 在path路径下新增节点及数据
     *
     * @param path 对应节点
     * @param data 要写入的数据
     */
    public static void create(String path, String data) throws Exception {
        client.create().creatingParentsIfNeeded().forPath(path, data.getBytes());
    }

    /**
     * 在path路径下新增临时节点及数据
     * 当客户端断开连接时，znode将被删除。
     *
     * @param path
     * @param data
     * @throws Exception
     */
    public static void createTemporaryNode(String path, String data) throws Exception {
        client.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).forPath(path, data.getBytes());
    }

    /**
     * 删除path路径下的节点
     *
     * @param path 目标节点
     */
    public static void delete(String path) throws Exception {
        client.delete().forPath(path);
    }

    /**
     * 删除一个节点，并递归删除其所有子节点
     *
     * @param path 目标节点
     * @throws Exception
     */
    public static void deleteAll(String path) throws Exception {
        client.delete().deletingChildrenIfNeeded().forPath(path);
    }

    /**
     * 获取path路径下的节点数据
     *
     * @param path 目标节点
     */
    public static String getData(String path) throws Exception {
        byte[] res = client.getData().forPath(path);
        return new String(res);
    }

    /**
     * 设置path路径下的节点数据
     *
     * @param path 目标节点
     * @param data 数据
     * @throws Exception
     */
    public static void setData(String path, byte[] data) throws Exception {
        client.setData().forPath(path, data);
    }

    /**
     * 设置path路径下的节点数据
     *
     * @param path 目标节点
     */
    public static void setData(String path, String data) throws Exception {
        client.setData().forPath(path, data.getBytes());
    }


    /**
     * path 路径下节点是否存在
     *
     * @param path 目标节点
     * @return stat是对znode节点的一个映射，stat=null表示节点不存在
     * @throws Exception
     */
    public static Stat checkExists(String path) throws Exception {
        return client.checkExists().forPath(path);
    }

    /**
     * 获取子节点
     *
     * @param path 目标节点
     */
    public static List<String> getChildren(String path) throws Exception {
        return client.getChildren().forPath(path);
    }


    /**
     * 关闭客户端的连接
     */
    public static void close() {
        client.close();
    }
}

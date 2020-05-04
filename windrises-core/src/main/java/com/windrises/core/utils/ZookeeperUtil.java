package com.windrises.core.utils;


import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/5/4 9:29
 */
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
     * @param path
     * @param data
     */
    public static void create(String path, byte[] data) throws Exception {
        String res = client.create().creatingParentsIfNeeded().forPath(path, data);
    }

    /**
     * 删除path路径下的节点
     *
     * @param path
     */
    public static void delete(String path) throws Exception {
        client.delete().forPath(path);
    }

    /**
     * 获取path路径下的节点数据
     *
     * @param path
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
     * @param path
     */
    public static void setData(String path, String data) throws Exception {
        client.setData().forPath(path, data.getBytes());
    }

    /**
     * path 路径下节点是否存在
     *
     * @param path stat是对znode节点的一个映射，stat=null表示节点不存在
     */
    public static Stat checkExists(String path) throws Exception {
        Stat res = client.checkExists().forPath(path);
        return res;
    }

    /**
     * 获取子节点
     *
     * @param path
     */
    public static List<String> getChildren(String path) throws Exception {
        List<String> pathList = client.getChildren().forPath(path);
        return pathList;
    }

    /**
     * 关闭客户端的连接
     */
    public static void close() {
        client.close();
    }


}

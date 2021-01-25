package com.windrises.core.utils;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.utils.ZKPaths;
import org.apache.zookeeper.ZKUtil;
import org.apache.zookeeper.data.Stat;

import java.util.List;

/**
 * 基于Apache Curator的zk连接工具
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/5/3 21:48
 */
public class CuratorCurd<T> {
    /**
     * 设置重置策略       重试策略：初试时间为2s 重试10次
     */
    private final RetryPolicy retryPolicy = new ExponentialBackoffRetry(2000, 10);

    /**
     * 设置连接的字符串
     */
    private static final String CONNE_STRING = "106.12.150.214:2181";

    /**
     * 工厂创建客户端
     */
    CuratorFramework client = CuratorFrameworkFactory.newClient(CONNE_STRING, retryPolicy);

    /**
     * 工厂创建客户端的另一种方式
     */
    CuratorFramework client2 = CuratorFrameworkFactory
            .builder()
            .connectString(CONNE_STRING)
            .connectionTimeoutMs(3000)
            .retryPolicy(retryPolicy)
            .sessionTimeoutMs(3000)
            .canBeReadOnly(false)
            .defaultData(null)
            .build();

    /**
     * 开启客户端
     */
    public CuratorCurd() {
        client.start();
    }

    /**
     * 在path路径下新增节点及数据
     *
     * @param path
     * @param data
     */
    public void create(String path, byte[] data) throws Exception {
        String res = client.create().creatingParentsIfNeeded().forPath(path, data);
    }

    /**
     * 删除path路径下的节点
     *
     * @param path
     */
    public void delete(String path) throws Exception {
        client.delete().forPath(path);
    }

    /**
     * 获取path路径下的节点数据
     *
     * @param path
     */
    public String getData(String path) throws Exception {
        byte[] res = client.getData().forPath(path);
        return new String(res);
    }

    /**
     * 设置path路径下的节点数据
     *
     * @param path
     */
    public void setData(String path, byte[] data) throws Exception {
        client.setData().forPath(path, data);
    }

    /**
     * path 路径下节点是否存在
     *
     * @param path stat是对znode节点的一个映射，stat=null表示节点不存在
     */
    public Stat checkExists(String path) throws Exception {
        Stat res = client.checkExists().forPath(path);
        return res;
    }

    /**
     * 获取子节点
     *
     * @param path
     */
    public List<String> getChildren(String path) throws Exception {
        List<String> pathList = client.getChildren().forPath(path);
        return pathList;
    }

    /**
     * 关闭客户端的连接
     */
    public void close() {
        client.close();
    }


    public static void main(String[] args) throws Exception {
        String path = "/root";
        CuratorCurd curatorCrud = new CuratorCurd();
        if (null != curatorCrud.checkExists(path)) {
            curatorCrud.delete(path);
            System.out.println("---删除---");
        }
        /*递归创建 可以支持赋值*/
        curatorCrud.create(path + "/bbb" + "/ccc", "hi".getBytes());
        /*获取path下面的节点*/
        List<String> list = curatorCrud.getChildren("/");
        for (String chipath : list) {
            System.out.println(chipath);
        }
        curatorCrud.setData(path, "hello".getBytes());
        System.out.println(new String(curatorCrud.getData(path)));
        //ZKPaths
    }

}

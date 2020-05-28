package com.windrises.system;

import com.windrises.core.utils.MonitoringTools;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/5/7 17:07
 */
@Component
public class SystemStartUp implements CommandLineRunner {


    private final RocketMQTemplate rocketMQTemplate;

    public SystemStartUp(RocketMQTemplate rocketMQTemplate) {
        this.rocketMQTemplate = rocketMQTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        /*zk监听/ramzes  节点  */
        //MonitoringTools.treeCache("/ramzes");
    }
}

package com.windrises.system;

import com.windrises.core.utils.MonitoringTools;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/5/7 17:07
 */
@Component
public class SystemStartUp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        MonitoringTools.treeCache("/ramzes");
    }
}

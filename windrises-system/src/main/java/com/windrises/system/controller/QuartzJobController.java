package com.windrises.system.controller;

import com.windrises.core.entity.parm.ZkParms;
import com.windrises.core.entity.po.QuartzJob;
import com.windrises.core.entity.vo.Result;
import com.windrises.core.utils.ZookeeperUtil;
import com.windrises.quartz.entity.form.QuartzJobForm;
import com.windrises.quartz.service.IQuartzJobService;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.data.Stat;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 14:25
 */
@Slf4j
@RestController
@RequestMapping("/quartzJob")
public class QuartzJobController {

    @Autowired
    private IQuartzJobService quartzJobService;

    @PostMapping("/insert")
    public Result insert(@Valid @RequestBody QuartzJobForm quartzJobForm) {
        QuartzJob quartzJob = quartzJobForm.toPo(QuartzJob.class);
        quartzJobService.insertSelective(quartzJob);
        return Result.success();
    }

    @PostMapping("/update")
    public Result update(@Valid @RequestBody QuartzJobForm quartzJobForm) {
        QuartzJob quartzJob = quartzJobForm.toPo(QuartzJob.class);
        quartzJobService.insertSelective(quartzJob);
        return Result.success();
    }

    /**************************************************************************************/

    @PostMapping("/deleteNode")
    public Result deleteNode(@RequestBody ZkParms zkParms) throws Exception {
        ZookeeperUtil.delete(zkParms.getPath());
        return Result.success("zk删除节点成功");
    }

    @PostMapping("/deleteAll")
    public Result deleteAll(@RequestBody ZkParms zkParms) throws Exception {
        ZookeeperUtil.deleteAll(zkParms.getPath());
        return Result.success("zk递归删除节点成功");
    }

    @PostMapping("/getData")
    public Result getData(@RequestBody ZkParms zkParms) throws Exception {
        String data = ZookeeperUtil.getData(zkParms.getPath());
        return Result.success(data);
    }

    @PostMapping("/createNode")
    public Result createNode(@RequestBody ZkParms zkParms) throws Exception {
        ZookeeperUtil.create(zkParms.getPath(), zkParms.getData());
        return Result.success("zk创建节点成功");
    }

    @PostMapping("/setData")
    public Result setData(@RequestBody ZkParms zkParms) throws Exception {
        ZookeeperUtil.setData(zkParms.getPath(), zkParms.getData());
        return Result.success("zk节点写入数据成功");
    }

    @PostMapping("/checkExists")
    public Result checkExists(@RequestBody ZkParms zkParms) throws Exception {
        Stat stat = ZookeeperUtil.checkExists(zkParms.getPath());
        return Result.success(stat);
    }

    @PostMapping("/getChildren")
    public Result getChildren(@RequestBody ZkParms zkParms) throws Exception {
        List<String> children = ZookeeperUtil.getChildren(zkParms.getPath());
        return Result.success(children);
    }

}

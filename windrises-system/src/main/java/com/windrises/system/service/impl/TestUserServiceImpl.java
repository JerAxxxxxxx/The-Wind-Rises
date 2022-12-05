package com.windrises.system.service.impl;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import com.windrises.core.entity.po.TestUser;
import com.windrises.core.mapper.TestUserMapper;
import com.windrises.system.event.TestOneEvent;
import com.windrises.system.service.ITestUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.EventPublishingRunListener;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:41
 */
@Slf4j
@Service
public class TestUserServiceImpl implements ITestUserService {

    private final TestUserMapper testUserMapper;

    ThreadFactory springFactory = new CustomizableThreadFactory("spring-pool-");

    ExecutorService exec = new ThreadPoolExecutor(8, 16,
            0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(500), springFactory);

    private final ApplicationEventPublisher publisher;

    public TestUserServiceImpl(/*AsyncTest test,*/ TestUserMapper testUserMapper,
                                                   ApplicationEventPublisher publisher) {
        //this.test = test;
        this.testUserMapper = testUserMapper;
        this.publisher = publisher;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return testUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TestUser record) {
        return testUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TestUser record) {
        return testUserMapper.insertSelective(record);
    }

    @Override
    public TestUser selectByPrimaryKey(String id) {
        return testUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TestUser record) {
        return testUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TestUser record) {
        return testUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TestUser> getAll() {
        String test = testUserMapper.getAll().stream()
                .filter(testUser -> "123".equals(testUser.getRole()))
                .map(TestUser::getRole)
                .collect(Collectors.toList())
                .stream()
                .reduce((a, b) -> a + "???" + b)
                .orElse("无数据");
        log.info(test);
        TestOneEvent testOneEvent = new TestOneEvent(this);
        testOneEvent.setMessage("111");
        publisher.publishEvent(testOneEvent);
        return testUserMapper.getAll();
    }


    @EventListener(value = TestOneEvent.class)
    public void testListener(TestOneEvent testOneEvent) {
        String message = testOneEvent.getMessage();
        log.info(message);
    }
}

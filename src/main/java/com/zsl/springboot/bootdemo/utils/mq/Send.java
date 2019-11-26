package com.zsl.springboot.bootdemo.utils.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Send {

    @Resource
    private AmqpTemplate amqpTemplate;

    /**
     * 发送者发送
     */
    public void send(){
        amqpTemplate.convertAndSend("zsl_queue","Hello world");
    }
}

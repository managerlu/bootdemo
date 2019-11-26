package com.zsl.springboot.bootdemo.utils.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "zsl_queue")
public class Receiver {
    @RabbitHandler
    public void receive(String msg){
        System.out.println("receive msg : " + msg);
    }

}

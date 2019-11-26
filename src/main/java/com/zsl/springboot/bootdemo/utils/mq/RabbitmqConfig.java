package com.zsl.springboot.bootdemo.utils.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {
    /**
     * 配置队列
     * @return
     */
    @Bean
    public Queue queue(){
        return new Queue("zsl_queue");
    }

}

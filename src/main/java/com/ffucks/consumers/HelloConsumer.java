package com.ffucks.consumers;

import com.ffucks.configs.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloConsumer {

    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void receive(String message) {
        System.out.println("RECEIVED: " + message);
    }
}

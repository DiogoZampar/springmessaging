package br.com.diogozampar.springmessaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;







@Service
public class HelloWorldConsumer {
    

    @KafkaListener(topics = "helloWorld-topic", groupId = "group-1")
    public void receiveMessage(String message){


        
        System.out.println("Consumer received message: " + message);

    }



}

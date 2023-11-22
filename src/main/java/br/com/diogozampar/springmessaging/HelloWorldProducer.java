package br.com.diogozampar.springmessaging;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;





@Service
public class HelloWorldProducer {

    private KafkaTemplate<String, String> kafkaTemplate;


    public HelloWorldProducer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(String message){
        kafkaTemplate.send("helloWorld-topic", message);
    }

}

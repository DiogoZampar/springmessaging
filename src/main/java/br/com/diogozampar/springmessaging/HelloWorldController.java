package br.com.diogozampar.springmessaging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/kafka")
public class HelloWorldController {
    private HelloWorldProducer producer;


    public HelloWorldController(HelloWorldProducer producer){
        this.producer = producer;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        producer.sendMessage("Hello " + name + ".");
        return "OK";
    }

}

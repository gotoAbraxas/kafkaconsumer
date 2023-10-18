package com.example.demo.kafka;


import com.example.demo.domain.request.TestRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class testConsumer {


    @KafkaListener(topics = TopicConfig.testTopic)
    public void listen(TestRequest testRequest){
        System.out.println(testRequest);
    }
}

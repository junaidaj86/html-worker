package com.nexer.htmlfileworker.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.nexer.opera.schema.avro.CloudEventData;

@Service
public class HTMLWorker {

    @KafkaListener(topics = "html_topic", groupId = "group_id")
    public void consume( CloudEventData payload ){
        System.out.println("Received message: "+ payload.toString());
    }


}

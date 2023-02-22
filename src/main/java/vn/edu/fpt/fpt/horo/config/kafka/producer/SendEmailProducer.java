package vn.edu.fpt.fpt.horo.config.kafka.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import vn.edu.fpt.fpt.horo.dto.event.SendEmailEvent;


import java.util.UUID;


/**
 * vn.edu.fpt.fpt.horo.config.kafka.producer
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@Service
@Slf4j
public class SendEmailProducer extends Producer{

    private static final String TOPIC = "flab.notification.send_email";
    private ObjectMapper objectMapper;

    @Autowired
    public SendEmailProducer(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        super(kafkaTemplate);
        this.objectMapper = objectMapper;
    }

    public void sendMessage(SendEmailEvent event) {
        try {
            String value = objectMapper.writeValueAsString(event);
            super.sendMessage(TOPIC, UUID.randomUUID().toString(), value);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}

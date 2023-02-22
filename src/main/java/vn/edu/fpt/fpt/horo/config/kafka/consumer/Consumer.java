package vn.edu.fpt.fpt.horo.config.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;

/**
 * vn.edu.fpt.fpt.horo.config.kafka.consumer
 *
 * @author : Portgas.D.Ace
 * @created : 22/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@Slf4j
public abstract class Consumer {

    protected void listen(String value,
                          @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                          @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key) {
        log.info("Listen data: value:{} received_topic:{} received_message_key:{}", value, topic, key);
    }
}

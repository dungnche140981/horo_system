package vn.edu.fpt.fpt.horo.config.kafka.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import vn.edu.fpt.fpt.horo.dto.event.CreateProfileEvent;
import vn.edu.fpt.fpt.horo.exception.BusinessException;
import vn.edu.fpt.fpt.horo.service.ProfileService;

/**
 * vn.edu.fpt.fpt.horo.config.kafka.consumer
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@Service
@RequiredArgsConstructor
public class CreateAccountConsumer extends Consumer{

    private final ProfileService profileService;
    private final ObjectMapper objectMapper;

    @Override
    @KafkaListener(id = "createProfileConsumer", topics = "flab.profile.create-profile", groupId = "profile_group")
    protected void listen(String value, String topic, String key) {
        super.listen(value, topic, key);
        try {
            CreateProfileEvent event = objectMapper.readValue(value, CreateProfileEvent.class);
            profileService.createProfile(event);
        }catch (Exception ex){
            throw new BusinessException("Can't create profile from event");
        }

    }
}

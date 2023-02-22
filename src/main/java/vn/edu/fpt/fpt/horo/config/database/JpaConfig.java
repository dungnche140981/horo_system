package vn.edu.fpt.fpt.horo.config.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import vn.edu.fpt.fpt.horo.security.auditor.SecurityAuditorAware;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * vn.edu.fpt.fpt.horo.config.database
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@Configuration
@EnableMongoAuditing(
        auditorAwareRef = "auditorAware",
        dateTimeProviderRef = "utcDateTimeProvider"
)

public class JpaConfig {
    @Bean
    public AuditorAware<String> auditorAware(){
        return new SecurityAuditorAware();
    }

    @Bean
    public DateTimeProvider utcDateTimeProvider() {
        return () -> Optional.of(LocalDateTime.now());
    }
}

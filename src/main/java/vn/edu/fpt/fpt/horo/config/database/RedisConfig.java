package vn.edu.fpt.fpt.horo.config.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

/**
 * vn.edu.fpt.fpt.horo.config.database
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@Configuration
public class RedisConfig {
    @Value("${spring.redis.host}")
    private String hostname;
    @Value("${spring.redis.port}")
    private Integer port;
    @Value("${spring.redis.username}")
    private String username;
    @Value("${spring.redis.password}")
    private String password;

//    @Bean
//    JedisConnectionFactory jedisConnectionFactory() {
//        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
//        redisStandaloneConfiguration.setHostName(hostname);
//        redisStandaloneConfiguration.setPort(port);
//        redisStandaloneConfiguration.setUsername(username);
//        redisStandaloneConfiguration.setPassword(password);
//        return new JedisConnectionFactory(redisStandaloneConfiguration);
//    }

//    @Bean
//    public RedisTemplate<String, Object> redisTemplate() {
//        final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
//        template.setConnectionFactory(jedisConnectionFactory());
//        template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
//        return template;
//    }
}

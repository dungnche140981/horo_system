package vn.edu.fpt.fpt.horo.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "displayMessage")
public interface DisplayMessageService {
    @Cacheable
    String getDisplayMessage(String code);


    @Cacheable
    String getDisplayMessage(String code, String language);

}

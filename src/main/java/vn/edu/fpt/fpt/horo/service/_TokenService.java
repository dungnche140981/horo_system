package vn.edu.fpt.fpt.horo.service;

import org.springframework.security.core.Authentication;

import java.util.Optional;

public interface _TokenService {

    Optional<Authentication> getAuthenticationFromToken(String token);

}

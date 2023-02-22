package vn.edu.fpt.fpt.horo.security.auditor;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;
/**
 * vn.edu.fpt.fpt.horo.security.auditor
 *
 * @author : Portgas.D.Ace
 * @created : 18/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

public class SecurityAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.ofNullable(SecurityContextHolder.getContext())
                .map(SecurityContext::getAuthentication)
                .filter(Authentication::isAuthenticated)
                .map(Authentication::getPrincipal)
                .map(User.class::cast)
                .map(User::getUsername);
    }
}

package org.redlion.jacoss.domain.auditing;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * Created by alejandro on 4/5/16.
 */
public class UsernameAuditorAware implements AuditorAware<String> {
    @Override
    public String getCurrentAuditor() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if(authentication == null || !authentication.isAuthenticated()) {
            return null;
        }

        return ((User)authentication.getPrincipal()).getUsername();
    }
}

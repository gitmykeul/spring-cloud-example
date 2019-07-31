package gitmykeul.samples;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.io.Serializable;

//@RefreshScope
@Service
public class CustomPermissionEvaluator implements PermissionEvaluator {


    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        System.out.println("CustomPermissionEvaluator called");
        return true;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        System.out.println("CustomPermissionEvaluator called");
        return false;
    }
}
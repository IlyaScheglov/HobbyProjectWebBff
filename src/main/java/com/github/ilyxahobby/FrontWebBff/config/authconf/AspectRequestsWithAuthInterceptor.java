package com.github.ilyxahobby.FrontWebBff.config.authconf;

import com.github.ilyxahobby.FrontWebBff.config.authconf.feign.AuthFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.UUID;

@Aspect
@Component
@RequiredArgsConstructor
public class AspectRequestsWithAuthInterceptor {

    private static final String AUTH_HEADER_NAME = "Authorization";

    private final AuthFeignClient authFeignClient;

    @Before("@annotation(com.github.ilyxahobby.FrontWebBff.config.authconf.NeedAuth)")
    @SneakyThrows
    public void authInterceptorRealization(JoinPoint joinPoint) {
        String jwt = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest().getHeader(AUTH_HEADER_NAME);
        UUID userId = authFeignClient.tryDoRequest(jwt);

        if (userId == null) {
            throw new RuntimeException("401 not authorized");
        }

        AbstractControllerWithAuth controller = (AbstractControllerWithAuth) joinPoint.getTarget();
        controller.setUserId(userId);
    }
}

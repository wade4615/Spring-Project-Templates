package com.wade.spring.boot.annotations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;

import com.wade.spring.boot.annotations.controllers.HealthCheckController;

@Configuration
public class WebApplicationSpecificConfiguration {

    @ConditionalOnWebApplication
    HealthCheckController healthCheckController() {
        return new HealthCheckController();
    }
}

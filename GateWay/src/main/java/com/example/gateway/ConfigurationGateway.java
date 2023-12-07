package com.example.gateway;

import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;

@Configuration
public class ConfigurationGateway {
//    @Bean
//    RouteLocator routes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/clients/**").uri("lb://SERVICE-CLIENT"))
//                .build();
//    }

    @Bean
    DiscoveryClientRouteDefinitionLocator routesDynamique(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp){
        return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
    }


}

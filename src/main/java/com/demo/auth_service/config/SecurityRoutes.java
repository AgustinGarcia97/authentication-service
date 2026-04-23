package com.demo.auth_service.config;

public class SecurityRoutes {

    private SecurityRoutes() {}

    private static final  String[] PUBLIC_ROUTES = {
            "/api/v1/auth/register",
            "/api/v1/auth/login",
            "/api/v1/auth/refresh-token",
    };

    private static final  String[] PRIVATE_ROUTES = {
            "/api/v1/auth/**",
    };
}

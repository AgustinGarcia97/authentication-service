package com.demo.auth_service.config;



public class SecurityRoutes {

    private SecurityRoutes() {}

    public static final  String[] PUBLIC_ROUTES = {
            "/api/v1/auth/register",
            "/api/v1/auth/login",
            "/api/v1/auth/refresh-token",
            "/swagger-ui/**",
            "/swagger-ui.html",
            "/v3/api-docs/**"

    };

    public static final  String[] ADMIN_ROUTES = {
            "/api/v1/admin/**",
    };
}

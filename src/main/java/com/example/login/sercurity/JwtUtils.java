package com.example.login.sercurity;

import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class JwtUtils {

//    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    private String jwtSecret;

    private String jwtExpirationMs;

    public String generateJwtToken(Authentication authentication){


        return null;
    }
}

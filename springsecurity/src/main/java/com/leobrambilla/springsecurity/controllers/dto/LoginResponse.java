package com.leobrambilla.springsecurity.controllers.dto;

public record LoginResponse (String accessToken, Long expiresIn){
}

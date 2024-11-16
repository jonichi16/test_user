package com.jonichi.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public record RegisterRequest(
        String name,

        String email,

        String password
) {}
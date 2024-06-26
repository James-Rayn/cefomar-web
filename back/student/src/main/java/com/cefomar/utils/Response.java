package com.cefomar.utils;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Response {
    private LocalDateTime timeStamp;
    private HttpStatus status;
    private int statusCode;
    private Map<?, ?> data;
    private URI locations;
    private String message;

}

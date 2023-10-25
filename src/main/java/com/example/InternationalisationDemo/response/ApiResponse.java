package com.example.InternationalisationDemo.response;

import org.springframework.http.HttpStatus;

public record ApiResponse(String message, HttpStatus status) { }


package com.example.InternationalisationDemo.error;

import org.springframework.http.HttpStatus;

public record ApiError(String message, HttpStatus status) { }


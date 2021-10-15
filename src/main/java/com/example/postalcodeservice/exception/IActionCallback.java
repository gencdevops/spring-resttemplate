package com.example.postalcodeservice.exception;

@FunctionalInterface
public interface IActionCallback {
    void run() throws Exception;
}
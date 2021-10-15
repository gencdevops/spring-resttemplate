package com.example.postalcodeservice.exception;

@FunctionalInterface
public interface ISupplierCallback<R> {
    R get() throws Exception;
}
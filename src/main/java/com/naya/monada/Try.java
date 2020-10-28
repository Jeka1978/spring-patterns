package com.naya.monada;

import lombok.SneakyThrows;

import java.util.function.Function;

/**
 * @author Evgeny Borisov
 */
public class Try<T> {

    private ValueSupplier<T> supplier;
    private ExceptionHandler exceptionHandler;
    private T t;

    public Try(ValueSupplier<T> supplier) {
        this.supplier = supplier;
    }

    public static <T> Try<T> of(ValueSupplier<T> supplier) {
        return new Try<T>(supplier);
    }



    public Try<T> onFailure(ExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
        return this;
    }

    @SneakyThrows
    public T get() {
        try {
            return supplier.get();
        } catch (Exception e) {
            if (exceptionHandler != null) {
                exceptionHandler.onException();
            }
            throw e;
        }
    }
}




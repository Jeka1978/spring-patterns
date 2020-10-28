package com.naya.monada;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface ExceptionHandler {
    void onException();
}

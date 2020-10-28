package com.naya.monada;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface ValueSupplier<T> {
     T get() throws Exception;
}

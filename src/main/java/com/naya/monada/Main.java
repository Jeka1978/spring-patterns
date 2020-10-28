package com.naya.monada;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(123);

        Integer a = Try.of(() -> {
            if (true) {

                return 12;
            } else {
                throw new Exception("bla");
            }
        }).onFailure(() -> System.out.println("все козлы")).get();

        System.out.println("a = " + a);
    }
}

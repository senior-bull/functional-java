package com.bull.examples.vavr.basic;

import io.vavr.control.Option;

public class OptionExample {

    public static void main(String[] args) {

        // Iterate
        for (var a : Option.of("ABC")) {
            System.out.println(a);
        }


    }
}

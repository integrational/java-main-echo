package org.integrational.echo;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class Main {
    public static void main(String[] args) {
        System.out.println(stream(args).map(s -> s + " ").collect(joining()));
    }
}

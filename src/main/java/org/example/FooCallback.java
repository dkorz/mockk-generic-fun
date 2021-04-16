package org.example;

@FunctionalInterface
public interface FooCallback<T, X extends Exception> {
    T withString(String s) throws X;
}

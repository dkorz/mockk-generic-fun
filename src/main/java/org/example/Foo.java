package org.example;

public class Foo {
    private final String s;

    public Foo(String s) { this.s = s; }

    public <R, X extends Exception> R withString(FooCallback<R, X> callback) throws X {
        return callback.withString(s);
    }
}

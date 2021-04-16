package org.example

class FooCaller(private val foo: Foo) {

    fun stringLength(): Int =
        foo.withString<Int, Exception> { s ->
            println("s=$s")
            s.length
        }

    fun echoString(): String =
        foo.withString<String, Exception> { s ->
            println("s=$s")
            s
        }
}

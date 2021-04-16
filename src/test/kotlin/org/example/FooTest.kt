package org.example

import io.kotlintest.shouldBe
import io.mockk.every
import io.mockk.mockkClass
import io.mockk.slot
import org.junit.jupiter.api.Test

class FooTest {
    @Test
    fun `show failure`() {
        val mockFoo = mockkClass(Foo::class)

        val s = "test string"

        val callback = slot<(s: String) -> Int>()
        every {
            mockFoo.withString<Int, Exception>(capture(callback))
//            mockFoo.withString<Int, Exception>(captureLambda<(String) -> Int>())
        } answers {
            callback.captured.invoke(s)
//            lambda<(String) -> Int>().captured.invoke(s)
        }

        val fooCaller = FooCaller(mockFoo)
        val len = fooCaller.stringLength()
        len.shouldBe(s.length)

    }

}

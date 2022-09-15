import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LateInitSampleTest {

    lateinit var testObject: TestObject

    @BeforeEach
    fun setUp() {
        testObject = TestObject()
    }

    @Test
    fun test() {
        assertEquals("lateinit sample!", testObject.getMessage())
    }


}

class TestObject {
    fun getMessage(): String {
        return "lateinit sample!"
    }
}
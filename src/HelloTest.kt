import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HelloTest {
    @Test
    fun helloWorld() {
        assertEquals("Hello World", Hello().helloWorld())
    }

}
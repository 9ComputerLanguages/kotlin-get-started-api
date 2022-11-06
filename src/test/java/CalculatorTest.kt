import org.junit.Assert.assertEquals
import org.junit.Test
//import kotlin.test.Test
//import kotlin.test.assertEquals

internal class CalculatorTest {
    @Test
    fun sum() {
        assertEquals(Calculator().sum(1, 2), 3)
    }
}
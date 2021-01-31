package parts.wisdom.examples.intexpr

import me.joypri.of
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntExprTest {

    private val two = Const(C of 2)
    private val three = Const(C of 3)
    private val five = Const(C of 5)
    private val six = Const(C of 6)

    @Test
    fun testConst() {
        assertEquals(5, five.eval())
    }

    @Test
    fun testPlus() {
        assertEquals(
            5,
            Plus(
                X of two,
                Y of three
            ).eval()
        )
    }

    @Test
    fun testTimes() {
        assertEquals(
            6,
            Times(
                X of two,
                Y of three
            ).eval()
        )
    }
}
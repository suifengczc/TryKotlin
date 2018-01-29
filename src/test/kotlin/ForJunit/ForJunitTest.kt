package ForJunit

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class ForJunitTest {
    private var kt: ForJunit? = null
    @Before
    fun setUp() {
        kt = ForJunit()
    }

    @Test
    fun transferNumZero() {
        assertEquals("0", kt!!.transferNum(0))
    }

    @Test
    fun transferNum1() {
        assertEquals("1万", kt!!.transferNum(11000))
    }
}
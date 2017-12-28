package Problems

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import java.util.*

class IndexOfMaxKtTest {

    @Before
    fun setUp() {
    }

    @Test
    fun indexOfMax() {
    }

    @Test fun testIndexOfMaximum1() {
        test(0, 0)
    }

    fun test(expected: Int?, vararg data: Int) {
        assertEquals(expected, Examples.Problems.indexOfMax(data), "\ndata = ${Arrays.toString(data)}")
    }
}
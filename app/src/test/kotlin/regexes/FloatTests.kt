package regexes

import detectors.FloatDetector
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class FloatTests {
    @Test
    fun floatingPointTests() {

        val detector = FloatDetector()

        assertTrue(detector.test("1.0"))
        assertTrue(detector.test("123.34"))
        assertTrue(detector.test("0.20000"))
        assertTrue(detector.test(".123"))

        assertFalse(detector.test("123"))
        assertFalse(detector.test("123.123."))
        assertFalse(detector.test("123.02a"))
        assertFalse(detector.test("123."))
        assertFalse(detector.test("012.4"))
    }
}
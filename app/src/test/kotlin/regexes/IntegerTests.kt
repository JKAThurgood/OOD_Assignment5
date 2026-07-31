package regexes

import detectors.IntegerDetector
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IntegerTests {

    @Test
    fun validAndInvalidIntegers() {
        val detector = IntegerDetector()

        // Valid integers
        assertTrue(detector.test("1"))
        assertTrue(detector.test("1023456789"))
        assertTrue(detector.test("999999999"))

        // Invalid integers
        assertFalse(detector.test(""))
        assertFalse(detector.test("1asdfasdf"))
        assertFalse(detector.test("a12341234"))
        assertFalse(detector.test("012341234"))
        assertFalse(detector.test("0"))
    }
}
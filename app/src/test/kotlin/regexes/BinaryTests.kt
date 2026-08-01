package regexes

import detectors.BinaryDetector
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BinaryTests {

    @Test
    fun binaryTests() {

        val detector = BinaryDetector()

        // Valid
        assertTrue(detector.test("1"))
        assertTrue(detector.test("11"))
        assertTrue(detector.test("101"))
        assertTrue(detector.test("111111"))
        assertTrue(detector.test("10011010001"))

        // Invalid
        assertFalse(detector.test("01"))
        assertFalse(detector.test("10"))
        assertFalse(detector.test("1050010"))
        assertFalse(detector.test("1000010"))
        assertFalse(detector.test("100a01"))
        assertFalse(detector.test(""))
    }
}
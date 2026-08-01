package regexes

import detectors.EmailDetector
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EmailTests {

    @Test
    fun emailTests() {

        val detector = EmailDetector()

        // Valid
        assertTrue(detector.test("a@b.c"))
        assertTrue(detector.test("joseph.ditton@usu.edu"))
        assertTrue(detector.test("{}*$.&$*(@*$%&.*&*"))

        // Invalid
        assertFalse(detector.test("@b.c"))
        assertFalse(detector.test("a@b@c.com"))
        assertFalse(detector.test("a.b@b.b.c"))
        assertFalse(detector.test("joseph ditton@usu.edu"))
        assertFalse(detector.test("joseph ditton@usu .edu"))
        assertFalse(detector.test("joseph.ditton@usu .edu"))
        assertFalse(detector.test("joseph.ditton@usu. edu"))
        assertFalse(detector.test("a@b."))
        assertFalse(detector.test("a@.c"))
        assertFalse(detector.test(""))
    }
}
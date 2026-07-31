package regexes

import detectors.PasswordDetector
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PasswordTests {

    @Test
    fun passwordTests() {

        val detector = PasswordDetector()

        assertTrue(detector.test("aaaaH!aa"))
        assertTrue(detector.test("1234567*9J"))
        assertTrue(detector.test("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))

        assertFalse(detector.test("a"))
        assertFalse(detector.test("aaaaaaa!"))
        assertFalse(detector.test("aaaHaaaaa"))
        assertFalse(detector.test("Abbbbbbb!"))
    }
}
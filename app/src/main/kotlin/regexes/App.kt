package regexes

import detectors.IntegerDetector

fun main() {
    val detector = IntegerDetector()

    println(detector.test("1"))
    println(detector.test("112341234"))
    println(detector.test("1asdfasdf"))
    println(detector.test("a12341234"))
    println(detector.test("012341234"))
    println(detector.test("0"))
}
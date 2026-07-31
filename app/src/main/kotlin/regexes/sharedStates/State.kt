package sharedStates

abstract class State(
    protected val detector: Detector
) {
    abstract fun consume(character: String)
}
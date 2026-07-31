package sharedStates

import detectors.StateContext

abstract class State(
    protected val context: StateContext
) {
    abstract fun consume(character: String)
}
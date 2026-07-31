package sharedStates

import detectors.StateContext

class Invalid(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {
        // stay invalid
    }
}
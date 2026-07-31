package floatingPoint

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class FloatZeroState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        if (character == ".") {
            context.changeState(FloatDotState(context))
        } else {
            context.changeState(Invalid(context))
        }
    }
}
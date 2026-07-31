package floatingPoint

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class FloatDotState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        if (character in "0123456789") {
            context.changeState(FloatFractionState(context))
        } else {
            context.changeState(Invalid(context))
        }
    }
}
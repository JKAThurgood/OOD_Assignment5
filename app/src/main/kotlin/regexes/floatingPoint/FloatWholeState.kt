package floatingPoint

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class FloatWholeState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        when {
            character in "0123456789" ->
                context.changeState(FloatWholeState(context))

            character == "." ->
                context.changeState(FloatDotState(context))

            else ->
                context.changeState(Invalid(context))
        }
    }
}
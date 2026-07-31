package floatingPoint

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class FloatStartState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        when {
            character in "123456789" ->
                context.changeState(FloatWholeState(context))

            character == "0" ->
                context.changeState(FloatZeroState(context))

            character == "." ->
                context.changeState(FloatDotState(context))

            else ->
                context.changeState(Invalid(context))
        }
    }
}
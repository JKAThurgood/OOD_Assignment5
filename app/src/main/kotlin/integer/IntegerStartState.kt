package integer

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class IntegerStartState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        if (character in "123456789") {
            context.changeState(IntegerDigitState(context))
        } else {
            context.changeState(Invalid(context))
        }
    }
}
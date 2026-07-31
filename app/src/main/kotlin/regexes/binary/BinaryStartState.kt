package binary

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class BinaryStartState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        if (character == "1") {
            context.changeState(BinaryLastOneState(context))
        } else {
            context.changeState(Invalid(context))
        }
    }
}
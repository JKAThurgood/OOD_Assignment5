package binary

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class BinaryLastZeroState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        when (character) {
            "1" -> context.changeState(BinaryLastOneState(context))
            "0" -> context.changeState(BinaryLastZeroState(context))
            else -> context.changeState(Invalid(context))
        }
    }
}
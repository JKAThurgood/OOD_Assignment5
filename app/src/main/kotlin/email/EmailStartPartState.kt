package email

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

abstract class EmailStartPartState(
    context: StateContext
) : EmailState(context) {

    protected abstract fun nextFilledState(): State

    override fun consume(character: String) {
        if (isValidPartCharacter(character)) {
            context.changeState(nextFilledState())
        } else {
            invalid()
        }
    }
}
package password

import detectors.StateContext
import sharedStates.State

class PasswordHasBothSafeEndingState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        if (character in "!@#$%&*") {
            context.changeState(
                PasswordHasBothEndingSpecialState(context)
            )
        }
    }
}
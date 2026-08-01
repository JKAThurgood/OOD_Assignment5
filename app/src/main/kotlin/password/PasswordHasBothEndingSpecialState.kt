package password

import detectors.StateContext
import sharedStates.State

class PasswordHasBothEndingSpecialState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        if (character !in "!@#$%&*") {
            context.changeState(
                PasswordHasBothSafeEndingState(context)
            )
        }
    }
}
package password

import detectors.PasswordDetector
import detectors.StateContext
import sharedStates.State

class PasswordInvalidState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        val detector = context as PasswordDetector

        detector.processCharacter(character)

        if (detector.isValidPassword()) {
            context.changeState(PasswordValidState(context))
        }
    }
}
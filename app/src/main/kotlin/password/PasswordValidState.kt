package password

import detectors.PasswordDetector
import detectors.StateContext
import sharedStates.State

class PasswordValidState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        val detector = context as PasswordDetector

        detector.processCharacter(character)

        if (detector.endsWithSpecial) {
            context.changeState(PasswordEndingSpecialState(context))
        }
    }
}
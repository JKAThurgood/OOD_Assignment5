package email

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class EmailPart1StartState(
    context: StateContext
) : EmailState(context) {

    override fun consume(character: String) {

        if (isValidPartCharacter(character)) {
            context.changeState(EmailPart1State(context))
        } else {
            context.changeState(Invalid(context))
        }
    }
}
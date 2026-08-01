package email

import detectors.StateContext
import sharedStates.Invalid

class EmailPart3State(
    context: StateContext
) : EmailState(context) {

    override fun consume(character: String) {

        if (!isValidPartCharacter(character)) {
            invalid()
        }
    }
}
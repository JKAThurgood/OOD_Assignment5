package email

import detectors.StateContext
import sharedStates.Invalid

class EmailPart2State(
    context: StateContext
) : EmailState(context) {

    override fun consume(character: String) {

        when {
            character == "." ->
                context.changeState(
                    EmailPart3StartState(context)
                )

            isValidPartCharacter(character) -> {
                // stay in Part2
            }

            else ->
                context.changeState(
                    Invalid(context)
                )
        }
    }
}
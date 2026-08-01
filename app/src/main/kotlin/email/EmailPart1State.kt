package email

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class EmailPart1State(
    context: StateContext
) : EmailState(context) {

    override fun consume(character: String) {

        when {
            character == "@" ->
                context.changeState(
                    EmailPart2StartState(context)
                )

            character == "." -> {
                // stay in Part1
            }


            isValidPartCharacter(character) -> {
                // stay in Part1
            }

            else ->
                invalid()
        }
    }
}
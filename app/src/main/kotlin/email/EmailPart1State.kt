package email

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class EmailPart1State(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        when {
            character == "@" ->
                context.changeState(EmailPart2State(context))

            character == " " ->
                context.changeState(Invalid(context))

            else ->
                context.changeState(EmailPart1State(context))
        }
    }
}
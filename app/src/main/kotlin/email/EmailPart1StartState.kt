package email

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class EmailPart1StartState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        when {
            character == " " ->
                context.changeState(Invalid(context))

            character == "@" ->
                context.changeState(Invalid(context))

            else ->
                context.changeState(EmailPart1State(context))
        }
    }
}
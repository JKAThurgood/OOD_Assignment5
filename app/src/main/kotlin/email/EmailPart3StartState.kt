package email

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

class EmailPart3StartState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        when {
            character == " " ->
                context.changeState(Invalid(context))

            character == "@" ->
                context.changeState(Invalid(context))

            character == "." ->
                context.changeState(Invalid(context))

            else ->
                context.changeState(EmailPart3State(context))
        }
    }
}
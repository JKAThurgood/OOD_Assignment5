package email

import detectors.StateContext
import sharedStates.Invalid
import sharedStates.State

abstract class EmailState(
    context: StateContext
) : State(context) {
    protected fun invalid() = context.changeState(Invalid(context))
    protected fun isValidPartCharacter(character: String): Boolean {
        return character != " " &&
                character != "@" &&
                character != "."
    }
}
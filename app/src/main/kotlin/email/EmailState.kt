package email

import detectors.StateContext
import sharedStates.State

abstract class EmailState(
    context: StateContext
) : State(context) {

    protected fun isValidPartCharacter(character: String): Boolean {
        return character != " " &&
                character != "@" &&
                character != "."
    }
}
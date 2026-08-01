package password

import detectors.StateContext
import sharedStates.State

class PasswordMissingBothState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        val upper = character[0].isUpperCase()
        val special = character in "!@#$%&*"

        when {
            upper && special ->
                context.changeState(
                    PasswordHasBothEndingSpecialState(context)
                )

            upper ->
                context.changeState(
                    PasswordHasUpperState(context)
                )

            special ->
                context.changeState(
                    PasswordHasSpecialEndingSpecialState(context)
                )
        }
    }
}
package password

import detectors.StateContext
import sharedStates.State

class PasswordHasSpecialEndingSpecialState(
    context: StateContext
) : State(context) {

    override fun consume(character: String) {

        val upper = character[0].isUpperCase()
        val special = character in "!@#$%&*"

        when {
            upper ->
                context.changeState(
                    PasswordHasBothSafeEndingState(context)
                )

            !special ->
                context.changeState(
                    PasswordHasSpecialEndingSpecialState(context)
                )
        }
    }
}
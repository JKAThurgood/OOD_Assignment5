package detectors

import password.PasswordInvalidState
import password.PasswordValidState
import sharedStates.State

class PasswordDetector : Detector() {

    var length = 0
    var hasUppercase = false
    var hasSpecial = false
    var endsWithSpecial = false

    override fun createInitialState(): State {
        resetFlags()
        return PasswordInvalidState(this)
    }

    override fun isAcceptingState(state: State): Boolean {
        return state is PasswordValidState
    }

    fun processCharacter(character: String) {

        length++

        if (character[0].isUpperCase()) {
            hasUppercase = true
        }

        if (character in "!@#$%&*") {
            hasSpecial = true
            endsWithSpecial = true
        } else {
            endsWithSpecial = false
        }
    }

    fun isValidPassword(): Boolean {
        return length >= 8 &&
                hasUppercase &&
                hasSpecial &&
                !endsWithSpecial
    }

    private fun resetFlags() {
        length = 0
        hasUppercase = false
        hasSpecial = false
        endsWithSpecial = false
    }
}
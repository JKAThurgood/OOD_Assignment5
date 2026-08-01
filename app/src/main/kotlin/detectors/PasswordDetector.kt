package detectors

import password.PasswordHasBothSafeEndingState
import password.PasswordMissingBothState
import sharedStates.State

class PasswordDetector : Detector() {

    override fun initialState(): State {
        return PasswordMissingBothState(this)
    }

    override fun accepts(state: State): Boolean {
        return state is PasswordHasBothSafeEndingState
    }

    fun passwordTest(input: String): Boolean {
        return input.length >= 8 &&
                test(input)
    }
}
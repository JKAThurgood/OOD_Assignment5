package detectors

import email.EmailPart1StartState
import email.EmailPart3State
import sharedStates.State

class EmailDetector : Detector() {

    override fun createInitialState(): State {
        return EmailPart1StartState(this)
    }

    override fun isAcceptingState(state: State): Boolean {
        return state is EmailPart3State
    }
}
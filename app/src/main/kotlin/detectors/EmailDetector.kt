package detectors

import email.EmailPart0State
import email.EmailPart3State
import sharedStates.State

class EmailDetector : Detector() {

    override fun createInitialState(): State {
        return EmailPart0State(this)
    }

    override fun isAcceptingState(state: State): Boolean {
        return state is EmailPart3State
    }
}
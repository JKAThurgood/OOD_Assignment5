package detectors

import detectors.Detector
import integer.IntegerDigitState
import integer.IntegerStartState
import sharedStates.State

class IntegerDetector : Detector() {

    override fun createInitialState(): State {
        return IntegerStartState(this)
    }

    override fun isAcceptingState(state: State): Boolean {
        return state is IntegerDigitState
    }
}
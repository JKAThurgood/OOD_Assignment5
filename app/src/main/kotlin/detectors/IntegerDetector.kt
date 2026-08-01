package detectors

import detectors.Detector
import integer.IntegerDigitState
import integer.IntegerStartState
import sharedStates.State

class IntegerDetector : Detector() {

    override fun initialState(): State {
        return IntegerStartState(this)
    }

    override fun accepts(state: State): Boolean {
        return state is IntegerDigitState
    }
}
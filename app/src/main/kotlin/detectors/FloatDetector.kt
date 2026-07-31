package detectors

import floatingPoint.FloatStartState
import floatingPoint.FloatFractionState
import sharedStates.State

class FloatDetector : Detector() {

    override fun createInitialState(): State {
        return FloatStartState(this)
    }

    override fun isAcceptingState(state: State): Boolean {
        return state is FloatFractionState
    }
}
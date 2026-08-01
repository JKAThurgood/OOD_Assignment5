package detectors

import floatingPoint.FloatStartState
import floatingPoint.FloatFractionState
import sharedStates.State

class FloatDetector : Detector() {

    override fun initialState(): State {
        return FloatStartState(this)
    }

    override fun accepts(state: State): Boolean {
        return state is FloatFractionState
    }
}
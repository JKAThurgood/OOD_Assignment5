package detectors

import binary.BinaryStartState
import binary.BinaryLastOneState
import sharedStates.State

class BinaryDetector : Detector() {

    override fun initialState(): State {
        return BinaryStartState(this)
    }

    override fun accepts(state: State): Boolean {
        return state is BinaryLastOneState
    }
}
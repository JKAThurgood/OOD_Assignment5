package detectors

import binary.BinaryStartState
import binary.BinaryLastOneState
import sharedStates.State

class BinaryDetector : Detector() {

    override fun createInitialState(): State {
        return BinaryStartState(this)
    }

    override fun isAcceptingState(state: State): Boolean {
        return state is BinaryLastOneState
    }
}
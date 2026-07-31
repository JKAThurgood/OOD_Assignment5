package detectors

import sharedStates.State

interface StateContext {
    fun changeState(state: State)
}
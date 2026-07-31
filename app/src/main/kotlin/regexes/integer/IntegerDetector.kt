package integer

import sharedStates.Detector
import sharedStates.State

class IntegerDetector : Detector {

    private var currentState: State = IntegerStartState(this)

    fun test(input: String): Boolean {

        input.forEach { char ->
            currentState.consume(char.toString())
        }

        val valid = currentState is IntegerDigitState

        reset()

        return valid
    }

    override fun changeState(state: State) {
        currentState = state
    }

    private fun reset() {
        currentState = IntegerStartState(this)
    }
}
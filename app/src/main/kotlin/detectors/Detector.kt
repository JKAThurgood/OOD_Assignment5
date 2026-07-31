package detectors

import sharedStates.State

abstract class Detector : StateContext {

    protected lateinit var currentState: State

    abstract fun createInitialState(): State

    abstract fun isAcceptingState(state: State): Boolean

    fun test(input: String): Boolean {

        currentState = createInitialState()

        input.forEach { character ->
            currentState.consume(character.toString())
        }

        val result = isAcceptingState(currentState)

        currentState = createInitialState()

        return result
    }

    override fun changeState(state: State) {
        currentState = state
    }
}
package detectors

import sharedStates.State

abstract class Detector : StateContext {

    protected lateinit var currentState: State

    abstract fun initialState(): State

    abstract fun accepts(state: State): Boolean

    fun test(input: String): Boolean {

        currentState = initialState()

        input.forEach { character ->
            currentState.consume(character.toString())
        }

        val result = accepts(currentState)

        currentState = initialState()

        return result
    }

    override fun changeState(state: State) {
        currentState = state
    }
}
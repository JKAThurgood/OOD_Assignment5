package sharedStates

class Invalid(detector: Detector) : State(detector) {

    override fun consume(character: String) {
        // Dead state
    }
}
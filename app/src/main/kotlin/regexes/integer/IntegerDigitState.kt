package integer

import sharedStates.Detector
import sharedStates.Invalid
import sharedStates.State

class IntegerDigitState(detector: Detector) : State(detector) {

    override fun consume(character: String) {

        if (character !in "0123456789") {
            detector.changeState(Invalid(detector))
        }
    }
}
package integer

import sharedStates.Detector
import sharedStates.Invalid
import sharedStates.State

class IntegerStartState(detector: Detector) : State(detector) {

    override fun consume(character: String) {

        if (character in "123456789") {
            detector.changeState(IntegerDigitState(detector))
        } else {
            detector.changeState(Invalid(detector))
        }
    }
}
package email

import detectors.StateContext
import sharedStates.State

class EmailPart2StartState(context: StateContext) : EmailStartPartState(context) {

    override fun nextFilledState(): State = EmailPart2State(context)
}
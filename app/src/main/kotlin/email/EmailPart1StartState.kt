package email

import detectors.StateContext
import sharedStates.State

class EmailPart1StartState(context: StateContext) : EmailStartPartState(context) {

    override fun nextFilledState(): State = EmailPart1State(context)
}
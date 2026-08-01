package email

import detectors.StateContext
import sharedStates.State

class EmailPart3StartState(context: StateContext) : EmailStartPartState(context) {

    override fun nextFilledState(): State = EmailPart3State(context)
}
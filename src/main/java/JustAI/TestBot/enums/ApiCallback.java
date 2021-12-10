package JustAI.TestBot.enums;

import JustAI.TestBot.Constants;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ApiCallback
{
    MESSAGE_REPLY(Constants.CALLBACK_API_EVENT_MESSAGE_REPLAY),
    CONFIRMATION(Constants.CALLBACK_API_EVENT_CONFIRMATION),
    MESSAGE_NEW(Constants.CALLBACK_API_EVENT_MESSAGE_NEW),
    MESSAGE_TYPING_STATE(Constants.CALLBACK_API_EVENT_MESSAGE_TYPING_STATE);

    @JsonValue
    private final String type;
}

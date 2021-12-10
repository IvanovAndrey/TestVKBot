package JustAI.TestBot.entites;

import JustAI.TestBot.Constants;
import JustAI.TestBot.enums.ApiCallback;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Event
{
    @JsonProperty(Constants.EVENT_TYPE)
    private ApiCallback type;

    @JsonProperty(Constants.EVENT_GROUP_ID)
    private Long groupId;

    @JsonProperty(Constants.EVENT_ID)
    private String eventId;

    @JsonProperty(Constants.EVENT_SECRET)
    private String secret;

    @JsonValue
    @JsonProperty(Constants.EVENT_OBJECT)
    private EventObject eventObject;

    @Override
    public String toString()
    {
        String message;

        if (type == ApiCallback.MESSAGE_NEW)
        {
            message = "type: '" + type.name() + "', text: '" +
                    eventObject.getText() + "', from user_id: " +
                    eventObject.getFromId();
        }
        else if (type == ApiCallback.MESSAGE_REPLY)
        {
            message = "type: '" + type.name() + "', text: '" +
                    eventObject.getText() + "', to user_id: " +
                    eventObject.getFromId();
        }
        else
        {
            message = "type: '" + type.name();
        }

        return message;
    }
}

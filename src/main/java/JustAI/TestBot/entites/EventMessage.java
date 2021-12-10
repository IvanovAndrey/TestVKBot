package JustAI.TestBot.entites;

import JustAI.TestBot.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventMessage
{
    @JsonProperty(Constants.EVENT_OBJECT_MESSAGE_ID)
    private int id;

    @JsonProperty(Constants.EVENT_OBJECT_MESSAGE_DATE)
    private int date;

    @JsonProperty(Constants.EVENT_OBJECT_MESSAGE_OUT)
    private int out;

    @JsonProperty(Constants.EVENT_OBJECT_MESSAGE_FROM_ID)
    private int fromId;

    @JsonProperty(Constants.EVENT_OBJECT_MESSAGE_TEXT)
    private String text;
}
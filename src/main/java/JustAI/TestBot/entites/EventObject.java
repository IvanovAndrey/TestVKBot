package JustAI.TestBot.entites;

import JustAI.TestBot.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventObject
{
    @JsonValue
    @JsonProperty(Constants.EVENT_MESSAGE)
    private EventMessage eventMessage;

    public String getText() {
        try {
            return eventMessage.getText();
        } catch (NullPointerException e){
            return "";
        }
    }

    public String getFromId() {
        try {
            return String.valueOf(eventMessage.getFromId());
        } catch (NullPointerException e){
            return "";
        }
    }
}


package JustAI.TestBot.response;

import JustAI.TestBot.Constants;
import JustAI.TestBot.entites.Event;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class DefaultResponse extends Response
{
    public DefaultResponse(Event event, String accessToken)
    {
        super(event, accessToken);
    }

    @Override
    protected List<NameValuePair> getQueryParameters()
    {
        List<NameValuePair> nameValuePairs = new ArrayList<>();

        nameValuePairs.add(new BasicNameValuePair("message", "Вы написали: " + super.getEvent().getEventObject().getText()));
        nameValuePairs.add(new BasicNameValuePair("peer_id", String.valueOf(super.getEvent().getEventObject().getFromId())));
        nameValuePairs.add(new BasicNameValuePair("access_token", super.getAccessToken()));
        nameValuePairs.add(new BasicNameValuePair("v", Constants.VK_API_VERSION));
        nameValuePairs.add(new BasicNameValuePair("random_id", String.valueOf(new SecureRandom().nextInt())));

        return nameValuePairs;
    }
}

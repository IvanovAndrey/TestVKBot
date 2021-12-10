package JustAI.TestBot.service;


import JustAI.TestBot.AppConfig;
import JustAI.TestBot.entites.Event;
import JustAI.TestBot.enums.ApiCallback;
import JustAI.TestBot.enums.ApiMethod;
import JustAI.TestBot.response.DefaultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;


@RequiredArgsConstructor
@Service
public class BotService
{
    private static final Logger LOG = Logger.getLogger(BotService.class);
    private final AppConfig config;

    public String doResponse(Event event)
    {
        if (!event.getSecret().equals(config.getSecretKey()))
        {
            LOG.error("Received secret key does not match the one specified in " +
                    "the application.yaml configuration: " + event.getSecret());

            return "error";
        }

        LOG.debug("Received: " + event.toString());

        if (event.getType() == ApiCallback.CONFIRMATION)
        {
            return config.getConfirmationToken();
        }
        else if (event.getType() == ApiCallback.MESSAGE_NEW)
        {
            new DefaultResponse(event, config.accessToken).processResponse(ApiMethod.MESSAGE_SEND);
        }
        return "ok";
    }
}
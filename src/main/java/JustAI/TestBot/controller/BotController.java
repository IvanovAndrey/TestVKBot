package JustAI.TestBot.controller;

import JustAI.TestBot.entites.Event;
import JustAI.TestBot.service.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/", produces = APPLICATION_JSON_VALUE)
public class BotController
{
    private final BotService service;

    @PostMapping
    public String doResponse(@RequestBody Event event) throws Exception
    {
        return service.doResponse(event);
    }
}

package com.dontmover.telegrambot.bot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix="bot")
@Configuration
public class BotProperties {
    private static String username = "Testing_bot_bot_bot";
    private static String token = "5205233596:AAGdJ7r9ZXLMiWfkPTqboX55WoyqCEsz_eA";

    public String getUsername() {
        return this.username;
    }

    public String getToken() {
        return this.token;
    }
}

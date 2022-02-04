package com.dontmover.telegrambot.bot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix="bot")
@Configuration
public class BotProperties {
    private static String username = "Testing_bot_bot_bot";
    private static String token = "token";

    public String getUsername() {
        return this.username;
    }

    public String getToken() {
        return this.token;
    }
}

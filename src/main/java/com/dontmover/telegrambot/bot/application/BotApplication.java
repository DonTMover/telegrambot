package com.dontmover.telegrambot.bot.application;

import com.dontmover.telegrambot.bot.bot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BotApplication {
    public static void main(String[] args) {
        bot bott = new bot();
        SpringApplication.run(bot.class, args);
        System.out.println(bott.getBotUsername());

    }
}
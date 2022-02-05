package com.dontmover.telegrambot.bot.application;

import com.dontmover.telegrambot.bot.bot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


@SpringBootApplication
public class BotApplication {
    public static void main(String[] args) {
        bot bott = new bot();
        //        try {
//            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(bot.class, defaultWebhookInstance);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }

//        SpringApplication.run(bot.class, args);
        System.out.println(bott.getBotUsername());
    }


}
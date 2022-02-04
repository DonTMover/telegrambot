package com.dontmover.telegrambot.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import com.dontmover.telegrambot.bot.BotProperties.*;

@Component
public class bot extends TelegramLongPollingBot {
    public static void main(String[] args) {


    }
    BotProperties botProperties = new BotProperties();
    private String username = botProperties.getUsername();

    private String token = botProperties.getToken();

    @Override
    public String getBotUsername() {
        return username;
    }

    @Override
    public String getBotToken() {
        return token;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){
            String message = update.getMessage().getText().trim();
            String chatid = update.getMessage().getChatId().toString();
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatid);
            sendMessage.setText(message);

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
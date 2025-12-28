package com.example.sample;

import org.springframework.stereotype.Service;

@Service
public class LocalizationService {

    public String getText(String locale) {
        return switch (locale) {
            case "ru" -> "Русский текст";
            case "kz" -> "қазақша мәтін";
            default -> "English text";
        };
    }
}
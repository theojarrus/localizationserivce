package com.example.sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LocalizationServiceTest {

    LocalizationService localizationService;

    @BeforeEach
    void init() {
        localizationService = new LocalizationService();
    }

    @ParameterizedTest
    @CsvSource({
        "ru,Русский текст",
        "kz,қазақша мәтін",
        "en,English text",
    })
    void test(String locale, String expected) {
        assertEquals(expected, localizationService.getText(locale));
    }
}
package com.example.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LocalizationController {
    
    private final LocalizationService localizationService;
    
    @GetMapping("/getText")
    public String getText(@RequestParam String locale) {
        return localizationService.getText(locale);
    }
}
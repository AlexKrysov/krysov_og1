package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NavigationPage {

    private SelenideElement
            learningFormat = $("#menu-item-455");


    public void goToLearningFormat() {
        step("Переходим в раздел 'Формат обучения'", () -> {
            learningFormat.click();
        });
    }
}

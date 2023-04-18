package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CheckPage {

    private SelenideElement
            text = $(".col-12.col-lg-6.col-xl-5.form-training__rules", 0);


    public void checkResponse() {
        step("Проверяем ответ (чтоб не спамить, проверяем текст)", () -> {
            text.shouldHave(text("Нажимая на кнопку, я принимаю условия "));
        });
    }
}

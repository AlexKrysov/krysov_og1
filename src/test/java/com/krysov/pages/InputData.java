package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class InputData {
    private SelenideElement
            name = $("#inputName-1", 0),
            email = $("#inputMail-1", 0),
            phone = $("[name='phone_number']"),
            Class = $(".select-class-number", 0);


    public void inputName() {
        step("Вводим валидное имя", () -> {
            name.setValue("Алексей");
        });
    }
    public void inputIncorrectName() {
        step("Вводим валидное имя", () -> {
            name.setValue("123!?_");
        });
    }

    public void inputEmail() {
        step("Вводим валидную почту", () -> {
            email.setValue("krysov-95@mail.ru");
        });
    }
    public void inputIncorrectEmail() {
        step("Вводим невалидную почту", () -> {
            email.setValue("qqqq111111!*");
        });
    }

    public void inputPhoneNumber() {
        step("Вводим валидный номер телефона", () -> {
            phone.setValue("9609898725");
        });
    }
    public void selectClass() {
        step("Выбираем '9 класс'", () -> {
            Class.selectOption("9 класс");
        });
    }
}

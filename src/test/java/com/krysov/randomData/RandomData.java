package com.krysov.randomData;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class RandomData {

    public static Faker faker = new Faker();

    private SelenideElement
            name = $("#inputName-1", 0),
            email = $("#inputMail-1", 0),
            phone = $("[name='phone_number']");


    private String randomEmail = faker.internet().emailAddress();
    private String randomName = faker.name().firstName();
    private String randomPhone = faker.phoneNumber().phoneNumber();


    public void inputRandomName() {
        step("Вводим рандомное имя", () -> {
            name.setValue(randomName);
        });
    }

    public void inputRandomPhone() {
        step("Вводим рандомный номер телефона", () -> {
            phone.setValue(randomPhone);
        });
    }

    public void inputRandomEmail() {
        step("Вводим рандомный адрес электронной почты", () -> {
            email.setValue(randomEmail);
        });
    }
}

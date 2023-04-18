package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NavigationTests extends TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void checkFormTest() {
        open("https://og1.ru/");
        $("#menu-item-455").click();
        $("#inputName-1", 0).setValue("Алексей");
        $("#inputMail-1", 0).setValue("krysov-95@mail.ru");
        $("[name='phone_number']").setValue("9609898725");
        $(".select-class-number", 0).selectOption("9 класс");
        $(".col-12.col-lg-6.col-xl-5.form-training__rules", 0).shouldHave(text("Нажимая на кнопку, я принимаю условия "));
    }

    @Test
    void checkFormTestPositive() {
        openPage.openOg1Page();
        navigationPage.goToLearningFormat();
        inputData.inputName();
        inputData.inputEmail();
        inputData.inputPhoneNumber();
        inputData.selectClass();
        checkPage.checkResponse();
    }

}


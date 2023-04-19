package com.krysov.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class NavigationTests extends TestBase {

    @DisplayName("Проверка заполнения формы с валидными данными")
    @Owner("Krysov")
    @Tag("PositiveFormTest")
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
    @DisplayName("Проверка заполнения формы с валидными, рандомными данными")
    @Owner("Krysov")
    @Tag("PositiveFormTest")
    @Test
    void checkFormTestPositiveRandomData() {
        openPage.openOg1Page();
        navigationPage.goToLearningFormat();
        randomData.inputRandomName();
        randomData.inputRandomEmail();
        randomData.inputRandomPhone();
        inputData.selectClass();
        checkPage.checkResponse();
    }

    @DisplayName("Проверка заполнения формы с невалидными данными в поле 'Имя'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormTestIncorrectName() {
        openPage.openOg1Page();
        navigationPage.goToLearningFormat();
        inputData.inputName();
        inputData.inputEmail();
        inputData.inputPhoneNumber();
        inputData.selectClass();
        checkPage.checkResponse();
    }

    @DisplayName("Проверка заполнения формы с невалидными данными в поле 'Email'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormTestIncorrectEmail() {
        openPage.openOg1Page();
        navigationPage.goToLearningFormat();
        inputData.inputName();
        inputData.inputIncorrectEmail();
        inputData.inputPhoneNumber();
        inputData.selectClass();
        checkPage.checkResponse();
    }

    @DisplayName("Проверка заполнения формы с пустым полем 'Имя'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormTestWithoutName() {
        openPage.openOg1Page();
        navigationPage.goToLearningFormat();
        inputData.inputEmail();
        inputData.inputPhoneNumber();
        inputData.selectClass();
        checkPage.checkResponse();
    }

    @DisplayName("Проверка заполнения формы с пустым полем 'Email'")
    @Owner("Krysov")
    @Tag("NegativeFormTest")
    @Test
    void checkFormTestWithoutEmail() {
        openPage.openOg1Page();
        navigationPage.goToLearningFormat();
        inputData.inputName();
        inputData.inputPhoneNumber();
        inputData.selectClass();
        checkPage.checkResponse();
    }
}

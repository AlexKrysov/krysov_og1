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
    void checkFormTestPositive() {
        openPage.openOg1Page();
        navigationPage.goToLearningFormat();
        inputData.inputName();
        inputData.inputEmail();
        inputData.inputPhoneNumber();
        inputData.selectClass();
        checkPage.checkResponse();
    }

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

    @Test
    void checkFormTestWithoutName() {
        openPage.openOg1Page();
        navigationPage.goToLearningFormat();
        inputData.inputEmail();
        inputData.inputPhoneNumber();
        inputData.selectClass();
        checkPage.checkResponse();
    }

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

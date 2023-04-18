package com.krysov.pages;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OpenPage {

    private final String CompanyUrl = "https://og1.ru/";

    public void openOg1Page() {
        step("Открыть страницу", () ->
                open(CompanyUrl));
    }
}

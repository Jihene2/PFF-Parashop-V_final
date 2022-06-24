$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeaturesPara/InscriptionPara.feature");
formatter.feature({
  "name": "Inscription on parashop",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Inscription"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Inscription",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on s enregistrer",
  "keyword": "And "
});
formatter.step({
  "name": "User enter name \u003cName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Enter familly name \u003cFamilly name\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter email \u003cEmail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter telephone \u003ctelephone\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter confirm password \u003cconfirm password\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on accept legal mentions",
  "keyword": "And "
});
formatter.step({
  "name": "clicks on continuer",
  "keyword": "And "
});
formatter.step({
  "name": "User is signed in on the website",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Familly name",
        "Email",
        "telephone",
        "password",
        "confirm password"
      ]
    },
    {
      "cells": [
        "jihene",
        "saidene",
        "test.academy14@yahoo.com",
        "26555888",
        "Test123",
        "Test123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Inscription",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Inscription"
    }
  ]
});
formatter.step({
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefsPara.Inscription.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on s enregistrer",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Inscription.user_clicks_on_s_enregistrer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter name jihene",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefsPara.Inscription.user_enter_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter familly name saidene",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Inscription.enter_Familly_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter email test.academy14@yahoo.com",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Inscription.enter_Email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter telephone 26555888",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Inscription.enter_telephone(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password Test123",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Inscription.enter_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter confirm password Test123",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Inscription.enter_Confirm_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on accept legal mentions",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Inscription.clicks_on_accept_legal_mentions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on continuer",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Inscription.clicks_on_continuer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is signed in on the website",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefsPara.Inscription.user_is_signed_in_on_the_website()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebElement.isDisplayed()\" because the return value of \"org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)\" is null\r\n\tat PageObjects.InscriptionPO.Compte(InscriptionPO.java:87)\r\n\tat StepDefsPara.Inscription.user_is_signed_in_on_the_website(Inscription.java:89)\r\n\tat ✽.User is signed in on the website(file:///C:/Users/jsaidane/eclipse-workspace/Para/src/test/resources/FeaturesPara/InscriptionPara.feature:16)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "research as guest",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Inscription"
    }
  ]
});
formatter.step({
  "name": "Browser is open and user on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefsPara.Rechreche.browser_is_open_and_user_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User choose category",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefsPara.Rechreche.user_choose_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose sub category",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Rechreche.choose_sub_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose price filter",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Rechreche.choose_price_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Rechreche.choose_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Rechreche.click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefsPara.Rechreche.verify_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the poduct is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefsPara.Rechreche.the_poduct_is_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
});
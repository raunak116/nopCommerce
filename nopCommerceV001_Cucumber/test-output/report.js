$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Blaze.feature");
formatter.feature({
  "name": "Order a laptop",
  "description": "  Order a laptop",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validate that user is able to add, delete and purchase a product from the DemoBlaze cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@blaze"
    }
  ]
});
formatter.step({
  "name": "user is on DemoBlaze website Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "user navigates to Laptop section",
  "keyword": "When "
});
formatter.step({
  "name": "user adds in the Cart Sony vaio i5",
  "keyword": "And "
});
formatter.step({
  "name": "user adds in the Cart Dell i7 8gb",
  "keyword": "And "
});
formatter.step({
  "name": "user navigates to the Cart",
  "keyword": "And "
});
formatter.step({
  "name": "user deletes Dell i7 8gb from the Cart",
  "keyword": "And "
});
formatter.step({
  "name": "User Places the Order",
  "keyword": "And "
});
formatter.step({
  "name": "user fill web form details",
  "keyword": "And "
});
formatter.step({
  "name": "User carry on Purchase",
  "keyword": "And "
});
formatter.step({
  "name": "PurchaseId and Amount appears",
  "keyword": "Then "
});
formatter.step({
  "name": "Validate the \"\u003cAmount\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Amount"
      ]
    },
    {
      "cells": [
        "790"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate that user is able to add, delete and purchase a product from the DemoBlaze cart",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@blaze"
    }
  ]
});
formatter.step({
  "name": "user is on DemoBlaze website Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Blaze.user_is_on_DemoBlaze_website_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Laptop section",
  "keyword": "When "
});
formatter.match({
  "location": "Blaze.user_navigates_to_Laptop_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds in the Cart Sony vaio i5",
  "keyword": "And "
});
formatter.match({
  "location": "Blaze.user_adds_in_the_Cart_Sony_vaio_i(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds in the Cart Dell i7 8gb",
  "keyword": "And "
});
formatter.match({
  "location": "Blaze.user_adds_in_the_Cart_Dell_i_gb(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the Cart",
  "keyword": "And "
});
formatter.match({
  "location": "Blaze.user_navigates_to_the_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deletes Dell i7 8gb from the Cart",
  "keyword": "And "
});
formatter.match({
  "location": "Blaze.user_deletes_Dell_i_gb_from_the_Cart(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Places the Order",
  "keyword": "And "
});
formatter.match({
  "location": "Blaze.user_Places_the_Order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill web form details",
  "keyword": "And "
});
formatter.match({
  "location": "Blaze.user_fill_web_form_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User carry on Purchase",
  "keyword": "And "
});
formatter.match({
  "location": "Blaze.user_carry_on_Purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "PurchaseId and Amount appears",
  "keyword": "Then "
});
formatter.match({
  "location": "Blaze.purchaseid_and_Amount_appears()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the \"790\"",
  "keyword": "And "
});
formatter.match({
  "location": "Blaze.validate_the(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c7[0]0\u003e but was:\u003c7[9]0\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat pageObjects.CartPage.PurchaseDetails(CartPage.java:128)\r\n\tat stepDefinitions.Blaze.validate_the(Blaze.java:97)\r\n\tat ✽.Validate the \"790\"(file:Features/Blaze.feature:18)\r\n",
  "status": "failed"
});
});
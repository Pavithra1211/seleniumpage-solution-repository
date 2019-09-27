$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/D:/GitProjects/giveIn-solution-repository/src/test/java/Features/Solution.feature");
formatter.feature({
  "name": "Validating Selenium page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate whether page is featured article",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_whether_page_is_featured_article"
    }
  ]
});
formatter.step({
  "name": "User opened the application",
  "keyword": "Given "
});
formatter.step({
  "name": "The page \"\u003cSelenium\u003e\" is opened",
  "keyword": "When "
});
formatter.step({
  "name": "Featured article icon should not be present",
  "keyword": "Then "
});
formatter.step({
  "name": "Browser should be closed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Selenium"
      ]
    },
    {
      "cells": [
        "Selenium - Wikipedia"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate whether page is featured article",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Verify_whether_page_is_featured_article"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opened the application",
  "keyword": "Given "
});
formatter.match({
  "location": "SolutionStepDef.user_opened_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page \"Selenium - Wikipedia\" is opened",
  "keyword": "When "
});
formatter.match({
  "location": "SolutionStepDef.the_page_is_opened(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Featured article icon should not be present",
  "keyword": "Then "
});
formatter.match({
  "location": "SolutionStepDef.featured_article_icon_should_not_be_present()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@alt\u003d\u0027This is a featured article. Click here for more information.\u0027]\"}\n  (Session info: chrome\u003d76.0.3809.132)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-791EE4Q\u0027, ip: \u0027192.168.0.82\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: C:\\Users\\lapuser\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:62815}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: e2eacc4f558984780ef3c59f9aecf925\n*** Element info: {Using\u003dxpath, value\u003d//img[@alt\u003d\u0027This is a featured article. Click here for more information.\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat Pages.SeleniumPage.fnVerifyFeaturedArticle(SeleniumPage.java:125)\r\n\tat StepDefinitions.SolutionStepDef.featured_article_icon_should_not_be_present(SolutionStepDef.java:64)\r\n\tat ✽.Featured article icon should not be present(file:/D:/GitProjects/giveIn-solution-repository/src/test/java/Features/Solution.feature:29)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Browser should be closed",
  "keyword": "And "
});
formatter.match({
  "location": "SolutionStepDef.browser_should_be_closed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Take a screenshot of right hand element",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Take_screenshot_of_righthand_box_elements"
    }
  ]
});
formatter.step({
  "name": "User opened the application",
  "keyword": "Given "
});
formatter.step({
  "name": "The page \"\u003cSelenium\u003e\" is opened",
  "keyword": "When "
});
formatter.step({
  "name": "Screenshot should be taken",
  "keyword": "Then "
});
formatter.step({
  "name": "Browser should be closed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Selenium"
      ]
    },
    {
      "cells": [
        "Selenium - Wikipedia"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Take a screenshot of right hand element",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Take_screenshot_of_righthand_box_elements"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opened the application",
  "keyword": "Given "
});
formatter.match({
  "location": "SolutionStepDef.user_opened_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page \"Selenium - Wikipedia\" is opened",
  "keyword": "When "
});
formatter.match({
  "location": "SolutionStepDef.the_page_is_opened(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Screenshot should be taken",
  "keyword": "Then "
});
formatter.match({
  "location": "SolutionStepDef.screenshot_should_be_taken()"
});
formatter.result({
  "error_message": "java.awt.image.RasterFormatException: (x + width) is outside of Raster\r\n\tat java.desktop/sun.awt.image.ByteInterleavedRaster.createWritableChild(ByteInterleavedRaster.java:1240)\r\n\tat java.desktop/java.awt.image.BufferedImage.getSubimage(BufferedImage.java:1202)\r\n\tat Pages.SeleniumPage.fnTakeScreenShot(SeleniumPage.java:144)\r\n\tat StepDefinitions.SolutionStepDef.screenshot_should_be_taken(SolutionStepDef.java:70)\r\n\tat ✽.Screenshot should be taken(file:/D:/GitProjects/giveIn-solution-repository/src/test/java/Features/Solution.feature:40)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Browser should be closed",
  "keyword": "And "
});
formatter.match({
  "location": "SolutionStepDef.browser_should_be_closed()"
});
formatter.result({
  "status": "skipped"
});
});
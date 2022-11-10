package test
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ReduceItem {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User login and redirected to homepage")
	def userLoginAndrediRedirectedToHomepage() {
		println("\n I am inside userLoginAndRedirectedToHomepage")
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("User clik buy")
	def userClickBuy() {
		println("\n I am inside userClickBuy")
		WebUI.click(findTestObject('Object Repository/11_ReduceItem/button_Beli'))
		
		WebUI.click(findTestObject('Object Repository/11_ReduceItem/button_1'))
		
		WebUI.click(findTestObject('Object Repository/11_ReduceItem/button_'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/11_ReduceItem/button_'), '+')
		
		WebUI.click(findTestObject('Object Repository/11_ReduceItem/button_'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/11_ReduceItem/button_'), '+')
		
		WebUI.click(findTestObject('Object Repository/11_ReduceItem/button_-'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/11_ReduceItem/button_-'), '-')
		
		WebUI.click(findTestObject('Object Repository/11_ReduceItem/button_-'))
		
		WebUI.verifyElementText(findTestObject('Object Repository/11_ReduceItem/button_-'), '-')
		
	}

	@And("User clik cart and navigate to cart page")
	def userClickCartAndNavigateToCartPage() {
		println("\n I am inside userClickCartAndNavigateToCartPage")
	}

	@Then("User clik - icon for reduce item")
	def userClickIconForReduceItem() {
		println("\n I am inside userClickIconForReduceItem")
	}
}
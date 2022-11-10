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



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Set method to POST")
	def SetmethodtoPOST() {
	}

	@When("Set URl")
	def SetURL() {
		response = WS.sendRequest(findTestObject('Authentication/Login'))
	}

	@And("Set the body parameters and Send Request to")
	def setTheBodyParametersAndSendRequestTo() {
	}

	@Then("Verify response 200 Verify response properties")
	def verifyResponse200ResponseProperties() {
		WS.verifyResponseStatusCode(response, 200)
		WS.verifyElementPropertyValue(response, 'email', null)
	}

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

	@Given("user set POST endpoint")
	def setPostEndpoint() {
	}

	@When("User set parameter fullname <fullname> email <email> and password <password>")
	def setBody(String fullname, String email, String password) {
	}

	@And("user send POST HTTP method")
	def sendPostHttpMethod() {
	}

	@And("user receive valid HTTP response code 200")
	def receiveValidResponse() {
	}

	@Then("user receive valid data for new account")
	def receiveValidData() {
		// buat function if 400 lanjut else stop / 200 stop
		//  if (condition) {
		//
		//  }
		>>>>>>> branch 'main' of https://github.com/muhamadshidan/MiniProjectALTASHOP.git
	}
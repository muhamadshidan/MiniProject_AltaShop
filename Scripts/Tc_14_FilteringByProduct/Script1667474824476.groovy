import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alta-shop.vercel.app/')

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))

WebUI.setText(findTestObject('Object Repository/14_FilteringbyProduct/input_Email_input-1115'), 'muhamadshidan@gmail.com')

WebUI.setText(findTestObject('Object Repository/14_FilteringbyProduct/input_Password_input-1118'), 'bogor12345')

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/button_Login'))

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/button_Beli'))

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/span_1'))

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/span_'))

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/button_Bayar'))

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/i_Produk_v-icon notranslate v-data-table-he_8db174'))

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/i_Produk_v-icon notranslate v-data-table-he_8db174_1'))

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/i_Produk_v-icon notranslate v-data-table-he_8db174_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/14_FilteringbyProduct/th_Produk'), 'Produk')

WebUI.verifyElementText(findTestObject('Object Repository/14_FilteringbyProduct/i_Produk_v-icon notranslate v-data-table-he_8db174'), 
    '')

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/i_Produk_v-icon notranslate v-data-table-he_8db174'))

WebUI.click(findTestObject('Object Repository/14_FilteringbyProduct/i_Produk_v-icon notranslate v-data-table-he_8db174_1'))

WebUI.verifyElementText(findTestObject('Object Repository/14_FilteringbyProduct/i_Produk_v-icon notranslate v-data-table-he_8db174_1_2'), 
    '')


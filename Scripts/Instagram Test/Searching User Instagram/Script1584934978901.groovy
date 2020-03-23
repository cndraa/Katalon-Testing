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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.instagram.com/')

WebUI.setText(findTestObject('Object Repository/Page_Instagram/input_Phone number username or email_username'), 'didimuscandra_')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Instagram/input_Password_password'), 'gv76UmmB8yXuVu/a30cApA==')

WebUI.click(findTestObject('Object Repository/Page_Instagram/div_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Instagram/button_Not Now'))

WebUI.click(findTestObject('Object Repository/Page_Instagram/span_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Instagram/input_ 2020 Instagram from Facebook_XTCLo x_af2b66'), 'didimus08_')

WebUI.click(findTestObject('Object Repository/Page_Instagram/div_didimus08_Dim'))

WebUI.click(findTestObject('Object Repository/Page_Dim (didimus08_)  Instagram photos and videos/svg_Search__8-yf5'))

WebUI.click(findTestObject('Object Repository/Page_   (didimuscandra_)  Instagram photos _a24ffd/svg_Edit Profile__8-yf5'))

WebUI.click(findTestObject('Object Repository/Page_   (didimuscandra_)  Instagram photos _a24ffd/button_Log Out'))

WebUI.closeBrowser()


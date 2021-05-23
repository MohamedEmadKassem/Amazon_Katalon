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

WebUI.navigateToUrl('https://www.amazon.com.tr/')

WebUI.click(findTestObject('Log in and Log out/main page/cookies'))

WebUI.mouseOver(findTestObject('Log in and Log out/main page/a_Merhaba, Giri yapn  Hesap ve Listeler        Hesap'))

WebUI.click(findTestObject('Log in and Log out/main page/span_Giri yap'))

WebUI.setText(findTestObject('Log in and Log out/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'serhan-ediz@hotmail.com')

WebUI.click(findTestObject('Log in and Log out/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu numaranz girin_continue'))

WebUI.setText(findTestObject('Log in and Log out/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 'Amazon1998')

WebUI.click(findTestObject('Log in and Log out/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.delay(0)

WebUI.verifyTextPresent('Ali', false)

WebUI.verifyLinksAccessible(['https://www.amazon.com.tr/?ref_=nav_signin&'])

WebUI.mouseOver(findTestObject('Log in and Log out/main page/a_Ali  Hesap ve Listeler        Hesap'))

WebUI.delay(2)

WebUI.click(findTestObject('Log in and Log out/main page/span_k Yap'))


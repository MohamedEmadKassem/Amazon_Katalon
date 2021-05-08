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

WebUI.navigateToUrl('https://www.amazon.com.tr/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=trflex&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_gno_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&prevRID=M9SNG134TK4P7E2JB9C5&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/PositiveSignUp/Page_Amazon Kayd/input_Ad - Soyad_customerName'), 'Mohamed Kassem')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/PositiveSignUp/Page_Amazon Kayd/input_E-posta_email'), 'wanted3omda@live.com')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/PositiveSignUp/Page_Amazon Kayd/input_ifre_password'), 'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/PositiveSignUp/Page_Amazon Kayd/input_ifreyi tekrar girin_passwordCheck'), 
    'lsh4UT/KYs157Zjg3xgr3w==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/PositiveSignUp/Page_Amazon Kayd/input_ifreler elemiyor_continue'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/PositiveSignUp/Page_Ltfen kimliinizi dorulayn/input_Kodu gir_code'), '134658')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/PositiveSignUp/Page_Ltfen kimliinizi dorulayn/input_Kodu gir_a-button-input'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/PositiveSignUp/Page_/a_ok Satanlar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/PositiveSignUp/Page_Amazon.com.tr ok Satanlar Amazondaki e_ae023c/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/PositiveSignUp/Page_Amazon.com.tr ok Satanlar Amazondaki e_ae023c/a_Moda'))

WebUI.delay(1)

WebUI.closeBrowser()


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

WebUI.click(findTestObject('LoginAndDisplayOrders/Main page/input_Ne yazk ki erez tercihleriniz kaydedilirken bir sorun olutu. Tekrar deneyin._accept'))

WebUI.click(findTestObject('LoginAndDisplayOrders/Main page/a_Merhaba, Giri yapn  Hesap ve Listeler        Hesap'))

WebUI.setText(findTestObject('LoginAndDisplayOrders/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'mohamed.2.kassem95@gmail.com')

WebUI.click(findTestObject('LoginAndDisplayOrders/login/input_E-posta adresinizi veya cep telefonu numaranz girin_continue'))

WebUI.setText(findTestObject('LoginAndDisplayOrders/login/input_ifremi unuttum_password'), '911TURBo')

WebUI.click(findTestObject('LoginAndDisplayOrders/login/input_ifrenizi girin_signInSubmit'))

WebUI.mouseOver(findTestObject('LoginAndDisplayOrders/Main page/span_Hesap ve Listeler'))

WebUI.delay(1)

WebUI.click(findTestObject('LoginAndDisplayOrders/Main page/span_Siparilerim'))

WebUI.verifyTextPresent('sipariş vermediniz', false)

WebUI.closeBrowser()


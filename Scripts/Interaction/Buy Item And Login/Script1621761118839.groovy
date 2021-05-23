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

WebUI.click(findTestObject('BuyItemAndLogin/Page_Amazon.com.tr Elektronik, bilgisayar/input_Ne yazk ki erez tercihleriniz kaydedilirken bir sorun olutu. Tekrar deneyin._accept'))

WebUI.verifyTextPresent('Teslimat adresini', false)

WebUI.click(findTestObject('BuyItemAndLogin/Page_Amazon.com.tr Elektronik, bilgisayar/a_ok Satanlar'))

WebUI.verifyLinksAccessible(['https://www.amazon.com.tr/gp/bestsellers?ref_=nav_cs_bestsellers_6bce5169359d4ca5bc88df01d2a80d70'])

WebUI.click(findTestObject('BuyItemAndLogin/Page_Amazon.com.tr ok Satanlar Amazondaki en popler rnler/div_Xiaomi Mi Body Composition Scale 2 Tart, Beyaz'))

WebUI.scrollToElement(findTestObject('BuyItemAndLogin/Page_Xiaomi Mi Body Composition Scale 2 Tart, Beyaz Amazon.com.tr/input_Miktar_submit.buy-now'), 
    1)

WebUI.delay(1)

WebUI.click(findTestObject('BuyItemAndLogin/Page_Xiaomi Mi Body Composition Scale 2 Tart, Beyaz Amazon.com.tr/input_Miktar_submit.buy-now'))

WebUI.setText(findTestObject('BuyItemAndLogin/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 'serhan-ediz@hotmail.com')

WebUI.click(findTestObject('BuyItemAndLogin/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu numaranz girin_continue'))

WebUI.setText(findTestObject('BuyItemAndLogin/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 'Amazon1998')

WebUI.click(findTestObject('BuyItemAndLogin/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.closeBrowser()


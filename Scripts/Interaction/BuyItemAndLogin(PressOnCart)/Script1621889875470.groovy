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

WebUI.openBrowser('https://www.amazon.com.tr/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('BuyItemAndLogin(PressOnCart)/Home/Cookies'))

WebUI.verifyTextPresent('Teslimat adresini', false)

WebUI.click(findTestObject('BuyItemAndLogin(PressOnCart)/Home/a_ok Satanlar'))

WebUI.getUrl()

WebUI.click(findTestObject('BuyItemAndLogin(PressOnCart)/Page_Amazon.com.tr ok Satanlar Amazondaki en popler rnler/div_Mutlu Olma Sanat'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('BuyItemAndLogin(PressOnCart)/Page_Mutlu Olma Sanat Arthur Schopenhauer, ebnem Sunar Amazon.com.tr/input_Miktar_submit.add-to-cart'))

WebUI.click(findTestObject('BuyItemAndLogin(PressOnCart)/Page_Amazon.com.tr Alveri Sepeti/div_Alveri                    Sepeti'))

WebUI.click(findTestObject('BuyItemAndLogin(PressOnCart)/Page_Amazon.com.tr Alveri Sepeti/input_Ara toplam (1 rn)_proceedToRetailCheckout'))

WebUI.setText(findTestObject('BuyItemAndLogin(PressOnCart)/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'serhan-ediz@hotmail.com')

WebUI.click(findTestObject('BuyItemAndLogin(PressOnCart)/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu numaranz girin_continue'))

WebUI.setEncryptedText(findTestObject('BuyItemAndLogin(PressOnCart)/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 
    'CDPLGu8eTw6JheauVworMA==')

WebUI.click(findTestObject('BuyItemAndLogin(PressOnCart)/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))


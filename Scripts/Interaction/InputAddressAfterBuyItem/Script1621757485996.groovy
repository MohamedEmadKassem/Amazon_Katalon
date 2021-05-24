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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_ok Satanlar'))

WebUI.verifyLinksAccessible(['https://www.amazon.com.tr/gp/bestsellers?ref_=nav_cs_bestsellers_6bce5169359d4ca5bc88df01d2a80d70'])

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Amazon.com.tr ok Satanlar Amazondaki e_ae023c/div_Xiaomi Mi Body Composition Scale 2 Tart, Beyaz'))

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Xiaomi Mi Body Composition Scale 2 Tar_10bf2f/input_Miktar_submit.buy-now'))

WebUI.setText(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'serhan-ediz@hotmail.com')

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu _e246cd'))

WebUI.setEncryptedText(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 
    'CDPLGu8eTw6JheauVworMA==')

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.setText(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/input_Ad ve soyad_address-ui-widgets-enterA_32e6a7'), 
    'Ali Tunceli')

WebUI.setText(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/input_ehir_address-ui-widgets-enterAddressCity'), 
    'İst')

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/li_stanbul'))

WebUI.setText(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/input_le_address-ui-widgets-enterAddressSta_f061f0'), 
    'Pendik')

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/li_Kartal'))

WebUI.setText(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/input_Mahalle  Ky_address-ui-widgets-enterA_2acc43'), 
    'Yenişehir Mh.')

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/li_Kordonboyu Mh'))

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/div_Ltfen geerli bir ZIP veya posta kodu girin'))

WebUI.setText(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/input_Adres satr 1_address-ui-widgets-enter_78ffed'), 
    'Yenişehir mah dedepaşa cad')

WebUI.setText(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/input_Adres satr 1_address-ui-widgets-enter_77bb88'), 
    'parklife sitesi c blok daire 16')

WebUI.setText(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/input_Teslimat iin cep telefonu (5xx-xxx-xx_160cc3'), 
    '5079791728')

WebUI.click(findTestObject('Interaction/InputAddressAfterBuyItem/Page_Bu sipari iin teslimat adresi girin/input_Teslimat iin cep telefonu (5xx-xxx-xx_f5b9af'))

WebUI.closeBrowser()


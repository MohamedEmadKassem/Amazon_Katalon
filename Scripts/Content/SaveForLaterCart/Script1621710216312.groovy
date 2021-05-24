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

WebUI.click(findTestObject('Content/SaveForLaterCart/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/span_Hesap ve Listeler'))

WebUI.setText(findTestObject('Content/SaveForLaterCart/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'mohamed.2.kassem95@gmail.com')

WebUI.click(findTestObject('Content/SaveForLaterCart/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu _e246cd'))

WebUI.setEncryptedText(findTestObject('Content/SaveForLaterCart/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 'yYCHQKrnkaEeSW8wnmcRVA==')

WebUI.click(findTestObject('Content/SaveForLaterCart/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.click(findTestObject('Content/SaveForLaterCart/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_ok Satanlar'))

WebUI.click(findTestObject('Content/SaveForLaterCart/Page_Amazon.com.tr ok Satanlar Amazondaki e_ae023c/div_BRITA MAXTRA Yedek Su Filtresi - Altl'))

WebUI.selectOptionByValue(findTestObject('Content/SaveForLaterCart/Page_BRITA MAXTRA Yedek Su Filtresi - Altl _643b8f/select_123456789101112131415'), 
    '1', true)

WebUI.click(findTestObject('Content/SaveForLaterCart/Page_BRITA MAXTRA Yedek Su Filtresi - Altl _643b8f/input_Miktar_submit.add-to-cart'))

WebUI.click(findTestObject('Content/DeleteCart/Page_Amazon.com.tr Alveri Sepeti/span_ve Sipariler_nav-cart-icon nav-sprite'))

WebUI.verifyTextPresent('Daha sonrası için kaydedildi', false)

WebUI.click(findTestObject('Content/SaveForLaterCart/Page_Amazon.com.tr Alveri Sepeti/input_BRITA MAXTRA Yedek Su Filtresi - Altl_74ebc0'))


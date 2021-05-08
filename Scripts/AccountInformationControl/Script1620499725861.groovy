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

WebUI.click(findTestObject('Object Repository/AccountInformation/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.click(findTestObject('Object Repository/AccountInformation/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/span_Giri yap'))

WebUI.setText(findTestObject('Object Repository/AccountInformation/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'mohamed.2.kassem95@gmail.com')

WebUI.click(findTestObject('Object Repository/AccountInformation/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu _e246cd'))

WebUI.setEncryptedText(findTestObject('Object Repository/AccountInformation/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 
    'yYCHQKrnkaEeSW8wnmcRVA==')

WebUI.click(findTestObject('Object Repository/AccountInformation/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.click(findTestObject('Object Repository/AccountInformation/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/span_Hesabm'))

WebUI.click(findTestObject('Object Repository/AccountInformation/Page_Hesabm/h2_Giri Yapma ve Gvenlik'))

WebUI.click(findTestObject('Object Repository/AccountInformation/Page_Amazon Ad Deitir, E-posta, Parola/input_Mohamed_auth-cnep-edit-name-button'))

WebUI.setText(findTestObject('Object Repository/AccountInformation/Page_Amazon Ad Deitir, E-posta, Parola/input_Yeni ad_customerName'), 
    'mohamed')

WebUI.click(findTestObject('Object Repository/AccountInformation/Page_Amazon Ad Deitir, E-posta, Parola/input_Yeni ad_cnep_1C_submit_button'))

WebUI.click(findTestObject('Object Repository/AccountInformation/Page_Amazon Ad Deitir, E-posta, Parola/a_Bitti'))

WebUI.closeBrowser()


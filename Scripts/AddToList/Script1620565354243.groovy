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

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_Merhaba, Giri yapn  Hesap ve Listeler    _a54e5c'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/AddToList/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'mohamed.2.kassem95@gmail.com')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu _e246cd'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/AddToList/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 
    'yYCHQKrnkaEeSW8wnmcRVA==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Tm Kategoriler_field-keywords'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/span_Tm'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_ok Satanlar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Amazon.com.tr ok Satanlar Amazondaki e_ae023c/a_Bahe'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Amazon.com.tr ok Satanlar Bahe adl lis_437253/div_2        Torf 20 LT iek Topra Saks Topr_bde115'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Object Repository/AddToList/Page_Amazon.com.tr ok Satanlar Bahe adl lis_437253/div_2        Torf 20 LT iek Topra Saks Topr_bde115'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Amazon.com.tr ok Satanlar Bahe adl lis_437253/div_Torf 20 LT iek Topra Saks Topra Doal To_39e384'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Torf 20 LT iek Topra Saks Topra Doal T_c51e4a/input_Tm ayrntlara bakn._submit.add-to-regi_36b1bd'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Torf 20 LT iek Topra Saks Topra Doal T_c51e4a/input_Tm ayrntlara bakn._submit.add-to-regi_36b1bd_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AddToList/Page_Torf 20 LT iek Topra Saks Topra Doal T_c51e4a/span_Grntle Liste'))

WebUI.delay(1)

WebUI.closeBrowser()


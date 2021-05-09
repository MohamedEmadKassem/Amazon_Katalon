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

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/span_Msr'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Teslimat seenekleri ve hz, teslimat a_007b33'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'Mohamed.2.kassem95@gmail.com')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu _e246cd'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 
    'yYCHQKrnkaEeSW8wnmcRVA==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/span_Istanbul 34860'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Orta Mahalle, niversite Caddesi, No27_ba530d'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_ok Satanlar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon.com.tr ok Satanlar Amazondaki e_ae023c/input_Tm Kategoriler_field-keywords'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon.com.tr ok Satanlar Amazondaki e_ae023c/a_Bahe'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon.com.tr ok Satanlar Bahe adl lis_437253/img'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Bosch Elektrikli im Bime Makinesi ARM _b944ff/input_Miktar_submit.add-to-cart'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Amazon.com.tr Alveri Sepeti/a_Alverii tamamla (2 rn)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Teslimat adresi sein/a_Bu adresi kullan'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Vergi bilgilerinizi girin/input_Kimliinizde yazld ekilde adnz ve soya_65723a'), 
    'Mohamed Kassem')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Vergi bilgilerinizi girin/div_TC Kimlik NumarasDaha fazla bilgi edini_c9d381'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Vergi bilgilerinizi girin/input_Daha fazla bilgi edinin_tax_registrat_947054'), 
    '23232422422')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AttemptToOrder(After Change)/Page_Vergi bilgilerinizi girin/input_Mohamed Emad Mohamed Kassem_a-button-input'))

WebUI.delay(1)

WebUI.closeBrowser()


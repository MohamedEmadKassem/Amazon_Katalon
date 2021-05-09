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

WebUI.click(findTestObject('Object Repository/AttemptToOrder/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.click(findTestObject('Object Repository/AttemptToOrder/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_ok Satanlar'))

WebUI.click(findTestObject('Object Repository/AttemptToOrder/Page_Amazon.com.tr ok Satanlar Amazondaki e_ae023c/img_Salk ve Bakm Kategorisinde ok Satanlar _cce84e'))

WebUI.click(findTestObject('Object Repository/AttemptToOrder/Page_Oral-B Cross Action Di Fras Yedek Bal,_9ebf18/input_Miktar_submit.add-to-cart'))

WebUI.click(findTestObject('Object Repository/AttemptToOrder/Page_Amazon.com.tr Alveri Sepeti/a_Alverii Tamamla (1 rn)'))

WebUI.setText(findTestObject('Object Repository/AttemptToOrder/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'mohamed.2.kassem95@gmail.com')

WebUI.click(findTestObject('Object Repository/AttemptToOrder/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu _e246cd'))

WebUI.setEncryptedText(findTestObject('Object Repository/AttemptToOrder/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 
    'yYCHQKrnkaEeSW8wnmcRVA==')

WebUI.click(findTestObject('Object Repository/AttemptToOrder/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.rightClick(findTestObject('Object Repository/AttemptToOrder/Page_Teslimat adresi sein/div_Mohamed Emad Mohamed KassemOrta Mahalle_3012d3'))

WebUI.click(findTestObject('Object Repository/AttemptToOrder/Page_Teslimat adresi sein/div_Mohamed Emad Mohamed KassemOrta Mahalle_3012d3'))

WebUI.click(findTestObject('Object Repository/AttemptToOrder/Page_Teslimat adresi sein/a_Bu adresi kullan'))

WebUI.setText(findTestObject('Object Repository/AttemptToOrder/Page_Vergi bilgilerinizi girin/input_Kimliinizde yazld ekilde adnz ve soya_65723a'), 
    'Mohamed Kassem')

WebUI.setText(findTestObject('Object Repository/AttemptToOrder/Page_Vergi bilgilerinizi girin/input_Daha fazla bilgi edinin_tax_registrat_947054'), 
    '39262792372')

WebUI.click(findTestObject('Object Repository/AttemptToOrder/Page_Vergi bilgilerinizi girin/input_Mohamed Emad Mohamed Kassem_a-button-input'))

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Object Repository/AmazonPrime/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AmazonPrime/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_Prime'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AmazonPrime/Page_Amazon.com.tr Amazon Prime/input_CRETSZ_a-button-input'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/AmazonPrime/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'mohamed.2.kassem95@gmail.com')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/AmazonPrime/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 
    'yYCHQKrnkaEeSW8wnmcRVA==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AmazonPrime/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/AmazonPrime/Page_Amazon Prime/span_Hayr, teekkrler'))

WebUI.delay(1)

WebUI.closeBrowser()


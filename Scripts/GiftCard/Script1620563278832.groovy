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

WebUI.click(findTestObject('Object Repository/GiftCard/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/span_Giri yap'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/GiftCard/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'mohamed.2.kassem95@gmail.com')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GiftCard/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu _e246cd'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/GiftCard/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 
    'yYCHQKrnkaEeSW8wnmcRVA==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GiftCard/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GiftCard/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_Mteri Hizmetleri'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GiftCard/Page_Amazon.com.tr Yardm Yardm/h3_Hediye Kartlar'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GiftCard/Page_/a_Hediye Kart Ykle'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GiftCard/Page_/i_Talep kodu nedir_a-icon a-icon-popover'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GiftCard/Page_/a_Talep kodu nedir'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GiftCard/Page_/button_ 1996-2021, Amazon.com, Inc. veya ba_058bef'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/GiftCard/Page_/input_Talep kodunu gir_applytoaccount'))

WebUI.delay(1)

WebUI.closeBrowser()


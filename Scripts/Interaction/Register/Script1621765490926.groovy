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

WebUI.click(findTestObject('Register/mmain/input_Ne yazk ki erez tercihleriniz kaydedilirken bir sorun olutu. Tekrar deneyin._accept'))

WebUI.click(findTestObject('Register/mmain/a_Merhaba, Giri yapn  Hesap ve Listeler        Hesap'))

WebUI.click(findTestObject('Register/Page_Amazon Giri Yap/oluturun'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register/Page_Amazon Kayd/input_Ad - Soyad_customerName'), 'Mo Salah')

WebUI.setText(findTestObject('Register/Page_Amazon Kayd/input_E-posta_email'), 'deneme@gmail.com')

WebUI.setText(findTestObject('Register/Page_Amazon Kayd/input_ifre_password'), 'Amazon1998')

WebUI.setText(findTestObject('Register/Page_Amazon Kayd/input_ifreyi tekrar girin_passwordCheck'), 'Amazon1998')

WebUI.click(findTestObject('Register/Page_Amazon Kayd/input_ifreler elemiyor_continue'))


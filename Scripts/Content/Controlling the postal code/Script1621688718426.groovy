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

WebUI.click(findTestObject('Content/Controlling the postal code/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.click(findTestObject('Content/Controlling the postal code/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/img_Amazon Prime Tek yelikte birok avantaja_6057fc'))

WebUI.setText(findTestObject('Content/Controlling the postal code/Page_Amazon.com.tr Amazon Prime Teslimat Ay_657992/input_Daha fazla bilgi_zipcodefield'), 
    '34912')

WebUI.click(findTestObject('Content/Controlling the postal code/Page_Amazon.com.tr Amazon Prime Teslimat Ay_657992/input_Daha fazla bilgi_a-button-input'))

WebUI.verifyTextPresent('Üzgünüz,', false)

WebUI.verifyTextPresent('34912 Prime Aynı Gün Teslimat bölgesinde değil.', false)

WebUI.closeBrowser()


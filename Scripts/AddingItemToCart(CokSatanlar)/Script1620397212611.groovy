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

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AddItemToCart(CokSatanlar)/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AddItemToCart(CokSatanlar)/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_ok Satanlar'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AddItemToCart(CokSatanlar)/Page_Amazon.com.tr ok Satanlar Amazondaki e_ae023c/img_Salk ve Bakm Kategorisinde ok Satanlar _cce84e'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddItemToCart(CokSatanlar)/Page_Xiaomi Mi Body Composition Scale 2 Tar_10bf2f/select_123456789101112131415'), 
    '2', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AddItemToCart(CokSatanlar)/Page_Xiaomi Mi Body Composition Scale 2 Tar_10bf2f/input_Miktar_submit.add-to-cart'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AddItemToCart(CokSatanlar)/Page_Amazon.com.tr Alveri Sepeti/a_Alveri Sepeti'))

WebUI.delay(2)

WebUI.closeBrowser()


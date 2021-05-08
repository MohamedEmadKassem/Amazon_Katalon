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



WebUI.setText(findTestObject('Object Repository/SearchItemAndPriceFilter/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Tm Kategoriler_field-keywords'), 
    'Usb kablo')

WebUI.click(findTestObject('Object Repository/SearchItemAndPriceFilter/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Tm Kategoriler_nav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/SearchItemAndPriceFilter/Page_Amazon.com.tr  Usb kablo/span_SralaAmazon sunar'))

WebUI.click(findTestObject('Object Repository/SearchItemAndPriceFilter/Page_Amazon.com.tr  Usb kablo/a_Fiyat Dkten Yksee'))

WebUI.click(findTestObject('Object Repository/SearchItemAndPriceFilter/Page_Amazon.com.tr Usb kablo/span_SralaFiyat Dkten Yksee'))

WebUI.click(findTestObject('Object Repository/SearchItemAndPriceFilter/Page_Amazon.com.tr Usb kablo/a_Fiyat Yksekten De'))

WebUI.click(findTestObject('Object Repository/SearchItemAndPriceFilter/Page_Amazon.com.tr Usb kablo/span_Fiyat Yksekten De'))

WebUI.click(findTestObject('Object Repository/SearchItemAndPriceFilter/Page_Amazon.com.tr Usb kablo/a_Mteri Yorumu'))

WebUI.click(findTestObject('Object Repository/SearchItemAndPriceFilter/Page_Amazon.com.tr Usb kablo/span_SralaMteri Yorumu'))

WebUI.click(findTestObject('Object Repository/SearchItemAndPriceFilter/Page_Amazon.com.tr Usb kablo/a_En Yeniler'))

WebUI.closeBrowser()


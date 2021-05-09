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

WebUI.setText(findTestObject('Object Repository/SearchBarAndFiltering/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Tm Kategoriler_field-keywords'), 
    'dell bilgisayar')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/SearchBarAndFiltering/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Tm Kategoriler_nav-search-submit-button'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/SearchBarAndFiltering/Page_Amazon.com.tr  dell bilgisayar/input_TL_low-price'), 
    '5000')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/SearchBarAndFiltering/Page_Amazon.com.tr  dell bilgisayar/input_TL_a-button-input'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/SearchBarAndFiltering/Page_Amazon.com.tr  dell bilgisayar/div_Dell Latitude 3510 N011L351015EMEA_U i5_25f37b'))

WebUI.delay(2)

WebUI.closeBrowser()


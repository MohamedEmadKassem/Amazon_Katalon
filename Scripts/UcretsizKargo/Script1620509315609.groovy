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

WebUI.click(findTestObject('Object Repository/UcretsizKargo/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/UcretsizKargo/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/a_30 gn boyunca cretsiz dene'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/UcretsizKargo/Page_Amazon.com.tr Amazon Prime/a_Prime ile bedava ve hzl kargoyu kefet'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/UcretsizKargo/Page_Amazon.com.tr Amazon Prime Teslimat Ay_657992/input_Daha fazla bilgi_zipcodefield'), 
    '34870')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/UcretsizKargo/Page_Amazon.com.tr Amazon Prime Teslimat Ay_657992/input_Daha fazla bilgi_a-button-input'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/UcretsizKargo/Page_Amazon.com.tr Amazon Prime Teslimat Ay_657992/div_Bedava, Ayn Gn TeslimatGeerli rnlerdeAm_d32986'))

WebUI.delay(2)

WebUI.closeBrowser()


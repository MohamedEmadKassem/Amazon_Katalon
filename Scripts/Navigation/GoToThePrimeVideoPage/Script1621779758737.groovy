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

WebUI.click(findTestObject('GoToPrimeVideoPage/home/cookies'))

WebUI.scrollToElement(findTestObject('GoToPrimeVideoPage/home/PrimeContainer'), 0)

WebUI.waitForElementVisible(findTestObject('GoToPrimeVideoPage/home/PrimeVideo'), 5)

WebUI.focus(findTestObject('GoToPrimeVideoPage/home/PrimeVideo'))

WebUI.click(findTestObject('GoToPrimeVideoPage/home/PrimeVideo'))

WebUI.getUrl()

WebUI.verifyLinksAccessible(['https://www.primevideo.com/'])

WebUI.delay(1)

WebUI.click(findTestObject('Page_Prime Videoya Ho Geldiniz/span_imdi izleyin, istediiniz zaman iptal edin._dv-overlay'))

WebUI.setText(findTestObject('GoToPrimeVideoPage/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'serhan-ediz@hotmail.com')

WebUI.setText(findTestObject('GoToPrimeVideoPage/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 'Amazon1998')

WebUI.click(findTestObject('GoToPrimeVideoPage/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))


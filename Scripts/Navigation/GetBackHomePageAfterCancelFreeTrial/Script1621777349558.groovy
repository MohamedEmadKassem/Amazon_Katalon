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

WebUI.openBrowser('https://www.amazon.com.tr/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GetBackHomeAfterCancelFreeTrial/Home/cookies'))

WebUI.scrollToElement(findTestObject('GetBackHomeAfterCancelFreeTrial/Home/primeAmazon'), 0)

WebUI.waitForElementVisible(findTestObject('GetBackHomeAfterCancelFreeTrial/Home/a_30 gn boyunca cretsiz dene'), 5)

WebUI.focus(findTestObject('GetBackHomeAfterCancelFreeTrial/Home/a_30 gn boyunca cretsiz dene'))

WebUI.click(findTestObject('GetBackHomeAfterCancelFreeTrial/Home/a_30 gn boyunca cretsiz dene'))

WebUI.verifyLinksAccessible(['https://www.amazon.com.tr/prime'])

WebUI.scrollToPosition(0, 500)

WebUI.scrollToElement(findTestObject('GetBackHomeAfterCancelFreeTrial/Page_Amazon.com.tr Amazon Prime/container free prime'), 
    0)

WebUI.waitForElementVisible(findTestObject('GetBackHomeAfterCancelFreeTrial/Page_Amazon.com.tr Amazon Prime/input_concat(Amazon Prime, , da herkese gre bir ayrcalk var)_a-button-input'), 
    5)

WebUI.focus(findTestObject('GetBackHomeAfterCancelFreeTrial/Page_Amazon.com.tr Amazon Prime/input_concat(Amazon Prime, , da herkese gre bir ayrcalk var)_a-button-input'))

WebUI.click(findTestObject('GetBackHomeAfterCancelFreeTrial/Page_Amazon.com.tr Amazon Prime/input_concat(Amazon Prime, , da herkese gre bir ayrcalk var)_a-button-input'))

WebUI.setText(findTestObject('GetBackHomeAfterCancelFreeTrial/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'serhan-ediz@hotmail.com')

WebUI.setText(findTestObject('GetBackHomeAfterCancelFreeTrial/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 'Amazon1998')

WebUI.click(findTestObject('GetBackHomeAfterCancelFreeTrial/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.scrollToPosition(0, 800)

WebUI.click(findTestObject('GetBackHomeAfterCancelFreeTrial/Page_Amazon Prime/a_Hayr, teekkrler. Amazon Primea imdi ye olmak istemiyorum'))


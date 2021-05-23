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

WebUI.click(findTestObject('HomepageToPrime/home/cookies'))

WebUI.scrollToElement(findTestObject('HomePageToPrimeGaming/home/prime'), 0)

WebUI.waitForElementVisible(findTestObject('HomePageToPrimeGaming/home/a_30 gn boyunca cretsiz dene'), 0)

WebUI.focus(findTestObject('HomepageToPrime/prime/a_30 gn boyunca cretsiz dene'))

WebUI.click(findTestObject('HomepageToPrime/prime/a_30 gn boyunca cretsiz dene'))

WebUI.verifyLinksAccessible(['https://www.amazon.com.tr/prime'])

WebUI.scrollToPosition(0, 400)

WebUI.delay(1)

WebUI.click(findTestObject('HomePageToPrimeGaming/Page_Amazon.com.tr Amazon Prime/div_Prime Gaming'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 800)

WebUI.click(findTestObject('HomePageToPrimeGaming/Page_Amazon.com.tr Amazon Prime/a_Prime Gamingi kefet'))

WebUI.verifyLinksAccessible(['https://gaming.amazon.com/intro?ref=primegaming_tr_pmp'])


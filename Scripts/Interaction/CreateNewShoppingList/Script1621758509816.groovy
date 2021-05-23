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

WebUI.click(findTestObject('Interaction/CreateNewShoppingList/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/input_Ne yazk ki erez tercihleriniz kaydedi_db1643'))

WebUI.click(findTestObject('Interaction/CreateNewShoppingList/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/span_Hesap ve Listeler'))

WebUI.setText(findTestObject('Interaction/CreateNewShoppingList/Page_Amazon Giri Yap/input_E-posta adresi veya telefon numaras_email'), 
    'serhan-ediz@hotmail.com')

WebUI.click(findTestObject('Interaction/CreateNewShoppingList/Page_Amazon Giri Yap/input_E-posta adresinizi veya cep telefonu _e246cd'))

WebUI.setEncryptedText(findTestObject('Interaction/CreateNewShoppingList/Page_Amazon Giri Yap/input_ifremi unuttum_password'), 
    'CDPLGu8eTw6JheauVworMA==')

WebUI.click(findTestObject('Interaction/CreateNewShoppingList/Page_Amazon Giri Yap/input_ifrenizi girin_signInSubmit'))

WebUI.delay(1)

WebUI.mouseOver(findTestObject('Interaction/CreateNewShoppingList/Page_Amazon.com.tr Elektronik, bilgisayar, _45db13/span_Liste Oluturun'))

WebUI.click(findTestObject('Interaction/CreateNewShoppingList/Page_Amazon.com.tr/input_Daha fazla bilgi aln_a-button-input a_25fdb8'))

WebUI.delay(1)

WebUI.closeBrowser()


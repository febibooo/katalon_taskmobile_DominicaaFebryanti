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

Mobile.startApplication('Solodroid.apk', false)

Mobile.verifyElementVisible(findTestObject('taskBar/text_help'), 0)

Mobile.tap(findTestObject('taskBar/text_help'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/title_Help'), 0)

Mobile.tap(findTestObject('helpTab/textbtn_How to order'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/hot to order page/text_howToShop'), 0)

Mobile.tap(findTestObject('helpTab/hot to order page/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/textbtn_Payment'), 0)

Mobile.tap(findTestObject('helpTab/textbtn_Payment'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/payment page/text_infoPayment'), 0)

Mobile.tap(findTestObject('helpTab/payment page/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/textbtn_Shipping'), 0)

Mobile.tap(findTestObject('helpTab/textbtn_Shipping'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/shipping page/text_shippinginfo'), 0)

Mobile.tap(findTestObject('helpTab/shipping page/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/textbtn_Profile'), 0)

Mobile.tap(findTestObject('helpTab/textbtn_Profile'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/profile page/text_profileinfo'), 0)

Mobile.tap(findTestObject('helpTab/profile page/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/textbtn_Contact us'), 0)

Mobile.tap(findTestObject('helpTab/textbtn_Contact us'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/contact us page/text_infoContactUs'), 0)

Mobile.tap(findTestObject('helpTab/contact us page/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('helpTab/textbtn_How to order'), 0)

Mobile.closeApplication()


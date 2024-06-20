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

Mobile.verifyElementVisible(findTestObject('recentTab/title_topE-Commerce Android App'), 0)

Mobile.tap(findTestObject('taskBar/img_category'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/textbtn_ElectronicsGadgets'), 0)

Mobile.tap(findTestObject('categoryTab/textbtn_ElectronicsGadgets'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/electronics page/textbtn_humidifier'), 0)

Mobile.tap(findTestObject('categoryTab/electronics page/textbtn_humidifier'), 0)

Mobile.verifyElementVisible(findTestObject('product page/btn_add to cart'), 0)

Mobile.tap(findTestObject('product page/btn_add to cart'), 0)

Mobile.verifyElementVisible(findTestObject('product page/popUp_add to cart/text_numberOfOrder'), 0)

Mobile.setText(findTestObject('product page/popUp_add to cart/inputtext_numberOfOrder'), '1', 0)

Mobile.tap(findTestObject('product page/popUp_add to cart/btn_add'), 0)

Mobile.verifyElementVisible(findTestObject('product page/text_infoHumidifier'), 0)

Mobile.verifyElementVisible(findTestObject('product page/btn_cart'), 0)

Mobile.tap(findTestObject('product page/btn_cart'), 0)

Mobile.verifyElementVisible(findTestObject('shopping cart page/btn_checkout'), 0)

Mobile.tap(findTestObject('shopping cart page/btn_checkout'), 0)

Mobile.verifyElementVisible(findTestObject('checkout page/btn_processCheckout'), 0)

Mobile.tap(findTestObject('checkout page/btn_processCheckout'), 0)

Mobile.verifyElementVisible(findTestObject('checkout page/popUp_process_Checkout/title_ProcessCheckout'), 0)

Mobile.tap(findTestObject('checkout page/popUp_process_Checkout/btn_yes'), 0)

Mobile.verifyElementVisible(findTestObject('checkout page/popUp_please wait/text_pleaseWait'), 0)

Mobile.verifyElementVisible(findTestObject('checkout page/popUp congratulation/text_congratulation'), 0)

Mobile.tap(findTestObject('checkout page/popUp congratulation/btn_ok'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/textbtn_ElectronicsGadgets'), 0)

Mobile.closeApplication()


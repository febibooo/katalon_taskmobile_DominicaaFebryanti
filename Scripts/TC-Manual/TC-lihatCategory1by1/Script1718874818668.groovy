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

WebUI.callTestCase(findTestCase('BlockTC/block-startApk'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('taskBar/text_category'), 0)

Mobile.tap(findTestObject('taskBar/text_category'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/textbtn_ElectronicsGadgets'), 0)

Mobile.tap(findTestObject('categoryTab/textbtn_ElectronicsGadgets'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/btn_back'), 0)

Mobile.tap(findTestObject('categoryTab/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/textbtn_Fashions'), 0)

Mobile.tap(findTestObject('categoryTab/textbtn_Fashions'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/btn_back'), 0)

Mobile.tap(findTestObject('categoryTab/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/textbtn_BabyGear'), 0)

Mobile.tap(findTestObject('categoryTab/textbtn_BabyGear'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/btn_back'), 0)

Mobile.tap(findTestObject('categoryTab/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/textbtn_HomeFurniture'), 0)

Mobile.tap(findTestObject('categoryTab/textbtn_HomeFurniture'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/btn_back'), 0)

Mobile.tap(findTestObject('categoryTab/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/textbtn_HealthSports'), 0)

Mobile.tap(findTestObject('categoryTab/textbtn_HealthSports'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/btn_back'), 0)

Mobile.tap(findTestObject('categoryTab/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/textbtn_OfficeIndustry'), 0)

Mobile.tap(findTestObject('categoryTab/textbtn_OfficeIndustry'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/btn_back'), 0)

Mobile.tap(findTestObject('categoryTab/btn_back'), 0)

Mobile.verifyElementVisible(findTestObject('categoryTab/textbtn_OfficeIndustry'), 0)

Mobile.closeApplication()


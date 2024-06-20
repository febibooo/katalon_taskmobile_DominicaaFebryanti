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

Mobile.verifyElementVisible(findTestObject('taskBar/text_profile'), 0)

Mobile.tap(findTestObject('taskBar/text_profile'), 0)

Mobile.verifyElementVisible(findTestObject('profileTab/btn_edit'), 0)

Mobile.tap(findTestObject('profileTab/btn_edit'), 0)

Mobile.verifyElementVisible(findTestObject('editPage/textbtn_editName'), 0)

Mobile.tap(findTestObject('editPage/textbtn_editName'), 0)

Mobile.verifyElementVisible(findTestObject('editPage/popUp_editName/btn_ok'), 0)

Mobile.setText(findTestObject('editPage/popUp_editName/inputtext_name'), 'Alin', 0)

Mobile.tap(findTestObject('editPage/popUp_editName/btn_ok'), 0)

Mobile.verifyElementVisible(findTestObject('editPage/textbtn_editEmail'), 0)

Mobile.tap(findTestObject('editPage/textbtn_editEmail'), 0)

Mobile.verifyElementVisible(findTestObject('editPage/popUp_editEmail/btn_ok'), 0)

Mobile.setText(findTestObject('editPage/popUp_editEmail/inputtext_email'), 'alini@examgmail.com', 0)

Mobile.tap(findTestObject('editPage/popUp_editEmail/btn_ok'), 0)

Mobile.verifyElementVisible(findTestObject('editPage/textbtn_editPhoneNumber'), 0)

Mobile.tap(findTestObject('editPage/textbtn_editPhoneNumber'), 0)

Mobile.verifyElementVisible(findTestObject('editPage/popUp_editPhoneNumber/btn_ok'), 0)

Mobile.setText(findTestObject('editPage/popUp_editPhoneNumber/inputtext_phoneNumber'), '+62123456789', 0)

Mobile.tap(findTestObject('editPage/popUp_editPhoneNumber/btn_ok'), 0)

Mobile.verifyElementVisible(findTestObject('editPage/textbtn_editAddress'), 0)

Mobile.tap(findTestObject('editPage/textbtn_editAddress'), 0)

Mobile.verifyElementVisible(findTestObject('editPage/popUp_editAddress/title_address'), 0)

Mobile.setText(findTestObject('editPage/popUp_editAddress/inputtext_editAddress'), 'Banjarmasin City', 0)

Mobile.tap(findTestObject('editPage/popUp_editAddress/btn_ok'), 0)

Mobile.verifyElementVisible(findTestObject('editPage/textbtn_editName'), 0)

Mobile.closeApplication()


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://en-gb.facebook.com/login/')

WebUI.setText(findTestObject('Object Repository/Test1.OR/Page_Log in to Facebook  Facebook/input_Log in to Facebook_email'), 
    'simran.bindra999@gmail.com')



WebUI.click(findTestObject('Object Repository/Test1.OR/Page_Log in to Facebook  Facebook/button_Log In'))

findTestObject('Object Repository/Test1.OR/Page_Log in to Facebook  Facebook/div_The password that youve entered is incorrect Forgotten password')
WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)


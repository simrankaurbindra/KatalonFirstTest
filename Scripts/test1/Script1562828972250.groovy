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

WebUI.openBrowser('www.limeroad.com')

WebUI.click(findTestObject('Object Repository/loginTest/Page_Limeroad/div_SHOP WOMEN'))

//if(findTestObject('Object Repository/loginTest/Page_Limeroad/div_Love what you see        Check out our curated selection                            Not now                    Allow'))
//{
//WebUI.click(findTestObject('Object Repository/loginTest/Page_Limeroad/div_Allow'))
//}
WebUI.click(findTestObject('loginTest/Page_Limeroad/svg_Copyright  2019 Limeroadcom_thmC w24 h24 cF'))

WebUI.click(findTestObject('Object Repository/loginTest/Page_Limeroad/a_sign in'))

WebUI.setText(findTestObject('Object Repository/loginTest/Page_Sign In/label_Email ID or Mobile Number'), 'Simran.kaur@limeroad.com')

WebUI.closeBrowser()


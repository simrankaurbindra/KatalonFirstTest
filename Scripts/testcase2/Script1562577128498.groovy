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

WebUI.openBrowser('https://www.limeroad.com/')

WebUI.verifyElementClickable(findTestObject('test2.OR/Page_Limeroad/span_SHOP MEN'))

WebUI.verifyElementClickable(findTestObject('test2.OR/Page_Limeroad/span_SHOP WOMEN'))

WebUI.click(findTestObject('test2.OR/Page_Limeroad/span_SHOP WOMEN'))

if (findTestObject('Object Repository/test2.OR/Page_Limeroad/div_Love what you see        Check out our curated selection')) 
{
	WebUI.click(findTestObject('Object Repository/test2.OR/Page_Limeroad/div_Allow'))
}

WebUI.verifyElementClickable(findTestObject('test2.OR/Page_Limeroad/img_winter wear_w60 h60 mA mt6 dIb vM pR an-ll o0'))

WebUI.clickImage(findTestObject('test2.OR/Page_Limeroad/img_winter wear_w60 h60 mA mt6 dIb vM pR an-ll o0'))

WebUI.clickImage(findTestObject('test2.OR/Page_Limeroad/div_ 458           999           54 off                      by Anuttara Fashions'))

WebUI.click(findTestObject('test2.OR/Page_Pom Pom Detail Drawstring Top/div_M'))

WebUI.closeBrowser()


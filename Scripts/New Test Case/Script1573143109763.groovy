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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamikos.com/')

WebUI.rightClick(findTestObject('Object Repository/Page_Mamikos - Cari Kost Apartemen Loker Gampang  Akurat/input__downloadViaEmail'))

WebUI.setText(findTestObject('Object Repository/Page_Mamikos - Cari Kost Apartemen Loker Gampang  Akurat/input__downloadViaEmail'), 
    '098032809@9-090.01010')

WebUI.setText(findTestObject('Object Repository/Page_Mamikos - Cari Kost Apartemen Loker Gampang  Akurat/input_Kirim lewat SMS_downloadViaPhone'), 
    '0845646543')

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost Apartemen Loker Gampang  Akurat/span_Kirim Sekarang'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost Apartemen Loker Gampang  Akurat/div_Terjadi galat Silakan coba lagi'))

WebUI.click(findTestObject('Object Repository/Page_Mamikos - Cari Kost Apartemen Loker Gampang  Akurat/button_OK'))


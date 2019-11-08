package com.test.bakery

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class UtilitiesForBakery {

	@Keyword
	def printHello(){
		println(" 	Hello world.........")
	}

	@Keyword
	def verifyWindowTitle(String title){
		// wait for 2 seconds
		WebUI.delay(2)
		String titleWindow = WebUI.getWindowTitle()
		WebUI.verifyMatch(titleWindow, title, true)
	}

	@Keyword
	def verifyPageURLs(String url){
		// wait for 2 seconds
		WebUI.delay(2)
		String pageURL = WebUI.getUrl()
		WebUI.verifyMatch(pageURL, url, true)
	}
}

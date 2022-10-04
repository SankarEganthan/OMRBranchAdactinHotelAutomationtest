package org.runner;

import org.baseclass.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE, publish = true, dryRun = false, stepNotifications = true, monochrome = true, plugin = {"pretty", "json:target//Output.json"}, name = {"Verifying Adactin login with valid credentials"}, features="src\\test\\resources\\Features\\TC1_Login.feature", glue = "org.stepdefinition")
public class TestRunnerClass extends BaseClass{
	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMReport("C:\\Users\\User\\eclipse-workspace\\OMRBranchAdactinHotelAutomationtest\\target\\Output.json");
	}
}

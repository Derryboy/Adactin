package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.steps.GenerateReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\HP\\eclipse-workspace\\CucumberAdactin\\src\\test\\resources\\Login.feature",
		"C:\\Users\\HP\\eclipse-workspace\\CucumberAdactin\\src\\test\\resources\\SearchHotel.feature",
		"C:\\Users\\HP\\eclipse-workspace\\CucumberAdactin\\src\\test\\resources\\SelectHotel.feature",
		"C:\\Users\\HP\\eclipse-workspace\\CucumberAdactin\\src\\test\\resources\\TBookHotel.feature",
		"C:\\Users\\HP\\eclipse-workspace\\CucumberAdactin\\src\\test\\resources\\TBookingConfirmation.feature" }, 
		dryRun = false, 
		glue = "org.steps", 
		monochrome = true,
		// plugin= {"html:C:\\Users\\HP\\eclipse-workspace\\CucumberAdactin\\target"}
		plugin = { "json:C:\\Users\\HP\\eclipse-workspace\\CucumberAdactin\\target\\output.json" })
public class TestRunner {

	@AfterClass
	public static void generateReport() {
		GenerateReport.generate("C:\\Users\\HP\\eclipse-workspace\\CucumberAdactin\\target\\output.json");
	}
}

package org.steps;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReport {
	public static void generate(String json) {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\CucumberAdactin\\target\\final.html");
		Configuration c = new Configuration(f, "Final Report");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Client", "Adactin Hotel");
		c.addClassifications("Automation Tool Version", "3.141.59");
		
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
	}
}

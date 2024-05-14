package org.runnerfile;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.generate.RepoJvm;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", 
                 glue="org.stepdefinition", 
                 monochrome=true,
                 plugin= {"html:target\\HTML", "junit:target\\JUNIT\\JunitReport.xml", "json:target\\JSON\\JsonReport.json"})
public class TestRunnerClass {
	
	@AfterClass
	public static void reportGen() {

		RepoJvm.repoGeneration("C:\\Users\\VISHAL\\eclipse-workspace\\TrackDefectProject\\target\\JSON\\JsonReport.json");
	}

} 

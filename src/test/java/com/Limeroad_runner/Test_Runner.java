package com.Limeroad_runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\VENKATESAN\\eclipse-workspace\\Lime_Road\\src\\test\\java\\com\\Lime_feature\\lime.feature",glue = "com.stepdef",
//monochrome = true,+
				
dryRun = false,
tags = "@smoke",
plugin = {"pretty","json:Resources/lime.json","html:res/lime.html",
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	
}

)

public class Test_Runner extends Base_Class {
	
	@BeforeClass
	public static void launchbrowser() {
		
		
		
		
		Launch_Browser("chrome");
		
	}

}


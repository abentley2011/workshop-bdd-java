package com.siq.workshops.bdd.test.petstore.features;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/petstore/features")
public class PetstorePricingTest {}

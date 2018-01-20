package io.odair;

import io.odair.properties.PropertyReader;

public class App {
	public static void main(String[] args) {
		System.out.println(String.format("Environment atual: %s", PropertyReader.readProperty("app.environment")));
		System.out.println(String.format("Endpoint atual: %s", PropertyReader.readProperty("app.endpoint")));
	}
}

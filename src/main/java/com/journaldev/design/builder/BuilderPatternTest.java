package com.journaldev.design.builder;

public class BuilderPatternTest {

	public static void main(String[] args) {
		
		Builder<Computer> compBuilder = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true);
		
		Computer comp1 = compBuilder.build();
		
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println(comp.toString());
	}

}

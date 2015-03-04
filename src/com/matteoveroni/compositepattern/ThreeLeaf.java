package com.matteoveroni.compositepattern;

/**
 * @author Matteo Veroni
 */

public class ThreeLeaf extends ThreeComponent {

	private final String leafName;
	private final int leafValue;

	public ThreeLeaf(String leafName, int leafValue) {
		this.leafName = leafName;
		this.leafValue = leafValue;
	}

	@Override
	public void componentInfo() {
		System.out.println("Leaf Name: '" + leafName + "'\t Leaf Value: '" + leafValue + "'");
	}

}

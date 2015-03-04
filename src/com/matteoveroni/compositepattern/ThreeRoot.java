package com.matteoveroni.compositepattern;

import java.util.ArrayList;

/**
 * @author Matteo Veroni
 */

public class ThreeRoot extends ThreeComponent {

	private final String rootName;
	private final ArrayList<ThreeComponent> threeComponents;

	public ThreeRoot(String rootName) {
		this.rootName = rootName;
		threeComponents = new ArrayList<>();
	}

	@Override
	public void add(ThreeComponent nuovoComponente) {
		threeComponents.add(nuovoComponente);
	}

	@Override
	public void componentInfo() {

		System.out.println("Root Name: '" + rootName + "'");

		for (ThreeComponent visitedComponent : threeComponents) {
			visitedComponent.componentInfo();
		}

	}

}

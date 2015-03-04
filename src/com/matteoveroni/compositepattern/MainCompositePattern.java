package com.matteoveroni.compositepattern;

/**
 * @author Matteo Veroni
 */

public class MainCompositePattern {

    public static void main(String[] args) {
        
            ThreeComponent mainRoot = new ThreeRoot("main root");
            
            ThreeComponent leftRoot = new ThreeRoot("left root");
            ThreeComponent rightRoot = new ThreeRoot("right root");
            
            mainRoot.add(leftRoot);
            mainRoot.add(rightRoot);
            
            ThreeComponent leaf1LeftRoot = new ThreeLeaf("Leaf 1 left root", 1);
            ThreeComponent leaf2LeftRoot = new ThreeLeaf("Leaf 2 left root", 2);
            
            leftRoot.add(leaf1LeftRoot);
            leftRoot.add(leaf2LeftRoot);
            
            mainRoot.componentInfo();
    }
}

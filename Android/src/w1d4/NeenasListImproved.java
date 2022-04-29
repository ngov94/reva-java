package w1d4;

import w1d3.NeenasList;

public class NeenasListImproved<T> extends NeenasList implements Interfaceable{
	/*
	 * inheritance: NeenasListImproved has inherited all of the behavior of NeenasList
	 * 			All objects also inherit the default methods of the Object class
	 * polymorphism: NeenasListImproved can overwrite the methods of TedsList
	 * 			All objects can overwrite the methods they inherit from the Object class
	 * encapsulation: an object is able to hide its data within itself
	 * 		We use access modifiers to restrict information from otehr objects
	 * 			Why? let's say we have an arrayList where the physical length of the arraylist 
	 * 			is arbitrary.. we don't want the future developer to access information like that
	 * abstraction: we hide the true implementation of our objects from future developers
	 * 			The typical real world example is "a car works even if we don't understand how the engine works
	 * 			Our example is more like "we can simplify how the arraylist works into a human readable format"
	 * 				(ie we don't need to reveal to the future developers how the array expansion
	 * 				happens when they are adding objects)
	 */
	
	@Override
	public void addToFront(Object w) {
		System.out.println("Streamlining adding to the front capability!");
		super.addToFront(w);
	}
	
	@Override
	public void interfacate() {
		
	}
}

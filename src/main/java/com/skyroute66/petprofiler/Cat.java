
package com.skyroute66.petprofiler;

// Task 2: inherit from the Pet class
public class Cat extends Pet {
    
    
    // constructor

    // Task 2: add someName and someAge to the constructor
    
    public Cat(String someName, int someAge) {
        
        // Task 2: call constructor of ancestor class Pet
        // Task 3: add multiplier 8 to constructor call
        super(someName, someAge, 8);
    }
    
    @Override public String selfDescribe(){
        return "This is cat! " + super.selfDescribe();
    }
    
    // methods

    // Task 4: Override selfDescribe() from ancester class.
    //         Call ancester's selfDescribe() then
    //         Add text "Fun cat ready to party! " to string returned

    
}

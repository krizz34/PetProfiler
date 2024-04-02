
package com.skyroute66.petprofiler;

// Task 5: Step 1: make Goldfish a descendent of Pet

public class Goldfish extends Pet{
    
    // constructor
    
    // Task 5: Step 2: pass 2 parameters someName (String) and someAge (int) to
    //         the constructor of the ancestor class
    
    public Goldfish(String someName, int someAge) {
        super(someName, someAge, 9);
    }
    
    @Override public String selfDescribe(){
        return "This is Goldfish! My name is " + name + ", and I am " + age 
                + " year(s) old. And all I do is swim around and nap all day...!";
    }
    
    // methods
    
    // Task 5: Step 4: 
    //  override the method selfDescribe()
    //  return a string like this WITHOUT calling the ancestor's method:
    //  "Hello, my name is <name>. I am a goldfish and I am <age> year(s) old. I swim around and nap all day!"
    
}

package Cycle;

public class Cycle {
    public static void main(String[] args) {
        Cycle []cycles=new Cycle[3];
        cycles[0]=new Unicycle();
        cycles[1]=new Bicycle();
        cycles[2]=new Tricycle();
        for(Cycle cycle:cycles){
           cycle.balance(); // balance() method is not present in Cycle base class that's the reason this line gives error
        }
        Unicycle unicycle= (Unicycle) cycles[0];
        unicycle.balance();
        Bicycle bicycle= (Bicycle) cycles[1];
        bicycle.balance();
        Tricycle tricycle = (Tricycle) cycles[2];
        tricycle.balance(); // As tricycle class does not contain the method balance() this line gives error
    }
}
/* Whenever the reference is of base type and pointing to object of Child class then the methods called on reference
 are checked in Base class at compile time and if those methods are overridden in child class then child class methods
are called at runtime.This process is known as run time polymorphism. */
package Rodents;

public class Hamster extends Rodent {
    public Hamster(){
        System.out.println("This is a Hamster");
    }

    @Override
    public void sizeOfEars() {
        System.out.println("Hamsters have medium sized ears");
    }

    @Override
    public void tailLength() {
        System.out.println("Hamsters have small tail or no tail at all");
    }
}

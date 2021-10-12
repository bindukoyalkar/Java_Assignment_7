package Rodents;

public class Mouse extends Rodent {
    public Mouse(){
        System.out.println("This is a Mouse");
    }

    @Override
    public void sizeOfEars() {
        System.out.println("Mouse have massive ears");
    }

    @Override
    public void tailLength() {
        System.out.println("Mouse have long tail");
    }
}

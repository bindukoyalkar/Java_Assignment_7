package Rodents;

public class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("This is a Gerbil");
    }

    @Override
    public void sizeOfEars() {
        System.out.println("Gerbils have small ears");
    }

    @Override
    public void tailLength() {
        System.out.println("Gerbils have long tail");
    }
}

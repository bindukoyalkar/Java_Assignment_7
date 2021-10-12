package Rodents;

import java.util.ArrayList;
import java.util.List;

public abstract class Rodent {
    public Rodent(){
        System.out.println("This is a Rodent");
    }
    public abstract void sizeOfEars();
    public abstract void tailLength();
    public void size(){
        System.out.println("Rodents can fit in our palm");
    }

    public static void main(String[] args) {
        List<Rodent> groupOfrodents=new ArrayList<>();
        groupOfrodents.add(new Mouse());
        groupOfrodents.add(new Hamster());
        groupOfrodents.add(new Gerbil());
        for(Rodent rodent:groupOfrodents){
            rodent.size();
            rodent.sizeOfEars();
            rodent.tailLength();
        }
    }
}

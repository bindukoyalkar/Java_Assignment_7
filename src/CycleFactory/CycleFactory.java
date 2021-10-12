package CycleFactory;

public class CycleFactory {
    public Cycle kindOfCycle(String type){
        if(type.equals("Unicycle"))
            return new Unicycle();
        if(type.equals("Bicycle"))
            return new Bicycle();
        if(type.equals("Tricycle"))
            return new Tricycle();
        return null;
    }
}

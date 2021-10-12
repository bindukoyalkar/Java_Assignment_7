package CycleFactory;

public class Main {
    public static void main(String[] args) {
        CycleFactory factory=new CycleFactory();
        String cycleType ="Unicycle";
        Cycle cycle=factory.kindOfCycle(cycleType);
        cycle.ride();
        String bicycle ="Bicycle";
        Cycle ofCycle=factory.kindOfCycle(bicycle);
        ofCycle.ride();
    }
}

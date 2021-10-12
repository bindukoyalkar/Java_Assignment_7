package InterfaceAsMethodParameter;

public class ConcreteClass extends Operations implements Calculator{
    public static void main(String[] args) {
        ConcreteClass concrete= new ConcreteClass();
        concrete.addition(concrete);
        concrete.subtraction(concrete);
        concrete.multiplication(concrete);
        concrete.calculation(concrete);
    }

    @Override
    public int division(int x, int y) {
        if(y!=0){
            x=x/y;
            return x;
        }
        else return -1;
    }

    @Override
    public String printDivision(int x, int y) {
        return "The division of"+Integer.toString(x)+"by"+Integer.toString(y)+"is:"
                +Integer.toString(division(x,y));
    }

    @Override
    public int multiply(int x, int y) {
        return x*y;
    }

    @Override
    public String printMultiply(int x, int y) {
        return "The multiplication of"+Integer.toString(x)+"with"+Integer.toString(y)+"is:"
                +Integer.toString(multiply(x,y));
    }

    @Override
    public int subtract(int x, int y) {
        return x-y;
    }

    @Override
    public String printSubtract(int x, int y) {
        return "The subtraction of"+Integer.toString(y)+"from"+Integer.toString(x)+"is:"
                +Integer.toString(subtract(x,y));
    }

    @Override
    public int sum(int x, int y) {
        return x+y;
    }

    @Override
    public String printSum(int x, int y) {
        int additionValue=sum(x,y);
        return "The addition of"+Integer.toString(x)+"with"+Integer.toString(y)+"is:"
                +Integer.toString(additionValue);
    }
    public void addition(Sum plus){
        System.out.println("Sum class computes addition");
    }
    public void subtraction(Subtract minus){
        System.out.println("Subtract class computes subtraction");
    }
    public void multiplication(Multiply product){
        System.out.println("Multiply class computes multiplication");
    }
    public void calculation(Calculator calc){
        System.out.println("Calculator class computes all BODMAS calculations");
    }
}

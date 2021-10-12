package InterfaceAsMethodParameter;

public interface Calculator extends Sum,Subtract,Multiply{
    int division(int x,int y);
    String printDivision(int x,int y);
}

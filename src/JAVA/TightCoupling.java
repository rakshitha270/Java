package JAVA;
class Laptop{
    public void compile(){
        System.out.println("compiling......");
    }
}
class Programmer{
    public void code(JAVA.Prog.Laptop lap){
        System.out.println("coding.......");
        lap.compile();
    }
}
public class TightCoupling {
    public static void main(String[]args){
        JAVA.Prog.Laptop laptop=new JAVA.Prog.Laptop();
        JAVA.Prog.Programmer programmer=new JAVA.Prog.Programmer();
        programmer.code(laptop);
    }
}

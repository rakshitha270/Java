package JAVA.Prog;
interface Computer{
    void compile();
}
class Laptop implements Computer{
    public void compile(){
        System.out.println("Compiling in Laptop.......");
    }
}
class Desktop implements Computer{
    public void compile(){
        System.out.println("Compiling in Desktop....");
    }
}
class Programmer{
    public void code(Computer com){
        System.out.println("Coding......");
        com.compile();
    }
}
public class LooseCoupling {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Programmer programmer = new Programmer();
        programmer.code(laptop);
        programmer.code(desktop);
    }
}




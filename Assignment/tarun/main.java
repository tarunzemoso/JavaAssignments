package tarun.assignment;

public class main {
    static void method(){
        singleton secondObject=singleton.method("a");
        secondObject.print();
    }
    public static void main(String[] args){
        Assignment5 fristObject=new Assignment5();
        fristObject.printvalues();
        fristObject.printLocalValues();
    }
}

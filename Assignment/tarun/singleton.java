package tarun.assignment;

public class singleton {
    String variable;
    static singleton method(String string){
        //variable=string; variable is non-static member hence can't be referred in static method
        return new singleton();
    }
    void print(){
        System.out.println(variable);
    }
}
class Exception1 extends Exception{
    Exception1(String one){
        super(one);
    }
}
class Exception2 extends Exception{
    Exception2(String one){
        super(one);
    }
}
class Exception3 extends Exception{
    Exception3(String one){
        super(one);
    }
}
class Method{
    void method() throws Exception1{
       throw new Exception1("Type 1 Exception");
    }
    void method1() throws Exception2{
        throw new Exception2("Type 1 Exception");

    }
    void method2() throws Exception3{
        throw new Exception3("Type 1 Exception");
    }
}

public class Assignment8 {
    public static void main(String[] args){
        Method object=new Method();
        try {
            object.method();
        }
        catch(Exception e){

        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}

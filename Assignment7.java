class Cycle {

    int NumberOfWheels() {
        return 0;
    }
}

class Unicycle extends Cycle {

    @Override
    int NumberOfWheels() {
        return 1;
    }

    void balance() {
        System.out.println("Unicycle.balance()");
    }
}

class Bicycle extends Cycle {


    @Override
    int NumberOfWheels() {
        return 2;
    }

    void balance() {
        System.out.println("Bicycle.balance()");
    }
}

class Tricycle extends Cycle {

    @Override
    int NumberOfWheels() {
        return 3;
    }
}
abstract class Rodent{
    abstract void eat();
    abstract void jump();

}
class Mouse extends Rodent {
    Mouse(){
        System.out.println("Mouse");
    }
    void eat(){
        System.out.println("Mouse.eats");
    }
    void jump(){
        System.out.println("Mouse.jumps");
    }
}
class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("Gerbil");
    }
    void eat(){
        System.out.println("Gerbil.eats");
    }
    void jump(){
        System.out.println("Gerbil.jumps");
    }
}
class Hamster extends Rodent {
    Hamster(){
        System.out.println("Hamster");
    }
    void eat(){
        System.out.println("Hamster.eats");
    }
    void jump(){
        System.out.println("Hamster.jumps");
    }
}

interface interfaceOne{

}
interface interfaceTwo{

}
interface interfaceThree{

}
interface combinedInterface extends interfaceOne,interfaceTwo,interfaceThree{
    void newMethod();
}
class implementingClass extends concreteClass implements combinedInterface {

    @Override
    public void newMethod() {

    }
    public void one(interfaceOne objectOne){

    }
    public void two(interfaceOne objectTwo){

    }
    public void three(interfaceOne objectThree){

    }
}
class concreteClass{

}
interface CycleType{
    void ride();
}
interface CycleFactory{
    CycleType getCycle();
}

class UniCycleType implements CycleType{
    public void ride(){
        System.out.println("Riding Uni");
    }
}
class UniFactory implements CycleFactory{
    public CycleType getCycle(){
        return new UniCycleType();
    }
}

class BicycleType implements CycleType{
    public void ride(){
        System.out.println("Riding Bi");
    }
}
class BiFactory implements CycleFactory{
    public CycleType getCycle(){
        return new BicycleType();
    }
}

class TricycleType implements CycleType{
    public void ride(){
        System.out.println("Riding Tri");
    }
}
class TriFactory implements CycleFactory{
    public CycleType getCycle(){
        return new TricycleType();
    }
}
class firstOuter{

    class firstInner{
        firstInner(String argument){
            System.out.println(argument);
        }
    }
}
class secondOuter{
   class secondInner extends firstOuter.firstInner {

       secondInner(firstOuter object_firsOuter) {
           object_firsOuter.super("Success");
       }
   }
}
public class Assignment7 {
    static void rideCycle(CycleFactory factory){
        CycleType cycleTypeObject = factory.getCycle();
        cycleTypeObject.ride();
    }
    public static void main(String[] args){
        Rodent[] rod = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for(Rodent i : rod){
            i.eat();
            i.jump();
        }
        Cycle[] cycles = new Cycle[]{
                new Cycle(), new Unicycle(),
                new Bicycle(), new Tricycle()
        };
        for (Cycle c : cycles) {
            System.out.println("wheels = " + c.NumberOfWheels());
            //Exception in thread "main" java.lang.ClassCastException Cycle cannot be cast to Unicycle
            ((Unicycle) c).balance();
        }
            rideCycle(new UniFactory());
            rideCycle(new BiFactory());
            rideCycle(new TriFactory());
    }
}

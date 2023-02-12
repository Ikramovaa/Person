package Person;

public class Driver extends Person{


    public Driver(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "age=16";
    }

    @Override
    public void work(){
        System.out.println("Driving...");
    }
}

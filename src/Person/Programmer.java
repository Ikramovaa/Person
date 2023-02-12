package Person;

public class Programmer extends Person{


    public Programmer(String name,int age) {
        super(name);

    }



    @Override
    public String toString() {
        return "age=12";
    }

    @Override
    public void work(){
        System.out.println("Coding...");
    }
}

package Person;

public class Builder extends Person {

    public Builder(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "age=18";
    }

    @Override
    public void work(){
        System.out.println("Building...");
    }
}

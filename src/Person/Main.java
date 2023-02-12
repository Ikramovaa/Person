package Person;

public class Main {
    public static void main(String[] args) {

        Driver driver=new Driver("Driver");


        Builder builder=new Builder("Builder");
        Programmer programmer=new Programmer("Programmer",12);

        programmer.work();
        builder.work();
        driver.work();
        System.out.println(driver.getName()+" "+driver.toString());
        System.out.println(builder.getName()+" "+builder.toString());
        System.out.println(programmer.getName()+" "+programmer.toString());
    }
}
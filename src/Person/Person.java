package Person;

public  class Person  {
    private final String name;
    private static int age;

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println("Working...");
    }
}

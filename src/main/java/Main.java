import entities.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Vasya");
        p.setAge(25);
        System.out.println(p.getJSONString());
        System.out.println(p);
    }
}

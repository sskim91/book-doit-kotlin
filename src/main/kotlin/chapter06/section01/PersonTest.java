package chapter06.section01;

/**
 * @author sskim
 */
public class PersonTest {

    private String name;
    private int age;

    public PersonTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        PersonTest personTest = new PersonTest("sskim", 29);
        //getter로만 접근가능, setter로만 수정 가능
        personTest.getName();
        personTest.getAge();
    }
}
package chapter06.section03;

/**
 * @author sskim
 */
public class OCustomerAccess {
    public static void main(String[] args) {
        //자바에서 코틀린의 object 선언으로 생성된 인스턴스에 접근하려면 INSTANCE를 사용한다.
        String name = OCustomer.INSTANCE.getName(); // 코틀린의 object 선언 객체의 메서드 접근
        System.out.println(name);
    }
}

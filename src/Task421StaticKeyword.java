/**
 * Task 421: static method demonstration.
 */
public class Task421StaticKeyword {
    static class Helper {
        static void hello() {
            System.out.println("Hello from Codeline");
        }

        void helloFromObject() {
            System.out.println("Hello from a Helper object");
        }
    }

    public static void main(String[] args) {
        Helper.hello();
        Helper helper = new Helper();
        helper.helloFromObject();
        System.out.println("A static method needs no object; an instance method does.");
    }
}

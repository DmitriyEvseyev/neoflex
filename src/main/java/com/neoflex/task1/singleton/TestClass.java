package  com.neoflex.task1.singleton;

public class TestClass {
    public static void main(String[] args) {
        ClassLog logger = ClassLog.getInstance();

        TestClass testClass = new TestClass();

        logger.classLogg(testClass, "Info");
    }
}


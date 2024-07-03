import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyClass {
    private String privateField = "Himel sarder";

    private void privateMethod() {
        System.out.println("Dept. of CSE, BSFMSTU");
    }
}

public class using_dotclass_extension {
    public static void main(String[] args) throws Exception {
        // Using .class to obtain the Class object directly
        Class<?> myClass = MyClass.class;

        // Accessing private field using reflection
        Field privateField = myClass.getDeclaredField("privateField");
        privateField.setAccessible(true); // Allows to modify private field
        MyClass obj = new MyClass();
        System.out.println("Private field value: " + privateField.get(obj));

        // Invoking private method using reflection
        Method privateMethod = myClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true); // Allows to invoke private method
        privateMethod.invoke(obj);
    }
}

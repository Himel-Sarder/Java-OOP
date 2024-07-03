import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyClass {
    private String privateField = "Himel Sarder";

    private void privateMethod() {
        System.out.println("Dept. of CSE, BSFMSTU");
    }
}


public class using_getClass_method {
    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();

        // Getting the runtime class of the object using getClass()
        Class<?> myClass = obj.getClass();

        // Accessing private field using reflection
        Field privateField = myClass.getDeclaredField("privateField");
        privateField.setAccessible(true); // Allows to modify private field
        System.out.println("Private field value: " + privateField.get(obj));

        // Invoking private method using reflection
        Method privateMethod = myClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true); // Allows to invoke private method
        privateMethod.invoke(obj);
    }
}

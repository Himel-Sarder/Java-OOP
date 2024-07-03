import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyClass {
    private String name = "Himel Sarder";

    private void privateMethod() {
        System.out.println("Dept. of CSE, BSFMSTU");
    }
}


public class Main {
    public static void main(String[] args) throws Exception {
        // Dynamically load class using Class.forName()
        Class<?> myClass = Class.forName("MyClass");

        // Accessing private field using reflection
        Field name = myClass.getDeclaredField("name");
        name.setAccessible(true); // Allows to modify private field
        Object obj = myClass.getDeclaredConstructor().newInstance();
        System.out.println("Name : " + name.get(obj));

        // Invoking private method using reflection
        Method privateMethod = myClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true); // Allows to invoke private method
        privateMethod.invoke(obj);
    }
}

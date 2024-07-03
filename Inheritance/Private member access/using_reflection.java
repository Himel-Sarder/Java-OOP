import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Grandparent class
class Grandparent {
    private String grandparentSecret = "Grandparent's secret";

    private void grandparentPrivateMethod() {
        System.out.println("Executing grandparent's private method.");
    }
}

// Parent class inheriting from Grandparent
class Parent extends Grandparent {
    private String parentSecret = "Parent's secret";

    private void parentPrivateMethod() {
        System.out.println("Executing parent's private method.");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    private String childSecret = "Child's secret";

    private void childPrivateMethod() {
        System.out.println("Executing child's private method.");
    }
}

class using_reflection {
    public static void main(String[] args) throws Exception {
        // Create an instance of the child class
        Child child = new Child();

        // Get the Class object for the grandparent class (Grandparent)
        Class<?> grandparentClass = Grandparent.class;

        // Access the private field 'grandparentSecret' in the grandparent class
        Field grandparentSecretField = grandparentClass.getDeclaredField("grandparentSecret");
        grandparentSecretField.setAccessible(true);
        String grandparentValue = (String) grandparentSecretField.get(child);
        System.out.println("Grandparent's secret: " + grandparentValue);

        // Access the private method 'grandparentPrivateMethod' in the grandparent class
        Method grandparentPrivateMethod = grandparentClass.getDeclaredMethod("grandparentPrivateMethod");
        grandparentPrivateMethod.setAccessible(true);
        grandparentPrivateMethod.invoke(child);

        // Get the Class object for the parent class (Parent)
        Class<?> parentClass = Parent.class;

        // Access the private field 'parentSecret' in the parent class
        Field parentSecretField = parentClass.getDeclaredField("parentSecret");
        parentSecretField.setAccessible(true);
        String parentValue = (String) parentSecretField.get(child);
        System.out.println("Parent's secret: " + parentValue);

        // Access the private method 'parentPrivateMethod' in the parent class
        Method parentPrivateMethod = parentClass.getDeclaredMethod("parentPrivateMethod");
        parentPrivateMethod.setAccessible(true);
        parentPrivateMethod.invoke(child);

        // Access the private field 'childSecret' in the child class
        Field childSecretField = Child.class.getDeclaredField("childSecret");
        childSecretField.setAccessible(true);
        String childValue = (String) childSecretField.get(child);
        System.out.println("Child's secret: " + childValue);

        // Access the private method 'childPrivateMethod' in the child class
        Method childPrivateMethod = Child.class.getDeclaredMethod("childPrivateMethod");
        childPrivateMethod.setAccessible(true);
        childPrivateMethod.invoke(child);
    }
}

// Parent class
class Parent {
    String name;
    int age;
    
    void printMe_01() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    double dateOfBirth;
    
    void printMe_02() {
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

// Grandchild class inheriting from Child
class Grandchild extends Child {
    String profession;
    
    void printMe_03() {
        System.out.println("Profession: " + profession);
    }
}

// Main class to demonstrate multilevel inheritance
public class multilevel_inheritance {
    public static void main(String[] args) {
        Grandchild gc = new Grandchild();
        
        gc.name = "Himel Sarder";
        gc.age = 22;
        gc.dateOfBirth = 2002.2; // Example date of birth
        gc.profession = "Student";
        
        gc.printMe_01(); 
        gc.printMe_02(); 
        gc.printMe_03();
    }
}

// Parent class
class Parent {
    String name;
    int age;
    
    void printMe_01() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// First child class inheriting from Parent
class Child1 extends Parent {
    double dateOfBirth;
    
    void printMe_02() {
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

// Second child class inheriting from Parent
class Child2 extends Parent {
    String profession;
    
    void printMe_03() {
        System.out.println("Profession: " + profession);
    }
}

// Main class to demonstrate hierarchical inheritance
public class Main {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        
        c1.name = "Himel Sarder";
        c1.age = 22;
        c1.dateOfBirth = 2002.2; // Example date of birth
        
        c2.name = "Jane Doe";
        c2.age = 30;
        c2.profession = "Engineer";
        
        // Printing details of Child1
        System.out.println("Details of Child1:");
        c1.printMe_01(); 
        c1.printMe_02();
        
        System.out.println();
        
        // Printing details of Child2
        System.out.println("Details of Child2:");
        c2.printMe_01(); 
        c2.printMe_03();
    }
}

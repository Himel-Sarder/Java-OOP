// Interface for PersonalDetails
interface PersonalDetails {
    String getName();
    int getAge();
}

// Interface for DateOfBirth
interface DateOfBirth {
    double getDateOfBirth();
}

// Interface for ProfessionalDetails
interface ProfessionalDetails {
    String getProfession();
}

// Parent class implementing PersonalDetails
class Parent implements PersonalDetails {
    String name;
    int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    void printMe_01() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class inheriting from Parent and implementing DateOfBirth
class Child extends Parent implements DateOfBirth {
    double dateOfBirth;

    @Override
    public double getDateOfBirth() {
        return dateOfBirth;
    }

    void printMe_02() {
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

// Grandchild class inheriting from Child and implementing ProfessionalDetails
class Grandchild extends Child implements ProfessionalDetails {
    String profession;

    @Override
    public String getProfession() {
        return profession;
    }

    void printMe_03() {
        System.out.println("Profession: " + profession);
    }
}

// Main class to demonstrate hybrid inheritance using interfaces
public class Main {
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

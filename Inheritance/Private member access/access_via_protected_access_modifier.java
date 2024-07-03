class Parent {
    private String name;
    protected int age;

    // Getter and setter for private field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

class Child extends Parent {
    void printDetails() {
        // Can access inherited protected member
        System.out.println("Name: " + getName()); // Accessing private field via public getter
        System.out.println("Age: " + age); // Accessing protected field directly
    }
}


class access_via_protected_access_modifier {
  public static void main(String[] args) {

    // create an object of the subclass
    Child c = new Child();
     c.setName("Himel Sarder");
     c.age = 22;
    
    c.printDetails();
  }
}

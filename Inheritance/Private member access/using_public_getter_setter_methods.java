class Parent {
    private String name;
    private int age;

    // Getter and setter for private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Child extends Parent {
    void printDetails() {
        // Can access private fields indirectly
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}

class using_public_getter_setter_methods {
  public static void main(String[] args) {

    // create an object of the subclass
    Child c = new Child();
     c.setName("Himel Sarder");
     c.setAge(22);
    
    c.printDetails();
  }
}

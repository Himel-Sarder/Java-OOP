class static_block {
    // Static variable
    static int age;

    // Static initializer block
    static {
        // Initialization or other actions
        age = 42;
        System.out.println("Static block initialized.");
    }

    public static void main(String[] args) {
        System.out.println("My age is : " + age);
    }
}

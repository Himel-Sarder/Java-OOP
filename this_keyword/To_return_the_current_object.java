class To_return_the_current_object {
    int x;
    int y;

    To_return_the_current_object setX(int x) {
        this.x = x;
        return this; // Return the current object
    }

    To_return_the_current_object setY(int y) {
        this.y = y;
        return this; // Return the current object
    }

    void printValues() {
        System.out.println("X: " + x + ", Y: " + y);
    }

    public static void main(String[] args) {
        To_return_the_current_object obj = new To_return_the_current_object();
        obj.setX(10).setY(20); // Method chaining
        obj.printValues(); // Output: X: 10, Y: 20
    }
}

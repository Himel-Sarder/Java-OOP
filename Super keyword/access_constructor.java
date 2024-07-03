class Elephant{
     Elephant(){
          System.out.println("Hello! I am Elephant");
     }
}

class Ant extends Elephant {
     Ant(){
          super();
          System.out.println("Hello! I am Ant");
     }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        Ant a = new Ant();
        
    }
}

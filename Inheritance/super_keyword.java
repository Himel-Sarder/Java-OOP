class Men {

  // method in the superclass
  public void trolling() {
    System.out.println("Ha..Ha..Ha.. Women");
  }
}

class Women extends Men {

  // overriding the troll() method
  @Override
  public void trolling() {
     super.trolling();
     System.out.println("Ha..Ha..Ha.. Men");
  }

  // new method in subclass
  public void stropTrolling() {
    System.out.println("Stop This Kind of trolling");
  }
}

class super_keyword {
  public static void main(String[] args) {

    // create an object of the subclass
    Women human = new Women();

    // call the eat() method
    human.trolling();
    human.stropTrolling();
  }
}

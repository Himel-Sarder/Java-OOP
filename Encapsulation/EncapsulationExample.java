// Java program to demonstrate 
// Java encapsulation

class Encapsulation {
	// private variables declared
	// these can only be accessed by
	// public methods of class
	private String Name;
	private int Roll;
	private int Age;



  
	// get method for age to access
	// private variable Age
	public int getAge() { 
	    return Age; 
	}



  
	// get method for name to access
	// private variable Name
	public String getName() { 
	    return Name; 
	}



  
	// get method for roll to access
	// private variable Roll
	public int getRoll() { 
	    return Roll; 
	}



  
	// set method for age to access
	// private variable age
	public void setAge(int Age) { 
	    this.Age = Age; 
	}



  
	// set method for name to access
	// private variable geekName
	public void setName(String Name)
	{
		this.Name = Name;
	}



  
	// set method for roll to access
	// private variable Roll
	public void setRoll(int Roll) { 
	    this.Roll = Roll; }
}




public class EncapsulationExample {
	public static void main(String[] args)
	{
		Encapsulation obj = new Encapsulation();

		// setting values of the variables
		obj.setName("Himel Sarder");
		obj.setAge(22);
		obj.setRoll(22111121);

		// Displaying values of the variables
		System.out.println("Name: " + obj.getName());
		System.out.println("Age: " + obj.getAge());
		System.out.println("Roll: " + obj.getRoll());

		// Direct access of Roll is not possible
		// due to encapsulation
		// System.out.println("Geek's roll: " +
		// obj.Name);
	}
}

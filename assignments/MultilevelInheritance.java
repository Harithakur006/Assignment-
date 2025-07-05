package assignments;
class One {
	  public void printOne() {
	    System.out.println("printOne(1) method of One class.");
	  }
	}

	class Two extends One {
	  public void printTwo() {
	    System.out.println("printTwo() method of Two class.");
	  }
	}

	class three extends Two{
		  public void printthree() {
		    System.out.println("printthree() method of three class.");
		  }
		}

	public class MultilevelInheritance extends three {
	  public static void main(String args[]) {
	    // Creating object of the derived class (Main)
	    MultilevelInheritance obj = new MultilevelInheritance();

	    // Calling methods
	    obj.printOne();
	    obj.printTwo();
	    obj.printthree();
	  }
	}
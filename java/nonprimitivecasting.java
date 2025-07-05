package java4;
class lion{
	void speak() {
		System.out.println("in a lion");
	}
}
class puppy extends lion{
	void eat() {
		System.out.println("im a puppy");
	}
	
}

public class nonprimitivecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
lion li= new lion();
li.speak();

puppy le=new puppy();
le.eat();
le.speak();

lion li2= new puppy();
li2.speak();


	}

}

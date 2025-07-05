package java4;
abstract class Animal{
	abstract void speak();
}
class dog extends Animal{
	void speak() {
	System.out.println("bow-bow");
}
}
class Cat extends Animal{
	void speak() {
		System.out.println("meow");
	}
}

public class AbstracClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dog d1 = new dog();
d1.speak();

Cat c1 = new Cat();
c1.speak();
	}

}

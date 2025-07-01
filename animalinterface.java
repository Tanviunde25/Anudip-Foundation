interface Animal {
    void makeSound();
    void eat();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }

    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }

    public void eat() {
        System.out.println("Cat drinks milk.");
    }
}

public class animalinterface {
    public static void main(String[] args) {
        Animal myDog = new Dog(); 
        Animal myCat = new Cat();

        myDog.makeSound();
        myDog.eat();

        myCat.makeSound();
        myCat.eat();
    }
}
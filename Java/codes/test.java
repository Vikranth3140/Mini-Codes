class Animal {
    public String sound = "Bark";
    public void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
//    private String sound = "Bark";
    public void makeSound() {
        // Call the makeSound method of the superclass (Animal)
//        _________________________________ ;
//        System.out.println(sound);
        super.makeSound();
    }
}

class cat extends Animal{
    private String sound="Meow";

    @Override
    public void makeSound() {
        String s=this.sound;
        System.out.println(s);
    }
}

public class test {
    public static void main(String[] args) {
        Animal d=new Dog();
        d.makeSound();

        Animal c=new cat();
        c.makeSound();
    }
}
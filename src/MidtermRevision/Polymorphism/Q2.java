package MidtermRevision.Polymorphism;


    interface SoundMaker {
        void makeSound();
    }

    abstract class Animal implements SoundMaker {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public abstract void move();
    }

    class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override public void move() {
            System.out.println("Dog is running");
        }

        @Override public void makeSound() {
            System.out.println("Barks");
        }
    }
    class Bird extends Animal {
        public Bird(String name) {
            super(name);
        }

        @Override public void move() {
            System.out.println("Bird is flying");
        }

        @Override public void makeSound() {
            System.out.println("Tweet");
        }
    }

    public class Q2{
        public static void main(String[] args) {
        Animal[] animals = {new Dog("Buddy"), new Bird("Tweety")};
        for (Animal animal : animals) {
            animal.move();
            animal.makeSound();
        }
    }
}

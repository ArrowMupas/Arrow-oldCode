class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Swak", 24);
        dog.setBreed("Aspin");
        dog.setClawLength(2);

        System.out.println("DOG");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge() + " years old.");
        System.out.println("Breed: " + dog.getBreed());
        System.out.println("Claw Length: " + dog.getClawLength() + " mm");
        dog.bark();
        dog.fetch();

        Cat cat = new Cat("Rea", 5);
        cat.setBreed("Japanese Bobtail");
        cat.setClawLength(2);

        System.out.println("CAT");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge() + " years old.");
        System.out.println("Breed: " + cat.getBreed());
        System.out.println("Claw Length: " + cat.getClawLength() + " mm");
        cat.meow();
        cat.fetch();

        Horse horse = new Horse("Spark", 7);
        horse.setBreed("Thoroughbred");
        horse.setClawLength(4);

        System.out.println("HORSE");
        System.out.println("Name: " + horse.getName());
        System.out.println("Age: " + horse.getAge() + " years old.");
        System.out.println("Breed: " + horse.getBreed());
        System.out.println("Claw Length: " + horse.getClawLength() + " mm");
        horse.gallop();
    }
}
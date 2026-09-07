class Dog extends Animal {
    private String breed;
    private int clawLength;

    Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("Bark!");
    }

    public void fetch() {
        System.out.println("Fetch!");
    }

    public String getBreed() {
        return breed;
    }

    public int getClawLength() {
        return clawLength;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setClawLength(int clawLength) {
        this.clawLength = clawLength;
    }
}
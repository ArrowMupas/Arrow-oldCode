class Cat extends Animal {
    private String breed;
    private int clawLength;

    Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("Meow!");
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
class Horse extends Animal {
    private String breed;
    private int clawLength;

    Horse(String name, int age) {
        super(name, age);
    }

    public void gallop() {
        System.out.println("Gallop!");
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
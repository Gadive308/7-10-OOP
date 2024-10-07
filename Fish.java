class Fish extends Animal {
    private boolean walk = false;
    private boolean swim = true;

    public Fish (boolean walk, boolean swim) {
        super(walk, swim);
    }

    public String getSpecies() {
        return "Fish";
    }
}

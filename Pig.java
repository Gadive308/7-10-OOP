class Pig extends Animal {
    private boolean walk = true;
    private boolean swim = false;

    public Pig (boolean walk, boolean swim) {
        super(walk, swim);
    }

    public String getSpecies() {
        return "Pig";
    }
}

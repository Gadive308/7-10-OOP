class Duck extends Animal {
    private boolean walk = true;
    private boolean swim = true;

    public Duck (boolean walk, boolean swim) {
        super(walk, swim);
    }

    public String getSpecies() {
        return "Duck";
    }
}

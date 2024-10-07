abstract class Animal {
    protected boolean walk;
    protected boolean swim;

    public Animal(boolean walk, boolean swim) {
        this.walk = walk;
        this.swim = swim;
    }

    public boolean isWalk() {
        return walk;
    }

    public boolean isSwim() {
        return swim;
    }

    public abstract String getSpecies();
}
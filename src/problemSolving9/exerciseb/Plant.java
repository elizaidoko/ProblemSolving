package problemSolving9.exerciseb;

public class Plant extends Flora implements LivingThings {
    private String name;
    private double maxSpread;
    private double maxHeight;
    private String reproductiveMethod;
    private String species;
    private int lifespan;
    private boolean invasiveStatus;

    public Plant(String classification, String[] continents, String name, double maxSpread, double maxHeight, String reproductiveMethod, String species, int lifespan, boolean invasiveStatus){
        super(classification,continents);
        setName(name);
        setMaxSpread(maxSpread);
        setMaxHeight(maxHeight);
        setReproductiveMethod(reproductiveMethod);
        setSpecies(species);
        setLifespan(lifespan);
        setInvasiveStatus(invasiveStatus);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpread() {
        return maxSpread;
    }

    public void setMaxSpread(double maxSpread) {
        this.maxSpread = maxSpread;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public String getReproductiveMethod() {
        return reproductiveMethod;
    }

    public void setReproductiveMethod(String reproductiveMethod) {
        this.reproductiveMethod = reproductiveMethod;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public int getLifespan() {
        return lifespan;
    }

    @Override
    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public boolean isInvasiveStatus() {
        return invasiveStatus;
    }

    public void setInvasiveStatus(boolean invasiveStatus) {
        this.invasiveStatus = invasiveStatus;
    }

    @Override
    public boolean isInvasive() {
        return invasiveStatus;
    }

    public String toString()
    {
        String str;

        str =super.toString() + "\nName: " + getName() + "\nMax Spread: " + getMaxSpread() +
                " cm\nMax Height: " + getMaxHeight() + " cm\nReproductive Method: " + getReproductiveMethod() +
                "\nSpecies: " + getSpecies() + "\nLife span: " + getLifespan() + " years";

        return str;
    }
}

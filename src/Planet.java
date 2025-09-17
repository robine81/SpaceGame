public class Planet {
    private String planetName;
    private int planetOxygen;               //if below 100 Oxygen Low
    private boolean planetHasStorm;         //if yes

    public Planet(String planetName, int planetOxygen, boolean planetHasStorm){
        this.planetName = planetName;
        this.planetOxygen = planetOxygen;
        this.planetHasStorm = planetHasStorm;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getPlanetOxygen() {
        return planetOxygen;
    }

    public void setPlanetOxygen(int planetOxygen) {
        this.planetOxygen = planetOxygen;
    }

    public boolean isPlanetHasStorm() {
        return planetHasStorm;
    }

    public void setPlanetHasStorm(boolean planetHasStorm) {
        this.planetHasStorm = planetHasStorm;
    }
}

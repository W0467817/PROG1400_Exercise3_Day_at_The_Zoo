public class Animal {

    private String species;
    private double maxWeight;
    private String environment;
    private boolean endangered;


    // Default constructor
    public Animal() {
        this.endangered = false;
    }

    // Overloaded constructor
    public Animal(String species, double maxWeight, String environment, boolean endangered) {
        this.species = species;
        this. maxWeight = maxWeight;
        this.environment = environment;
        this.endangered = endangered;
    }


    public String getSpecies() {
        return species;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public String getEnvironment() {
        return environment;
    }

    public boolean endangered() {
        return endangered;
    }


    // Feed the animal resulting in an increase in weight
    public String feedMe(String foodType) {
        this.maxWeight++;
        return "You fed the " + this.species + " a " + foodType;
    }

    // The animal makes a sound
    public String makeASound(String sound) {
        return "The " + this.species + " goes " + sound;

    }

    // Check if animal is endangered
    public String toString() {
        String output = "I am a " + this.maxWeight + " lb " + this.species + " that lives in the " + this.environment + ". I ";
        String am = "am";
        if (!this.endangered) {
            am += " not ";
        }
        output += am + " an endangered species";
        return output;
    }
}

public class Main {
    public static void main(String[] args) {

        Animal rat = new Animal("rat", 1, "sewers", false);
        Animal elephant = new Animal("Elephant", 2000, "Savannah", true);
        Animal fish = new Animal("fish", 50, "ocean", false);


        // Object array
        Animal[] zoo = new Animal[] {elephant, rat, fish};


        for (int i = 0; i < zoo.length; i++) {
            System.out.println("\n" + zoo[i].toString());
            if (zoo[i] == rat) {
                System.out.println(zoo[i].makeASound("woof"));
            } else if (zoo[i] == elephant) {
                System.out.println(zoo[i].feedMe("peanut"));
            } else if (zoo[i] == fish) {
                System.out.println(zoo[i].makeASound("glub-glub"));
            }
        }
    }
}
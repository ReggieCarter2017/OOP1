public class Main {
    public static void main(String[] args) {
        Canines c = new Canines("John", "4", "Male", "Grey", "No ilnesses\n");
        c.showInfo();
        c.animalSays();
        c.animalWalks();

        System.out.println("\n---------------");

        Canines c1 = new Canines("Bear", "8", "Male", "Brown", "No ilnesses\n");
        c1.showInfo();
        c1.animalSays();
        c1.animalWalks();

        System.out.println("\n---------------");

        Cats cats = new Cats("Barsik", "2", "Female", "Green", "has paws\n");
        cats.showInfo();
        cats.animalSays();
        cats.animalWalks();

        System.out.println("\n---------------");

        Cats cats2 = new Cats("Marie", "7", "Female", "Grey", "has paws\n");
        cats2.showInfo();
        cats2.animalSays();
        cats2.animalWalks();
;
    }


    public static void fillArray(String name)
    {

    }
}




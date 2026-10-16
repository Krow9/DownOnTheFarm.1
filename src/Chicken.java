public class Chicken {

    private String Breed;
    private int Eggs;
    private boolean Rude;
    private double Weight;

    public Chicken()
    {
        Breed = "None";
        Eggs = 0;
        Rude = false;
        Weight = 0;
    }
    public Chicken(String b, int e, boolean r, double w)
    {
        Breed = b ;
        Eggs = e;
        Rude = r;
        Weight = w;
    }
    public void makeNoise()
    {
        System.out.println("CLUCK CLUCK CLUCK");
    }
    public void eatFood(int amount) {
        Weight++;
    }
    public void displayChicken() {
        System.out.println("Breed:" + Breed );
        System.out.println("Eggs:" + Eggs );
        System.out.println("Rude:" + Rude );
        System.out.println("Weight:" + Weight );

    }
}

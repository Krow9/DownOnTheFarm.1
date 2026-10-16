public class Cow {

    private String Name;
    private double Weight;
    private int Age;
    private boolean Gender;

    public Cow()
    {
        Name = "None";
        Weight = 0;
        Age = 0;
        Gender = false;
    }
    public Cow(String n, double w, int a, boolean g)
    {
        Name = n ;
        Weight = w;
        Age = a;
        Gender = g;
    }
    public void makeNoise()
    {
        System.out.println("MOO MOO MOO");
    }
    public void haveBirthday() {
        Age++;
    }
    public void displayCow() {
        System.out.println("Name:" + Name );
        System.out.println("Weight:" + Weight );
        System.out.println("Age:" + Age );
        System.out.println("Gender:" + Gender );

    }
}

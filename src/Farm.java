public class Farm {
    public static void main(String[]args)
    {
        Cow franny = new Cow();
        Cow gretta = new Cow("Gretta",100,1, false);
        Chicken clucky = new Chicken();
        Chicken marshmellow = new Chicken("Sussex", 2, false, 83.5);
        Pig piglet = new Pig();
        Pig pickles = new Pig("Yellow", 10, true, 567.99);

        System.out.println( ) ;
        franny.makeNoise();
        clucky.makeNoise();
        pickles.makeNoise();
        gretta.haveBirthday();
        marshmellow.eatFood(10);
        piglet.upgradePenSize(3);

        System.out.println( ) ;
        gretta.displayCow();
        System.out.println( ) ;
        marshmellow.displayChicken();
        System.out.println( ) ;
        piglet.displayPig();

    }
}

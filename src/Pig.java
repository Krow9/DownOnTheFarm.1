public class Pig {

        private String Color;
        private int Pen;
        private boolean Wall;
        private double Weight;

    public Pig()
        {
            Color = "None";
            Pen = 1;
            Wall = false;
            Weight = 1;
        }
    public Pig(String c, int p, boolean a, double w)
        {
            Color = c ;
            Pen = p;
            Wall = a;
            Weight = w;
        }
        public void makeNoise()
        {
            System.out.println("OINK OINK OINK");
        }
        public void upgradePenSize(int amount) {
        Pen++;
    }
        public void displayPig() {
        System.out.println("Color:" + Color );
        System.out.println("Pen Size:" + Pen );
        System.out.println("Mud Wallowed:" + Wall );
        System.out.println("Weight:" + Weight );

    }
}

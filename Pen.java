public class Pen {
    String colour;
    int no_of_nibs;
    int cost_of_pen;
    float size;

   public void getcolour(){
       System.out.println("the colour of pen is : " + colour);
   }
   public void getcost_of_pen(){
       System.out.println("The cost of then Pen is " + cost_of_pen );
   }
   public void getsize(){
       System.out.println("The size of pen is centimeter "+ size);
   }
   public void getno_of_nibs(){
       if(no_of_nibs == 1) {
           System.out.println("This pen is having single nib");
       }
       else {
           System.out.println("This pen is having Multiple nibs");
       }
   }
   public static void main(String[] args) {
       Pen objpen = new Pen();
       objpen.colour= "Red";
        System.out.println( );
       objpen.no_of_nibs= 2;
        System.out.println();
       objpen.cost_of_pen= 25;
       // System.out.println("Cost of this PEN in Rupees ::" + cost_of_pen);
        objpen.size = 13.5f;
       // System.out.println("Size of the Pen in CentiMeters :: "+ size);

        objpen.getcolour();
        objpen.getno_of_nibs();
        objpen.getcost_of_pen();
        objpen.getsize();
   }
}

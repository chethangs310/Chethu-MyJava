public class WaterBottle {
    int capacity;
    boolean emptyBottle;
    String materialOfBottle;

    public void getcapacity(){
        System.out.println("The Capacity of Water Bottle is ::" +capacity+ "Litters");
    }
    public void getemptyBottle(){
        if (emptyBottle == true) {
            System.out.println("YES, Water Bottle is Empty");
        }
        else {
            System.out.println("NO, Some water is having in the Bottle ");
        }
    }
    public void getmaterialOfBottle(){
        System.out.println("The Material of water Bottle is ::" +materialOfBottle);
    }

    public static void main(String[] args) {
        WaterBottle objbottle = new WaterBottle();
        objbottle.capacity= 2;
        objbottle.emptyBottle= true;
        objbottle.materialOfBottle= "Glass";

        objbottle.getcapacity();
        objbottle.getemptyBottle();
        objbottle.getmaterialOfBottle();
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        int cansPerPack; //declaration of the variable cansPerPack of type integer;
        cansPerPack = 6; //sets value of variable cansPerPack to 6
        System.out.println("There are " + cansPerPack + " cans in the pack!");
        float f = 99.999f;
        double d = 99.999;
        System.out.println("f = " + f);
        System.out.println("d = " + d);

        //x = f; returns error, losing information
        // f = cansPerPack;  
        cansPerPack = (int) f; //tells computer you want f to be an integer
        System.out.println("cans per pack = " + cansPerPack);
    }
}

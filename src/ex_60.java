public class ex_60 {
    public static void main(String[] args) {
        int bananaWeight = 80;
        int milkMl = 105;
        int iceCream = 100;
        int egg = 70;
        int coctailWeight = (bananaWeight * 5) + (milkMl * 2) + (iceCream * 2) + (egg * 4);
        double totalWeughtKg = coctailWeight / 1000.0;

        System.out.println(coctailWeight + " gr.");
        System.out.println(totalWeughtKg + " kg.");
    }
}

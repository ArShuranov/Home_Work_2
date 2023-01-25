public class ex_50 {
    public static void main(String[] args) {
        int paint = 120;
        int whiteSpend = 2;
        int brownSpend = 4;
        int countClass = paint / (whiteSpend + brownSpend);

        int whiteNeed = countClass * whiteSpend;
        int brownNeed = countClass * brownSpend;

        System.out.println("В школе, где " + countClass +  " классов, нужно "
                + whiteNeed + " банок белой краски и " + brownNeed + " банок коричневой краски");


    }
}

public class ex_70 {
    public static void main(String[] args) {
        float weightLoss = 7000;
        float dietSoft = 250;
        float dietHard = 500;
        float numberDaysWithSoft = weightLoss / dietSoft;
        float numberDaysWithHard = weightLoss / dietHard;
        float numberDaysMerge = weightLoss / ((dietHard + dietSoft) / 2);

        System.out.println(numberDaysWithSoft);
        System.out.println(numberDaysWithHard);
        System.out.println(numberDaysMerge);


    }
}

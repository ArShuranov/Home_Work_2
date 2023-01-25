public class ex_8 {
    public static void main(String[] args) {
        float factor = 0.1F;
        float mashaGetMonth = 67760F;
        float denisGetMonth = 83690F;
        float kristinaGetMonth = 76230F;

        System.out.println("Маша теперь получает " + (mashaGetMonth + mashaGetMonth * factor) +
                " рублей. Годовой доход вырос на " +
                (((mashaGetMonth + mashaGetMonth * factor) * 12) - (mashaGetMonth * 12)) + " рублей");

        System.out.println("Денис теперь получает " + (denisGetMonth + denisGetMonth * factor) +
                " рублей. Годовой доход вырос на " +
                (((denisGetMonth + denisGetMonth * factor) * 12) - (denisGetMonth * 12)) + " рублей");

        System.out.println("Кристина теперь получает " + (kristinaGetMonth + kristinaGetMonth * factor) +
                " рублей. Годовой доход вырос на " +
                (((kristinaGetMonth + kristinaGetMonth * factor) * 12) - (kristinaGetMonth * 12)) + " рублей");


    }
}

public class ex_40 {
    public static void main(String[] args) {
        int produsePerMin = 8;
        int produsePerTwentyMin = produsePerMin * 20;
        int produsePerDay = produsePerTwentyMin * 3 * 24;
        int produsePerThreeDay = produsePerDay * 3;
        int produsePerMonth = produsePerThreeDay * 10;

        System.out.println("За 1 минуту машина произвела " + produsePerMin + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + produsePerTwentyMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + produsePerDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + produsePerThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + produsePerMonth + " штук бутылок");
    }
}

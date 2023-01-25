public class ex_30 {
    public static void main(String[] args) {
        // Задача про учителей, учеников и дефицитные листы бумаги
        byte ludPavStu = 23;
        byte annSerStu = 27;
        byte ekaAndStu = 30;
        short lists = 480;
        float result;

        result = lists / (ludPavStu + annSerStu + ekaAndStu);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");

    }

}

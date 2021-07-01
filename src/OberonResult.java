public class OberonResult {

    public static void main(String[] args) {
        Oberon oberon = new Oberon();
        oberon.setName("CodeUp");
        oberon.setWeekAmount(22);
        oberon.setTheBestBoot(true);


        System.out.printf("Oberon Cohort is apart of %s, it is a %s week course and if you've heard it is the best bootcamp," +
                " it is definitely %s", oberon.getName(), oberon.getWeekAmount(), oberon.isTheBestBoot());
    }
}

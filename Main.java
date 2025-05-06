public class Main
{
    public static void main(String[] args)
    {
        Game one = new Game();
        one.getLevel(1).reached();
        one.getLevel(1).setPoints(200);
        one.getLevel(2).reached();
        one.getLevel(2).setPoints(100);
        one.getLevel(3).reached();
        one.getLevel(3).setPoints(500);
        one.makeBonus();
        System.out.println(one.isBonus());

        Game two = new Game();
        two.getLevel(1).reached();
        two.getLevel(1).setPoints(200);
        two.getLevel(2).reached();
        two.getLevel(2).setPoints(100);
        two.getLevel(3).setPoints(500);
        System.out.println(two.getScore());

        Game five = new Game();
        System.out.println(five.playManyTimes(4));
    }
}
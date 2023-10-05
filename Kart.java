import java.util.Random;
public class Kart extends Vehicle {


    public static Random rand = new Random();
    private SpecialItem[] items = new SpecialItem[3];

    public Kart(int speed) {
        super("Mario Kart", speed);
        items[0] = new SpecialItem("Green Shell", 7, ConsoleColors.RED);
        items[1] = new SpecialItem("Boomerang", 5, ConsoleColors.BLUE);
        items[2] = new SpecialItem("Banana", 1, ConsoleColors.YELLOW);
    }

    public int attack() {
        int delayValueNum = detailedAttack();
        if (delayValueNum == 0) {
            return 7;
        } else if (delayValueNum == 1) {
            return 5;
        } else if (delayValueNum == 2) {
            return 1;
        }
        return delayValueNum;
    }

    private int detailedAttack() {
        return rand.nextInt(3);
    }

}

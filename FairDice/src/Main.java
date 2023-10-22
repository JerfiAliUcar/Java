import java.util.Random;


public class Main {
    public static void main(String[] args) {
        FairTenSidedDice fairTenSidedDice = new FairTenSidedDice();
        for (int i = 0; i < 20; i++) {
            fairTenSidedDice.roll();
        }
        fairTenSidedDice.printReport();
    }
}
class FairTenSidedDice {
    private int rollCount;
    private int[] counterArray;

    public FairTenSidedDice() {
        this.rollCount = 0;
        this.counterArray = new int[10];
    }

    public void roll() {
        Random random = new Random();
        int rolledNumber = random.nextInt(10) + 1;
        counterArray[rolledNumber - 1]++;
        rollCount++;
    }

    public int getRollCount() {
        return rollCount;
    }

    public int[] getCounterArray() {
        return counterArray;
    }

    public void printReport() {
        System.out.println("Dice has been Rolled " + rollCount + " times");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ": >" + counterArray[i]);
            if (i != 9) {
                System.out.print(", ");
            }
        }
    }
}





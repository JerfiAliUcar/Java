import java.util.Random;

public class Main {
    public static void main(String[] args) {
        UnfairTenSidedDice unfairTenSidedDice = new UnfairTenSidedDice();
        for (int i = 0; i < 20; i++) {
            unfairTenSidedDice.roll();
        }
        unfairTenSidedDice.printReport();
    }
}


class UnfairTenSidedDice {
    private int rollCount;
    private int[] probabilities;
    private int[] counterArray;

    public UnfairTenSidedDice() {
        this.rollCount = 0;
        this.probabilities = new int[]{5, 10, 20, 5, 5, 5, 5, 10, 5, 30};
        this.counterArray = new int[10];
    }

    public void roll() {
        Random random = new Random();
        int rolledNumber = getRandomNumberByProbability(random);
        counterArray[rolledNumber - 1]++;
        rollCount++;
    }

    private int getRandomNumberByProbability(Random random) {
        int randomNumber = random.nextInt(100) + 1;
        int sum = 0;
        for (int i = 0; i < probabilities.length; i++) {
            sum += probabilities[i];
            if (randomNumber <= sum) {
                return i + 1;
            }
        }
        return 10;
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




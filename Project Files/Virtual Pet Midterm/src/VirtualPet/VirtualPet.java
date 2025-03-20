package VirtualPet;
import java.util.Random;
/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Mar 9, 2025  
*/

public class VirtualPet {
    private String name;
    private String animalType;
    private double weight;
    private boolean isSick;
    private boolean isExhausted;
    private boolean isSleeping;
    private int feedCount;
    private int playCount;
    private Random random;
    private int messCount;
    private int cleanCount;
    private int totalFeedCount;
    private int totalPlayCount;
    private int totalMessCount;

    public VirtualPet(String name, String animalType, double weight) {
        this.name = name;
        this.animalType = animalType;
        this.weight = weight;
        this.isSick = false;
        this.isExhausted = false;
        this.isSleeping = false;
        this.feedCount = 0;
        this.playCount = 0;
        this.random = new Random();
        this.messCount = 0;
        this.cleanCount = 0;
        this.totalFeedCount = 0;
        this.totalPlayCount = 0;
        this.totalMessCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getWeight() {
        return weight;
    }

    public int getBathroomLevel() {
        return messCount;
    }

    public boolean isSick() {
        return isSick;
    }

    public boolean isExhausted() {
        return isExhausted;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void feedPet() {
        if (!isSleeping) {
            double weightGain = calculateWeightGain();
            weight += weightGain;
            feedCount++;
            totalFeedCount++;

            if (feedCount >= 3) {
                isSick = true;
                System.out.println(name + " is feeling sick from too much food!");
            }
        } else {
            System.out.println(name + " is sleeping and can't be fed.");
        }
    }

    private double calculateWeightGain() {
        return 0.5 + random.nextDouble() * 0.5;
    }

    public void playWithPet() {
        if (!isSleeping) {
            double weightLoss = calculateWeightLoss();
            weight -= weightLoss;
            playCount++;
            totalPlayCount++;

            if (playCount >= 3) {
                isExhausted = true;
                System.out.println(name + " is exhausted from playing too much!");
            }
        } else {
            System.out.println(name + " is sleeping and can't play.");
        }
    }

    private double calculateWeightLoss() {
        return 0.5 + random.nextDouble() * 0.5;
    }

    public void cleanPet() {
        messCount = 0;
        cleanCount++;
        feedCount = 0;
        playCount = 0;
        isSick = false;
        isExhausted = false;
    }

    public void useBathroom() {
        messCount++;
        totalMessCount++;
        System.out.println(name + " made a mess! Bathroom level increased.");
    }

    public void sleepPet() {
        isSleeping = true;
        isExhausted = false;
        isSick = false;
        feedCount = 0;
        playCount = 0;
    }

    public void wakeUp() {
        isSleeping = false;
    }

    public String getStatus() {
        return String.format("%s (%s): Weight=%.2f, Bathroom=%d, Sick=%b, Exhausted=%b, Sleeping=%b",
                name, animalType, weight, messCount, isSick, isExhausted, isSleeping);
    }

    public boolean isGameOver() {
        return messCount >= 3;
    }

    public void displayFinalStats() {
        System.out.printf("\nFinal Stats for %s:\n", name);
        System.out.printf("Final Weight: %.2f\n", weight);
        System.out.printf("Total Times Fed: %d\n", totalFeedCount);
        System.out.printf("Total Times Played: %d\n", totalPlayCount);
        System.out.printf("Total Times Pet used Bathroom: %d\n", totalMessCount);
        System.out.printf("Times Cleaned: %d\n", cleanCount);
    }
}
package VirtualPet;

import java.util.Random;
import java.util.Scanner;

/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Mar 9, 2025  
*/
public class VirtualPetProgram {
    private static int sleepCounter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String name = getPetName(scanner);
        String animalType = getAnimalType(scanner);
        double weight = getPetWeight(scanner);

        VirtualPet pet = initializePet(name, animalType, weight);

        while (true) {
            displayPetStatus(pet);
            String command = getCommand(scanner);

            if (command.equals("quit")) {
                System.out.println(pet.getName() + " decided to leave! Game Over!");
                pet.displayFinalStats();
                break;
            }

            if(isValidCommand(command)){
                executeCommand(pet, command);
                if (random.nextDouble() < 0.2) {
                    pet.useBathroom();
                }

                if (sleepCounter >= 2 && random.nextDouble() < 0.2) {
                    if (!pet.isSleeping()) {
                        pet.sleepPet();
                        System.out.println(pet.getName() + " fell asleep!");
                    }
                    sleepCounter = 0;
                } else {
                    if (pet.isSleeping()) {
                        pet.wakeUp();
                        System.out.println(pet.getName() + " woke up!");
                    }
                    sleepCounter++;
                }
            } else {
                System.out.println("Invalid command. Try again.");
            }

            if (pet.isGameOver()) {
                System.out.println(pet.getName() + " says the place is filthy and leaves! Game Over!");
                pet.displayFinalStats();
                break;
            }
        }
        scanner.close();
    }

    private static VirtualPet initializePet(String name, String animalType, double weight) {
        return new VirtualPet(name, animalType, weight);
    }

    private static String getPetName(Scanner scanner) {
        System.out.print("Enter pet's name: ");
        return scanner.nextLine();
    }

    private static String getAnimalType(Scanner scanner) {
        System.out.print("Enter pet's animal type: ");
        return scanner.nextLine();
    }

    private static double getPetWeight(Scanner scanner) {
        double weight;
        System.out.print("Enter starting weight: ");
        weight = Double.parseDouble(scanner.nextLine());
        while (weight < 0) {
            System.out.println("Weight must be positive non 0 weight. Re-enter: ");
            weight = Double.parseDouble(scanner.nextLine());
        }
        return weight;
    }

    private static void displayPetStatus(VirtualPet pet) {
        System.out.println("\nPet Status: " + pet.getStatus());
    }

    private static String getCommand(Scanner scanner) {
        System.out.print("Enter command (feed, play, clean, quit): ");
        return scanner.nextLine().toLowerCase();
    }

    private static void executeCommand(VirtualPet pet, String command) {
        switch (command) {
            case "feed":
                pet.feedPet();
                break;
            case "play":
                pet.playWithPet();
                break;
            case "clean":
                pet.cleanPet();
                break;
            default:
                System.out.println("Invalid command. Try again.");
        }
    }
    private static boolean isValidCommand(String command){
        return command.equals("feed") || command.equals("play") || command.equals("clean");
    }
}
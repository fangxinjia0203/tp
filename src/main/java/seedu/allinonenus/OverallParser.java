package seedu.allinonenus;

import seedu.allinonenus.capcalculatorclasses.CapCalculator;
import seedu.allinonenus.foodstore.FoodRecommendation;
import seedu.allinonenus.moduleplanner.ModulePlanner;
import seedu.allinonenus.teamplannerclasses.TeamPlanner;

import java.util.Scanner;

public class OverallParser {

    public OverallParser() {

<<<<<<< HEAD:src/main/java/seedu/duke/OverallParser.java
    public static void main(String[] args) throws IOException 3OverallParser{
        assert false : "hi";
        new OverallParser().run();
=======
>>>>>>> 1dede2f143c88de7a7171294483e5be0adec3aab:src/main/java/seedu/allinonenus/OverallParser.java
    }

    public void run() {
        requestForFeatureMode();
        displayExitMessage();
    }

    public void displayExitMessage() {
        System.out.println("Thank you for using All-in-oneNUS, we hope to see you again!");
    }

    void greetUserAndDisplayFeatures() {
        System.out.print("Welcome to All-in-OneNUS app!\n");
        System.out.print(
                "Press 1 to access Team Planner\n"
                        + "Press 2 to access Cap Calculator\n"
                        + "Press 3 to access Module Planner\n"
                        + "Press 4 to access Food Recommendation app\n");
    }

    void requestForFeatureMode() {
        while (true) {
            greetUserAndDisplayFeatures();
            Scanner choice = new Scanner(System.in);
            String chosen = choice.nextLine();
            switch (chosen) {
            case "bye":
                return;
            case "1":
                new TeamPlanner().run();
                break;
            case "2":
                new CapCalculator().run();
                break;
            case "3":
                new ModulePlanner().run();
                break;
            case "4":
                new FoodRecommendation().run();
                break;
            default:
                System.out.print("Invalid Try again!\n");//replace this line with exception in the future
                break;
            }
        }
    }
}

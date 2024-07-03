package selection_process.following;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcess {

    public static void main(String[] args) {
        String[] candidates = {"JOHN", "JACK", "MARY", "ANNA", "LARISSA"};
        for (String candidate : candidates) {
            contacting(candidate);
        }
    }
    
    static void analyzeCandidate(double baseSalary, double desiredSalary) {
        if (baseSalary >= desiredSalary) {
            System.out.println("Offering salary to the candidate");
        } else if (baseSalary < desiredSalary) {
            System.out.println("Calling candidate with counter proposal");
        } else {
            System.out.println("Waiting for other candidates' results");
        }
    }
    
    static double desiredValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static void selectCandidates() {
        String[] candidates = {"JOHN", "JACK", "MARY", "ANNA", "LARISSA", "MONICA", "RACHEL", "MICHAEL", "JUSTIN", "LIZ"};
        int selectedCandidates = 0;
        int currentCandidate = 0;
        double baseSalary = 2000.0;
    
        while (selectedCandidates < 5 && currentCandidate < candidates.length) {
            String candidate = candidates[currentCandidate];
            double desiredSalary = desiredValue();
    
            System.out.println(candidate + " requested this salary: " + desiredSalary);
    
            if (baseSalary >= desiredSalary) {
                System.out.println(candidate + " has been selected for the position");
                selectedCandidates++;
            }
    
            currentCandidate++;
        }
    }
    
    static void contacting(String candidate) {
        int attemptsMade = 1;
        boolean continueTrying = true;
        boolean answered = false;
        do {
            answered = answer();
            continueTrying = !answered;
            if (continueTrying)
                attemptsMade++;
            else
                System.out.println("SUCCESSFULLY CONTACTED");

        } while (continueTrying && attemptsMade < 3);

        if (answered)
            System.out.println("CONTACT MADE WITH " + candidate + " ON ATTEMPT " + attemptsMade);
        else
            System.out.println("UNABLE TO CONTACT " + candidate + ", MAXIMUM NUMBER OF ATTEMPTS REACHED " + attemptsMade);
    }

    static boolean answer() {
        return new Random().nextInt(3) == 1;
    }

    static void printSelected(String[] candidates) {
        System.out.println("Printing the list of candidates with their index:");

        for (int index = 0; index < candidates.length; index++) {
            System.out.println("Candidate number " + (index + 1) + " is " + candidates[index]);
        }

        System.out.println("Using enhanced for loop:");

        for (String candidate : candidates) {
            System.out.println("Selected candidate: " + candidate);
        }
    }
    
}

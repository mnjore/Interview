import java.util.Scanner;
public class Grades {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int KCSEgrade;
        int interviewscore;
        int confidencescore;

        System.out.print("Enter KCSE grade: ");
        KCSEgrade = input.nextInt();

        System.out.print("Enter interview question score: ");
        interviewscore = input.nextInt();

        System.out.print("Enter confidence level score: ");
        confidencescore = input.nextInt();

        if (KCSEgrade < 65) {
            System.out.print("New student should be rejected");
        }
        else {
            if (interviewscore < 6) {
                System.out.print("New student should be rejected");
            }
            else{
                if (confidencescore < 5) {
                    System.out.print("New student should be rejected");
                }
                else {
                    System.out.print("New student should be accepted");
                }
            }
        }

    }
}

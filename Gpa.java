import java.util.Scanner;

public class Gpa{
    public static void main(String[] args){
        System.out.println("How many courses are you pursuing this semester?");
        Scanner user = new Scanner(System.in);
        int x = user.nextInt();

        double[] nbcourses = new double[x];
        double sum = 0;
        for(int i = 0; i < nbcourses.length; i++){
            System.out.println("Enter your score for course " + (i+1) + ":");
            nbcourses[i]= user.nextDouble();

            sum = sum + nbcourses[i];
            
        }
            double average = sum/nbcourses.length;
            System.out.println("Your average is " + average);

            if(average>=70){
                System.out.println("Your grade is A");
            }
            else if(average >= 60 && average<70){
                System.out.println("Your grade is B");
            }
            else if(average >= 50 && average < 60){
                System.out.println("Your grade is C");
            }
            else if(average >= 40 && average < 50){
                System.out.println("Your grade us E");
            }
            else{
                System.out.println("Your grade is F");
            }



    }
}
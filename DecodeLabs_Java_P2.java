import java.util.Scanner;
import java.util.InputMismatchException;

public class DecodeLabs_Java_P2
{
    public static void main(String[] args)
    {
        int total_sub =0, subjectNumber =0,i=0, total_sub_marks = 0;
        double percentage;
        Scanner sc = new Scanner(System.in);
        while(i==0)
        {
        try
                {
                    System.out.print("How Many Subjects do you want to Enter: ");
                    total_sub = sc.nextInt();
                    if(total_sub <= 0) { System.out.println("Enter at least 1 subject."); continue; }
                }   
           catch(InputMismatchException  e)
                {
                    sc.nextLine();
                    System.out.println("Write Numbers Only!");
                }

            for(i = 0; i < total_sub; i++)
            {
                try{
                    ++subjectNumber;
                    System.out.print("Enter the Marks of the " + subjectNumber  + " Subject (0-100): ");
                    int sub_marks = sc.nextInt();

                if(sub_marks > 100 || sub_marks < 0)
                        {
                            System.out.println("Invalid Input! Enter Valid Number.");
                            i--;
                            --subjectNumber;
                            continue;                    
                        }       
               
                total_sub_marks = total_sub_marks + sub_marks;
                }

                catch(InputMismatchException e)
                {
                    System.out.println("Invalid Input! Write Numbers Only!");
                    subjectNumber--;
                    i--;
                    sc.nextLine();
                }
            }

        }
        System.out.println("Total Subjects = " + total_sub);
        System.out.println("Total Marks = " + total_sub*100);
        percentage = (double) total_sub_marks/(total_sub*100) * 100;
        System.out.println("Obtained Marks = " + total_sub_marks);
        System.out.printf("Percentage = %.2f%%" , percentage);
        System.out.println();

        if(percentage >= 90)
        {
            System.out.println("Your Grade is A");
        }

        else if(percentage >= 80)
        {
            System.out.println("Your Grade is B");
        }

        else if(percentage >= 70)
        {
            System.out.println("Your Grade is C");
        }
        
        else if(percentage >= 60)
        {
            System.out.println("Your Grade is D");
        }
        
        else
        {
            System.out.println("Your Grade is F");
        }
    }
}
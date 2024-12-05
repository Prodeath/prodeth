import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the marks of Maths ");
        float Maths = sc.nextFloat();
        System.out.println("Enter the marks of physics ");
        float physics = sc.nextFloat();
        System.out.println("Enter the marks of Chemistry");
        float Chemistry = sc.nextFloat();
        System.out.println("Enter the marks of Biology");
        float Biology = sc.nextFloat();
        System.out.println("Enter the marks of English");
        float English = sc.nextFloat();
        float total = Maths + physics + Chemistry + Biology + English;
        float average = total / 500;
        float percentage = average*100;
        System.out.println("percentage of all the subjects"+ percentage);
 

        
    }
}

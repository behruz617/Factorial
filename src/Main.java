import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Faktoriel Number  ");
        int number = sc.nextInt();

        int result=1;
        for (int i = 1; i <=number ; i++) {
                result*=i;

        }
              System.out.println("Result "+result);


        //OR While
//        int i=1;
//        while (i<=number){
//            result*=i;
//            i++;
//        } System.out.println("Result "+result);
    }
}

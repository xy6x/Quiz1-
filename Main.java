import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter number");
        int number = s.nextInt();
        for (int i = number; i > 0; i++) {


            if (number > 0) {
                System.out.println("the number is even :"+ number);
            }  if (number<0) {
                System.out.println("the number is odd :" + number);
            }

            if (number == -1) {
                break;
            }
            System.out.println("please enter number");
            number = s.nextInt();
        }
        System.out.println("please enter number");
        int num = s.nextInt();
        int ne = 0;
        for (int i = num; i > 0; i++){
            if (num ==-1){
                break;
            }
            ne=ne+num;
            System.out.println("please enter number");
             num = s.nextInt();

        }
       System.out.println("total number: "+ne);

        int [] arr ={10, -21 , 30, 31, -25};
        for (int z:arr
             ) {
            if (z > 0) {
                System.out.println(z+" is a positive number ");
            }if (z <0) {
                System.out.println(z+" is a negative number ");
            }

        }
        String [] test = new String[4];
        test[0] ="Tuwaiq" ;
        test[1] ="Bootcamp" ;
        test[2] ="Student" ;
        test[3] ="JAVA" ;
        int first1 = test[0].length();
        int first2 = test[1].length();
        int first3 = test[2].length();
        int first4 = test[3].length();
        if (first1< first2&& first1<first3&&first1<first4){
            System.out.println(test[0]);

        }else if (first2<first3&&first3<first4){
            System.out.println(test[1]);

        }else if (first3<first4){
            System.out.println(test[2]);
        }else
            System.out.println(test[3]);


        }
    }

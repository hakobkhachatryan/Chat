package test;

import java.util.Date;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number of members ");
        Scanner s =new Scanner(System.in);
        int i =s.nextInt();
        String[] members =new String[i];
        for (int j=1;j<=i;j++){
            String message ;
            System.out.println(j+".Enter member's name");
            Scanner s1 =new Scanner(System.in);
            String memberName = s1.nextLine();
            System.out.println("1.Send message");
            System.out.println("2.Exit chat");
            Scanner s2 =new Scanner(System.in);
            int method = s2.nextInt();
            switch (method) {
                case 1:
                    Scanner s3 =new Scanner(System.in);
                    message =s3.nextLine();
                    Date date= new Date();
                    System.out.println(date.toString()+"member"+    j+"-"+memberName+": "+message);
                    break;
                case 2:
                    Scanner s4 =new Scanner(System.in);
                    System.out.println("member"+    j+"-"+memberName+": ");
                    continue;

            }


        }

    }
}

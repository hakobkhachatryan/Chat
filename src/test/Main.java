package test;

import java.util.Date;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    //static String message;

    public static void main(String[] args) {
        System.out.println("Enter number of members ");
        Scanner s =new Scanner(System.in);
        int i =s.nextInt();
        s.nextLine();
        int numOfInactiveUsers = 0;
        Member[] members =new Member[i];
        for (int j=0; j%i < i; j++) {
            if (members[j%i] == null) {
                System.out.println((j%i)+1 + ".Enter member's name");
                members[j%i] = new Member(s.nextLine());
            }
            if (numOfInactiveUsers == i) {
                System.out.println("All users have exited the chat");
                break;
            } else {
                if(members[j%i].isActive()) {
                    System.out.println(members[j%i].getName() + " :press 1 to Send a message, press 2 to Exit chat");
                    numOfInactiveUsers += sendOrExit(j%i, members[j%i]);
                }
            }
        }
    }

    public static int sendOrExit(int i, Member user) {
        Scanner s = new Scanner(System.in);
        int method = s.nextInt();
        s.nextLine();
        switch (method) {
            case 1:
                System.out.println("Input the message");
                Date date= new Date();
                System.out.println(date.toString()+" member"+    (i+1) +"-"+user.getName()+": "+ s.nextLine());
                break;
            case 2:
                user.setActive(false);
                System.out.println("member"+    (i+1)+"-"+user.getName()+": left");
                break;
            default:
                System.out.println("please input either 1 or 2");
                sendOrExit(i, user);
                break;
        }
        return method-1;
    }
}

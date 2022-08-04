package ExDay5;

import java.util.Random;
import java.util.Scanner;

public class ExDay5 {
    public static void main(String[] args) {
        // T1
        Scanner getFromUser = new Scanner(System.in);
       /* System.out.println("Enter your First number : ");
        int Number1=getFromUser.nextInt();
        System.out.println("Enter your socande number : ");
        int Number2=getFromUser.nextInt();
        System.out.println("Enter your Oprations  : ");
        String op=getFromUser.next();

        if (op.equals("+")){
            System.out.println("the Total is :"+(Number1+Number2));
        } else if (op.equals("-")) {
            System.out.println("the Total is :"+ (Number1-Number2));
        } else if (op.equals("*")) {
            System.out.println("the Total is :"+(Number1*Number2));
        } else if (op.equals("/")) {
            System.out.println("the Total is :"+(Number1/Number2));
        }else {
            System.out.println("please chose the right opration");
        }*/


        //T2
      /*  System.out.println("if you want to play with us \n chose any of these scissors / rock / paper ");
        String userChose= getFromUser.next();
        Random random=new Random();
        int randomNum= random.nextInt(3);
        String mov="";
        if (randomNum==0){
            mov="scissors";
        } else if (randomNum==1) {
            mov="rock";
        } else if (randomNum==2) {
            mov="paper";
        }
     if (userChose.equals("scissors")) {
         if (mov.equals("scissors")){
             System.out.println("there is no winner !");
         } else if (mov.equals("rock")) {
             System.out.println("you lose :(");
         }else {
             System.out.println("you are the winner :)");
     }
    }
       else if (userChose.equals("rock")) {
            if (mov.equals("rock")){
                System.out.println("there is no winner !");
            } else if (mov.equals("paper")) {
                System.out.println("you lose :(");
            }else {
                System.out.println("you are the winner :)");
            }
        }


       else if (userChose.equals("paper")) {
         if (mov.equals("paper")){
             System.out.println("there is no winner !");
         } else if (mov.equals("scissors")) {
             System.out.println("you lose :(");
         }else {
             System.out.println("you are the winner :)");
         }
     }*/

        // T3
// Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

// Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);


    }}

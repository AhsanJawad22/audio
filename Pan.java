package javafile;
import java.util.Scanner;

//  import java.security.NoSuchAlgorithmException;

import java.util.Arrays;
public class Pan{
public static void printJava(){
    System.out.println("hello lala");
}
public static void printName(String name){
    System.out.println(name);
}
public static void printSum(int a , int b){
    int sum = a + b;
    System.out.println(sum);
}
public static void main(String[] args) {
// //  */ System.out.println("hallo Ahsan");
  
//   String name = "Ahsan";
//   int age = 30;
//   String Bhai = "Ahmad";
  
 
// System.out.println(name + age + Bhai );

// byte age = 30;
// int phone = 23567783;
// long phone2 = 254648494949L;
// float pi = 3.14f;

// String name = new String("apu");
// String frind = new String("lala");
// System.out.println("the length is " + name.length());
    
// String name1 = "ahsan";
// String name2 = "jawad";
// String name3 = name1 + name2;
// System.out.println(name3);

    //  int age = 30;
    //  int pyp = 7; 
    //  int eng = 34;
    //  int sis = 34;

//      int[] marks = new int[3];
//      marks[0] = 99;
//      marks[1] = 98;
//      marks[2] = 94;
// //      System.out.println(marks[0]);
// int[] marks = {23,44,65};
//    Arrays.sort(marks);
//    System.out.println(marks[0]);
// int [][] faMarks ={{23,46,43}, {47,64,28}};
// for(int i=0;i<=faMarks.length;i++)
//     for(int j=0;j<=faMarks.length;j++)


// {
//     System.out.println(faMarks[i][j]); 
// }
//   System.out.println(faMarks[0][1]); 
// double price = 100.00;
// double finalprice = price + 18;

// System.out.println(finalprice);

// int p = 100;
// int fp =  p +(int)18;

// System.out.println(fp);

 
// double a = 9;
// double b = 2;

// double module = a % b;
// System.out.println(module);

// int num = 3;
// num++;
// System.out.println(num);
// System.out.println(Math.max(5,8));

// Scanner sc = new Scanner(System.in);
// System.out.println("input your name : ");

// // int age = sc .nextInt();
// // System.out.println(age);
// String name = sc.nextLine();
// System.out.println(name);

// boolean isSunUp =  true;
//     if (isSunUp == true)
//       System.out.println("Day");
   
//    else
//      System.out.println("night");

// int age = 23;
// if(age > 18)
// System.out.println("vote");
// else
// System.out.println("onvote");
// Scanner sc = new Scanner(System.in);
// int cash = sc.nextInt();

// if(cash < 10) {
//     System.out.println("cnt get 1 thing");
//     System.out.println("get more cash");
// }

// else if(cash > 10 && cash < 50){
//     System.out.println("get 1 thing");
// }

// else {
//     System.out.println("can get both");
// }

// int day = 3;

// switch(day) {
//     case 1 :
//     System.out.println("monday");
//    break;
//     case 2 :
//     System.out.println("tusday");
//     break;
//     case 3 :
//     System.out.println("wednesday");
//     break;
//     default :
//     System.out.println("thusday");
// }
// for(int i = 10; i >= 1; i = i-1) {
//     System.out.println(i);
// } 
// int j = 10;

// while(j >=1){
//     System.out.println(j);
//     j = j - 1;

// int i = 0;
// while(true) {
//     if (i == 3){
//         i = i +1;
//     }
//     System.out.println(i);
//     i = i + 1;
//     if (i > 5){
//         break;
//     }
//           }
//   int[] marks ={34,65,89};

//   try {
//     System.out.println(marks[4]);
//   }
//   catch(Exception exception){
//   }
//   System.out.println("galti ha");

// printJava();

// printName("ali");
// printName("Bilal");

// printSum(2, 5);

Scanner sc = new Scanner(System.in);

int myNum = (int)(Math.random()*100);
int userNum;
do {
    System.out.println("Guess my num(1-100)  ; ");
     userNum = sc.nextInt();

    if (userNum == myNum) {
        System.out.println("WOOOOOOO.....RIGHT");
   break;
    }
    else if(userNum > myNum){
        System.out.println("your number is Big");
    }
    else {
        System.out.println("your number is Small");
    }
}while(userNum >= 0);
System.out.printf("%s %d", "my number was : ", myNum);
//System.out.println("myNum");

// String color;
// String type;

// public void write() {
//     System.out.println("write something");

// }

}

}




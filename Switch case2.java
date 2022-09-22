//Auther: praveen kumar
//Title: switch case
//Date: 09/08/2022
import java.util.*;
class switch_case2
{
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the day");
   String word= sc.next();
   int i=10;
   switch(word)
   {
    case"mon"->System.out.println("1st day:"+i);
    case"tue"->System.out.println("2nd day:"+i);
    case"wed"->System.out.println("3rd day:"+i);
    case"thur"->System.out.println("4th day:"+i);
    case"fri"->System.out.println("5th day:"+i);
    case"sat"->System.out.println("6th day:"+i);
   }
  }
}
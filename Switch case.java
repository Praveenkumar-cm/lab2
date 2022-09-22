//Auther: praveen kumar
//Title: Switch case
//Date: 08/08/2022
import java.util.*;
class Switch_Case
{
 public static void main(String[]args)
 { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the letter:");
  char ch=sc.next().charAt(0);
 switch(ch)
  {
    case 'a':
            System.out.println("first letter in vowels");
    break;
    case 'e':
            System.out.println("second letter in vowels");
    break;
    case 'i':
            System.out.println("third letter in vowels");
    break;
    case 'o':
            System.out.println("fourth letter in vowels");
    break;
    case 'u':
            System.out.println("fifth letter in vowels");
    break;
  }
 }
}
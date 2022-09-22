//Auther: praveenkumar
//Title: Return type
//Date: 13/08/2022
class returntype
{
public static int main1(int i)
{
 System.out.println("print the int value:"+i);
 return(i);
}
public static float main2(float j)
{
 System.out.println("print the float value:"+j);
 return(j);
}
public static char main3(char k)
{
 System.out.println("print the char:"+k);
 return(k);
}
public static void main(String[]args)
{
 int i=15;
 float j=12.5F;
 char k='A';
 main1(i);
 main2(j);
 main3(k);
}
}
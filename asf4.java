import java.util.*;
class asf4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name: ");
        String s=sc.next();

        
        System.out.println("enter the age: ");
        int a =sc.nextInt();

        String res = String.format("the person name is %s and his age is %d ",s,a);

        System.out.println(res);

    }
}
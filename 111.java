import java.util.*;
public class task1
{
    public static void main(String[] mpr)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int X = obj.nextInt();
        int Y = obj.nextInt();
        int Z = obj.nextInt();
        if (X == Y && Y == Z && Z == X)
            System.out.println("ALL THE NUMERS ARE EQAL");
        else if (X == Y && Y == Z && Z == X)
            System.out.println("ALL THE NUMERS ARE  NOT EQAL");
    }
}

import java.util.Scanner;

public class Calculator{
   public static Scanner input = new Scanner(System.in);

   public static void main(String[] args){
      boolean a0 = true;
      boolean b0 = false;
      boolean c0 = true;
      System.out.println("Sum: "+fullAdder(a0, b0, c0)[0]+", Carry: "+fullAdder(a0, b0, c0)[1]);
   }
   
   //returns sum (index 0) and carry (index 1).
   public static boolean[] fullAdder(boolean a, boolean b, boolean c){
      boolean sc[] = new boolean[2];
      sc[0] = Logic.xor2(Logic.xor2(a, b), c); //sum
      sc[1] = Logic.or3(Logic.and2(a, b), Logic.and2(a, c), Logic.and2(b, c)); //carry
      return sc;
   }
}
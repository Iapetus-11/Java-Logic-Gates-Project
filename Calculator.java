import java.util.Scanner;

public class Calculator{
   public static Scanner input = new Scanner(System.in);

   public static void main(String[] args){
      boolean a0 = false;
      boolean b0 = true;
      boolean c0 = true;
      boolean db[] = new boolean[2];
      boolean difference = fullSubtractor(a0, b0, c0)[0];
      boolean borrow = fullSubtractor(a0, b0, c0)[1];
      System.out.println("Difference: "+difference+", Borrow: "+borrow);      
   }
   
   //returns sum (index 0) and carry out (index 1)
   public static boolean[] fullAdder(boolean a, boolean b, boolean c){ //a and b are the addends (a + b), c is the carry number
      boolean sc[] = new boolean[2];
      sc[0] = Logic.xor2(Logic.xor2(a, b), c); //sum
      sc[1] = Logic.or3(Logic.and2(a, b), Logic.and2(a, c), Logic.and2(b, c)); //carry
      return sc;
   }
   
   //returns difference (index 0) and borrow out (index 1)
   public static boolean[] fullSubtractor(boolean a, boolean b, boolean c){ //a is the minuend (a - x), b is the subtrahend (x - b), c is the borrow in
      boolean db[] = new boolean[2];
      db[0] = Logic.xor2(Logic.xor2(a, b), c);
      db[1] = Logic.or2(Logic.and2(Logic.invert(a), b), Logic.and2(Logic.invert(Logic.xor2(a, b)), c));
      return db;
   }
}
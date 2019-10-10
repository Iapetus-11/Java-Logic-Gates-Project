import java.util.Scanner;

public class Calculator{
   public static Scanner input = new Scanner(System.in);

   public static void main(String[] args){
      //in addition and subtraction it goes a+b or a-b.
      boolean a0 = false; //1
      boolean a1 = false; //2
      boolean a2 = false; //4
      boolean a3 = false; //8
      boolean b0 = false; //1
      boolean b1 = false; //2
      boolean b2 = true; //4
      boolean b3 = false; //8
      boolean cbIn = false; //1st carry/borrow in
      //addition
      boolean sc0[] = fullAdder(a0, b0, cbIn);
      boolean sc1[] = fullAdder(a1, b1, sc0[1]);
      boolean sc2[] = fullAdder(a2, b2, sc1[1]);
      boolean sc3[] = fullAdder(a3, b3, sc2[1]);
      boolean finalSum[] = {sc0[0], sc1[0], sc2[0], sc3[0], sc3[1]};
      System.out.println("a plus b: "+Convert.boolArrayToInt(finalSum));
      System.out.println(""+finalSum[0]+finalSum[1]+finalSum[2]+finalSum[3]+finalSum[4]);
      System.out.println(Convert.intToBoolArray(Convert.boolArrayToInt(finalSum)));
   }
   
   //returns sum (index 0) and carry out (index 1)
   public static boolean[] fullAdder(boolean a, boolean b, boolean c){ //a and b are the addends (a + b), c is the carry number
      boolean sc[] = new boolean[2];
      sc[0] = L.xor2(L.xor2(a, b), c); //sum
      sc[1] = L.or3(L.and2(a, b), L.and2(a, c), L.and2(b, c)); //carry out
      return sc;
   }
   
   //returns difference (index 0) and borrow out (index 1)
   public static boolean[] fullSubtractor(boolean a, boolean b, boolean c){ //a is the minuend (a - x), b is the subtrahend (x - b), c is the borrow in
      boolean db[] = new boolean[2];
      db[0] = L.xor2(L.xor2(a, b), c); //difference
      db[1] = L.or2(L.and2(L.invert(a), b), L.and2(L.invert(L.xor2(a, b)), c)); //borrow out
      return db;
   }
   
   /*public static boolean[] twoBitMultiplier(boolean a, boolean b){
      
   }*/
}
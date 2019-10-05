public class Logic{
   //2 input and
   public static boolean and2(boolean a, boolean b){
      return (a && b);
   }
   
   //three input and
   public static boolean and3(boolean a, boolean b, boolean c){
      return (a && b && c);
   }
   
   //two input or
   public static boolean or2(boolean a, boolean b){
      return (a || b);
   }
   
   //three input or
   public static boolean or3(boolean a, boolean b, boolean c){
      return (a || b || c);
   }
   
   //2 input xor
   public static boolean xor2(boolean a, boolean b){
      return (a && !b) || (!a && b);
   }
   
   //inverter
   public static boolean invert(boolean a){
      return (!a);
   }
}
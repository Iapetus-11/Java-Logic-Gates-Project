public class Logic{
   //two input and
   public static boolean and2(boolean a, boolean b){
      return (a && b);
   }
   
   //three input and
   public static boolean and3(boolean a, boolean b, boolean c){
      return (a && b && c);
   }
   
   //two input nand
   public static boolean nand2(boolean a, boolean b){
      return !(a && b);
   }
   
   //3 input nand
   public static boolean nand3(boolean a, boolean b){
      return !(a && b && c);
   }
   
   //two input or
   public static boolean or2(boolean a, boolean b){
      return (a || b);
   }
   
   //three input or
   public static boolean or3(boolean a, boolean b, boolean c){
      return (a || b || c);
   }
   
   //two input nor
   public static boolean nor2(boolean a, boolean b){
      return !(a || b);
   }
   
   //three input nor
   public static boolean nor3(boolean a, boolean b, boolean c){
      return !(a || b || c);
   }
   
   //two input xor
   public static boolean xor2(boolean a, boolean b){
      return ((a && !b) || (!a && b));
   }
   
   //two input xnor
   public static boolean xnor2(boolean a, boolean b){
      return ((a && b) || (!a && !b));
   }
   
   //inverter
   public static boolean invert(boolean a){
      return (!a);
   }
}
import java.util.Collections;
import java.util.Arrays;
import java.lang.Integer;

public class Convert{
   public static int boolArrayToInt(boolean[] bool){ //takes in bools like ...32 16 8 4 2 1, returns int like ...32 16 8 4 2 1
      boolean stop = false;
      int i = 0;
      String Int = "";
      while (i!=bool.length){
         if (bool[i]==false){
            Int = "0"+Int;
         }else if (bool[i]==true){
            Int = "1"+Int;
         }
         i++;
      }
      return Integer.parseInt(Int);
   }
   
   public static boolean[] intToBoolArray(int bin){
      int i = 0;
      int len = (""+bin).length();
      boolean bools[] = new boolean[len];
      while (i!=len){
         if (bin%10==1){
            bools[i] = true;
         }else{
            bools[i] = false;
         }
         bin/=10;
         i++;
      }
      return bools;
   }
}
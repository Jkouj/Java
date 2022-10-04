/**
 * CodingBatTurnIn.java
 * Joey Koumjian
 * 7/3/22
 */


public class CodingBatTurnIn

{
    public static String helloName(String name) {
      String result = "Hello "+name+"!";
      return result;
    }
    
    public static String makeAbba(String a, String b){
      String result = a+b+b+a;
      return result;
    }

    public static String makeTags(String tag, String word){
        String result = "<"+tag+">"+word+"</"+tag+">";
        return result;
    }
    
    public static String extraEnd(String str) {
      String result = str.substring(str.length()-2);
      //String output = result+result+result;
      //return output;
      return result+result+result;
    }
    
    public static boolean frontAgain(String str) {
        if (str.length()<2){
            return false;
        }
        //else if (str.substring(0,2).equals(str.substring(str.length()-2))) {
        //    return true;
        //}
        //else {
        //    return false;
        //}
        else {
            String front = str.substring(0, 2);
            String back = str.substring(str.length()-2);
            return(front.equals(back));
        }
    }
    
    public static String doubleChar(String str){
        if (str.equals("")){
            return "";
        }
        int i = 0;
        String result = "";
        do {
            result = result + str.charAt(i) + str.charAt(i); 
            i++;
        } while (i<str.length());
        return result;
    }
    
    public static int countHi(String str) {
        int count = 0;
        for (int i=0; i < str.length()-1; i++) {
            if(str.substring(i,i+2).equals("hi")) count++;
            //{
            //  count++;
            //}
            }
      return count;
    }
    
    public static boolean xyBalance(String str) {
        boolean y = true;
        if (str == "x"){
            return false;
        }
        else {
            for (int j = 0; j < str.length()-1 ; j++) {
                if (str.charAt(j) != 'x' && !y) {
                    return true;
                }
                else {
                int i = str.length()-1;
                while (i >= 0) {
                    char letter = str.charAt(i);
                    if (letter == 'x') {
                        return false;
                    }
                    else if (letter == 'y') {
                      return true;
                    }
                    i--;
                  }
                }
              }
        }
      return true;
    }
    
    public static String repeatEnd(String str, int n) {
        String end = str.substring(str.length()-n);
        String result = "";
        int i = 0;
        do {
        result = result + end;
        i++;
        } while (i<n);
        return result;
    }


}


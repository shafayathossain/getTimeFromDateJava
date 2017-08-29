package othoisomudro;

import java.util.Date;

public class OthoiSomudro {

    public static void main(String[] args) {
        Date date=new Date();  
        String dateString = date.toString();
        String s=subString(dateString, 11, 19);
        System.out.println(s);
    }

    private static String subString(String dateString, int start, int end) {
        char[] string = new char[100000]; 
        int j=0;
        for(int i=start; i<end; i++){
            string[j]=(dateString.charAt(i));
            j++;
        }
        
        return String.valueOf(string);
    }
    
}

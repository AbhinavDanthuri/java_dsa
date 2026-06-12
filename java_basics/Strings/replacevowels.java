import java.sql.SQLOutput;

public class replacevowels {
    public static void main(String args[]){
//        String s="abhinav";
//        String result="";
//        for(int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
//                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//                result = result + '*';
//            } else {
//                result = result + c;
//            }
//        }
//
//        System.out.println(result);
        //second one;

        String s="hi this is abhinav";
        String result=s.replaceAll("[aeiouAEIOU]","*");
        System.out.println(result);
        }
    }





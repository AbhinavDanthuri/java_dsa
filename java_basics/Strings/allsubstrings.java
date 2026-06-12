public class allsubstrings {
    public static void main(String args[]){
        String a="abcd";
        int count=0;
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                System.out.println(a.substring(i,j));
                count++;
            }
        }
        System.out.println(count);
    }
}

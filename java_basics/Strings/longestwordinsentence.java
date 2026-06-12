public class longestwordinsentence {
    public static void main(String args[]){
        String word="i am abhinav";
        String[] words=word.split(" ");
        String longest="";
        for(String wordss:words){
            if(wordss.length()>longest.length()){
                longest=word;
            }
        }
        System.out.println(longest);
    }
}

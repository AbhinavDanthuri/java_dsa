public class countwords {
    public static void main(String args[]){

        String s="hi hello namasthe";
        String[] words=s.split("\\s+");
        System.out.println(words.length);


    }

}
//visualization
//"hi  hello   world".split(" ")    // splits on single space only
//// → ["hi", "", "hello", "", "", "world"]  ❌ empty slots appear
//
//"hi  hello   world".split("\\s+") // splits on ANY number of spaces
//// → ["hi", "hello", "world"]  ✅ clean

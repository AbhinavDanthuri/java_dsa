public class countuppercaselowercaseletters {
    public static void main(String args[]){
        String str = "AbHiNaV";

        int upper = 0;
        int lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            }
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
    }
}

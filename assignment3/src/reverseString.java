public class reverseString {
    public String reverse(String s) {
        s = s.trim(); //delete leading or trailing space
        StringBuilder str = new StringBuilder();
        int j = s.length()-1;
        for(int i = s.length()-1 ; i >= 0 ; i--){
            if(s.charAt(i) == ' ' && i != j) {
                str.append(s.substring(i + 1, j + 1) + " ");
            }
            if(s.charAt(i) == ' ')
                j = i - 1;
            if(i == 0){
                str.append(s.substring(i , j + 1) + " ");
            }
        }
        return str.toString().trim();
    }

    public static void main(String args[]){
        reverseString string = new reverseString();
        System.out.println(string.reverse("the sky  is blue"));
    }
}

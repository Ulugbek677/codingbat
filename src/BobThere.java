public class BobThere {
    public static void main(String[] args) {
        String str = "strb2blsbo";
        System.out.println(bobThere(str));

    }
    public static boolean bobThere(String str) {
        int len = str.length()-2;
        for (int i = 0; i < len; i++) {
            if(str.charAt(i)=='b' && str.charAt(i+2)=='b'){
                return true;
            }
        }
        return false;
    }
}

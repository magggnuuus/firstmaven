public class StringLength {
    public static void main(String[] args){
        String var2 = "kekse";
        System.out.println(checkStringLength(var2));
    }

    public static boolean checkStringLength(String var1){
        return var1.length() > 20;
    }
}

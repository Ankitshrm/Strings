import java.util.Scanner;

public class FaultyKeyboard {

    private static boolean checkAns(String name ,String typed){

        if(name.length()<typed.length()) {
            int i = 0;
            int j = 0;

            while (i < name.length() && j < typed.length()) {
                if (name.charAt(i) == typed.charAt(j)) {
                    i++;
                    j++;
                } else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                    j++;
                } else {
                    return false;
                }
            }

            while (j<typed.length()){
                if (name.charAt(i-1)!=typed.charAt(j))
                    return false;
                j++;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);

        String name = ip.next();
        String typed =ip.next();

        System.out.println(checkAns(name,typed));
    }
}

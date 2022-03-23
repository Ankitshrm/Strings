public class BasicOfString {
    public static void main(String[] args) {
        String a = "Hello World";
        System.out.println(a);

        //Finding the particular character in string
        System.out.println("Character at index 2 -> "+a.charAt(2));

        char chars[] =new char[a.length()];
        for(int i=0;i<a.length();i++)
        {
            chars[i]=a.charAt(i);
            System.out.print(chars[i]+" ");
        }

        System.out.println();


        // Convert String to CharArray

        char chars2[]=a.toCharArray();
        for(char s:chars2){
            System.out.print(s+" ");
        }

        System.out.println();

        //Copying String

        String b= a;
        System.out.println(b);

        System.out.println();

        //Reverse a String

        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }

        System.out.println();

        //Palindrome

        String palString  =a;

        for(int i=a.length()-1;i/2>=0;i--){
            if(palString.charAt(i)==a.charAt(i)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Non Palindrome");
            }
        }



    }
}

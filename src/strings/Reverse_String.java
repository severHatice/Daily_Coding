package strings;

import java.util.Stack;

public class Reverse_String {

    /*
   ####### How do you reverse a string in Java?
There is no reverse() utility method in the String class. However, you can create a character array from the string and
then iterate it from the end to the start. You can append the characters to a string builder and finally return the reversed string.
    * */
    public static void main(String[] args) {
        //CHAR ILE
        String str = "bir";
        char[] ch = str.toCharArray();
        String reversed = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            reversed += ch[i];
        }
        System.out.println(reversed);

        //BY USING STACK
        String st="hello";
        Stack<Character> stc= new Stack<>();
        for (char c:st.toCharArray()) {
        stc.push(c);
        }
        String reversed2="";
      while(!stc.isEmpty()){
       reversed2+=stc.pop();
      }
        System.out.println(reversed2);

      //STRINGBUILDER

        String str3="yasasin";
        StringBuilder sb=new StringBuilder();
        sb.append(str3);
        sb.reverse();
        System.out.println(sb);


    }
}

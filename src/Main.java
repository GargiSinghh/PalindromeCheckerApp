//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.LinkedList;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] var0) {
        String var1 = "civic";
        LinkedList var2 = new LinkedList();
        Stack var3 = new Stack();

        for(char var7 : var1.toCharArray()) {
            var2.add(var7);
            var3.push(var7);
        }

        boolean var8 = true;

        while(!var2.isEmpty()) {
            if (var2.remove() != var3.pop()) {
                var8 = false;
                break;
            }
        }

        System.out.println("Input : " + var1);
        System.out.println("Is Palindrome? : " + var8);
    }
}

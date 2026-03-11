//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] var0) {
        String var1 = "noon";
        Stack var2 = new Stack();

        for(char var6 : var1.toCharArray()) {
            var2.push(var6);
        }

        boolean var8 = true;

        for(char var7 : var1.toCharArray()) {
            if (var7 != (Character)var2.pop()) {
                var8 = false;
                break;
            }
        }

        System.out.println("Input : " + var1);
        System.out.println("Is Palindrome? : " + var8);
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] var0) {
        String var1 = "refer";
        ArrayDeque var2 = new ArrayDeque();

        for(char var6 : var1.toCharArray()) {
            var2.addLast(var6);
        }

        boolean var7 = true;

        while(var2.size() > 1) {
            char var8 = (Character)var2.removeFirst();
            char var9 = (Character)var2.removeLast();
            if (var8 != var9) {
                var7 = false;
                break;
            }
        }

        System.out.println("Input : " + var1);
        System.out.println("Is Palindrome? : " + var7);
    }
}

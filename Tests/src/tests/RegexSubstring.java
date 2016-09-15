
package tests;


/**
 *
 * @author Tamara
 */

/*
 Given a pattern string and a test string, 
 implement RegEx substring matching. 

 If the pattern is preceded by a ^, it will match with the starting position.
 Similarly, if it is preceded by a $, it will match the ending position.
 If no such markers are present, 
 it will check whether pattern is a substring of test. */
public class RegexSubstring {

    public static void main(String[] args) {

        System.out.println("1) \"abcdefhbj\", \"^abc\" must be true: real is " + isMatch("abcdefhbj", "^abc"));
        System.out.println("2) \"coaltar\", \"^coal\" must be true: real is " + isMatch("coaltar", "^coal"));
        System.out.println("3) \"java i love you\", \"^Java\" must be false: real is " + isMatch("java i love you", "^Java"));
        System.out.println("4) \"coaltar\", \"^coal\" must be true: real is " + isMatch("Java i love you", "^Java"));
        System.out.println("5) \"coaltar\", \"tar$\" must be true: real is " + isMatch("coaltar", "tar$"));
        System.out.println("6) \"coaltar i love you so please don`t go\", \"love you\" must be true: real is " + isMatch("coaltar i love you so please don`t go", "love you"));
        System.out.println("7) \"love you java\", \"you\" must be true: real is " + isMatch("I love yoU java, because I love you", "you"));
        System.out.println("5) \"avtoshop\", \"tar$\" must be false: real is " + isMatch("avtoshop", "tar$"));
        System.out.println("7) \"ladushky\", \"mart\" must be false: real is " + isMatch("ladushky", "mart"));

    }

    public static boolean isMatch(String str, String partStr) {

        char[] chStr = str.toCharArray();
        char[] chPartStr = partStr.toCharArray();

        if (partStr.charAt(0) == '^') {
            for (int i = 1; i < chPartStr.length; i++) {
                if (chStr[i - 1] != chPartStr[i]) {
                    return false;
                }
            }
            return true;

        } else if (partStr.charAt(partStr.length() - 1) == '$') {
            if (chPartStr.length <= chStr.length) {
                for (int i = chPartStr.length - 2, k = chStr.length - 1; i >= 0; i--, k--) {
                    if (chStr[k] != chPartStr[i]) {
                        return false;
                    }
                }
                return true;
            }

        } else {
            System.out.println("another");
            boolean isFit = false;
            int count = 0;
            int i = 0;

            for (char ch : chStr) {
                if (ch == chPartStr[i] && isFit == false) {
                    isFit = true;
                    count++;
                    i++;
                } else if (isFit == true) {
                    if (ch == chPartStr[i]) {
                        count++;
                        i++;
                    } else {
                        count = 0;
                        i = 0;
                        isFit = false;
                    }
                }
                if (count == chPartStr.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMatch3(String str, String partStr) {

        if (partStr.startsWith("^")) {
            return ("^" + str).startsWith(partStr);
        }
        if (partStr.endsWith("$")) {
            return (str + "$").endsWith(partStr);
        } else {
            return str.indexOf(partStr) >= 0;
        }
    }

    public static boolean isMatch4(String str, String partStr) {

        if (partStr.startsWith("^")) {
            return str.matches("(?i)" + partStr + ".*");
        }
        if (partStr.endsWith("$")) {
            return str.matches("(?i).*" + partStr);
        } else {
            return str.matches("(?i).*" + partStr + ".*");

        }
    }

}

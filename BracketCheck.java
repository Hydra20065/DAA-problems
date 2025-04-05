public class BracketCheck {
    public static boolean isBalanced(String str) {
        String prev = "";
        while (!str.equals(prev)) {
            prev = str;
            str = str.replace("()", "").replace("{}", "").replace("[]", "");
        }
        return str.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[(])}";
        String test3 = "{[}";

        System.out.println("Test 1: " + isBalanced(test1)); // true
        System.out.println("Test 2: " + isBalanced(test2)); // false
        System.out.println("Test 3: " + isBalanced(test3)); // false
    }
}

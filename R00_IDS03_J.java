// R00_IDS03_J.java  (non-compliant example)
public class R00_IDS03_J {
    public static void main(String[] args) {
        String username = args.length > 0 ? args[0] : "unknown";
        boolean loginSuccessful = false; // demo
        if (loginSuccessful) {
            System.err.println("User login succeeded for: " + username); // vulnerable
        } else {
            System.err.println("User login failed for: " + username); // vulnerable
        }
    }
}

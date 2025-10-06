// R00_IDS03_J.java  (non-compliant example)
// Input Validation and Data Sanitization (IDS): 
// IDS03-J: Do not log unsanitized user input
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
// This noncompliant code example logs untrusted data from an unauthenticated user without data sanitization.


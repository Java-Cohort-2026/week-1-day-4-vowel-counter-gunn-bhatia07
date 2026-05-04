public class Main {
    public static void main(String[] args) {
        // --- INPUT DATA ---
        String targetWord = "Engineering"; // Test with "Apple", "Rhythm", etc.
        
        // --- YOUR TASK ---
        // Iterate through the targetWord and count the total number of vowels (A, E, I, O, U).
        // Ensure your code ignores case sensitivity (count 'e' and 'E').
        
        int vowelCount = 0; // TODO: Implement your loop logic to update this counter
        for (int i=0; i<targetWord.length(); i++) {
            char ch = targetWord.charAt(i);
            if (ch == 'a' || ch== 'A' || ch== 'e' || ch== 'E' || ch== 'i' || ch== 'I' || ch== 'o' || ch== 'O' || ch== 'u' || ch== 'U') {
                    vowelCount ++;
            }
        }

        // --- OUTPUT ---
        System.out.println("The word '" + targetWord + "' contains " + vowelCount + " vowels.");
    }
}

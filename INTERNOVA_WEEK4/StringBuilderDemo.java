public class StringBuilderDemo {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("        STRINGBUILDER DEMO");
        System.out.println("======================================");

        // Create StringBuilder
        StringBuilder text =
                new StringBuilder("Java Programming");

        System.out.println("\nOriginal Text:");
        System.out.println(text);

        // Append
        text.append(" is interesting.");

        System.out.println("\nAfter Append:");
        System.out.println(text);

        // Insert
        text.insert(5, "Core ");

        System.out.println("\nAfter Insert:");
        System.out.println(text);

        // Replace
        text.replace(0, 4, "Advanced");

        System.out.println("\nAfter Replace:");
        System.out.println(text);

        // Reverse
        text.reverse();

        System.out.println("\nAfter Reverse:");
        System.out.println(text);

        System.out.println("\n======================================");
        System.out.println("StringBuilder operations completed!");
        System.out.println("======================================");
    }
}
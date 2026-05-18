public class theStringBuilder {

    static void main() {

        String helloWorld = "Hello" + "World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

    }

    public static void printInformation (String string) {

        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());

    }

    public static void printInformation (StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
    }

}

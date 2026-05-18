public class anotherMain {

    public static void main(String[] args) {

        String bulletIt  = "Print a bullted List:\n" + "\t\u2022 First Point\n" + "\t\u2022 Second Point\n";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                    \u2022 Second Point""";

        System.out.println(textBlock);
    }
}

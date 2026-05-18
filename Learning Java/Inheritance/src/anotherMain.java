public class anotherMain {

    public static void main(String[] args) {

        String bulletIt  = "Print a bullted List:\n" + "\t\u2022 First Point\n" + "\t\u2022 Second Point\n";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                    \u2022 Second Point""";

        System.out.println(textBlock);

        int age =35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 1995 - age;
        System.out.printf("Age = %d, Birth Year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}

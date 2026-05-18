public class stringManipulationMethods {

    public static void main(String[] args) {

        String birthdate = "29/09/1995";
        int startingIndex = birthdate.indexOf("1995");
        System.out.println("starting index = " + startingIndex);
        System.out.println("Birthdate year = " + birthdate.substring(startingIndex));


        System.out.println("Month = " + birthdate.substring(3, 5));
        System.out.println("Day = " + birthdate.substring(0, 2));
        System.out.println("Year = " + birthdate.substring(6));

        String newDate = "29".concat("/").concat("09").concat("/").concat("1995");
        System.out.println(newDate);

        //replacing methods
        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}

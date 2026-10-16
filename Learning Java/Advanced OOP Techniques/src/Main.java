public class Main {

    public void main(String[] args) {

        ComputerCase theCase = new ComputerCase("220B", "MSI", "190");
        Monitor theMonitor = new Monitor("27inch", "Acer", 27, "2540x1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixel(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

    }
}
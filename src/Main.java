public class Main {
    public static void main(String[] args) {
        Processor intelProcessor = new IntelProcessor();
        Computer computerWithIntel = new Computer(intelProcessor);
        computerWithIntel.executeProgram();

        Processor amdProcessor = new AmdProcessor();
        Computer computerWithAmd = new Computer(amdProcessor);
        computerWithAmd.executeProgram();
    }

}
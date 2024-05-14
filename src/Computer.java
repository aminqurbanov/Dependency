public class Computer {
    private Processor processor;

    public Computer(Processor processor) {
        this.processor = processor;
    }

    public void executeProgram() {
        System.out.println("Booting up the computer...");
        processor.processInstructions();
    }
}

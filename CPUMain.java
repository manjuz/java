class CPU {
    double price;
    class Processor{
double no_of_cores;
               String manufacturer;

               double getCache(){
                return 4.3;
               }
    }
    static class RAM{
double memory;
        String manufacturer;

        double getClockSpeed(){
           return 5.5;
        }
    }
}
public class CPUMain {
    public static void main(String[] args) {
    CPU cpu = new CPU();
    CPU.Processor processor = cpu.new Processor();
    CPU.RAM ram = new CPU.RAM();
    System.out.println("Processor Cache = " + processor.getCache());
    System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}

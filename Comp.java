import java.util.Scanner;

class Cpu {
  int price=35000;

  class Processor {
    int numcores=16;
    String manufacturer="intel";
    
   static class RAM {
    String memory="64",manufacturer="Samsung";
  }
}
}
public class Comp{
  public static void main(String[] args) {
    Cpu myCpu = new Cpu();
    Cpu.Processor myproc=myCpu.new Processor();
    Cpu.Processor.RAM myRAM=new Cpu.Processor.RAM();
    System.out.println("price="+myCpu.price);
    System.out.println("number of cores="+myproc.numcores);
    System.out.println("Manufacturer="+myproc.manufacturer);
    System.out.println("Memory="+myRAM.memory);
    System.out.println("RAM Manufacturer="+myRAM.manufacturer);
    
  }
}



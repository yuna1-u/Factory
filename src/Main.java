public class Main {
    public static void main(String[] args) {


        Factory factory = new Factory("milk", 1_000_000, "Rabia");
        Factory factory1 = new Factory("Phone", 100_000_000, "Sami");
        Factory factory2 = new Factory("Car",800_000_000,"Qwerty");
        Factory factory3 = new Factory();
        Factory factory4 = new Factory();

        System.out.println(factory);
        System.out.println(factory1);
        System.out.println(factory2);

        System.out.println("number of all factories: " + Factory.allCount);
        System.out.println("number of unused factories: " + Factory.unusedCount);

    }
}


public class Factory {

    private String factoryName;
    private int annualTurnover;
    private String owner;
    String[] factories = new String[3];
    public static int allCount = 0;
    public static int unusedCount = 0;

    public Factory() {
        for (int i = 0; i < factories.length; i++) {
            if (factories[i] == null) {
                factories[i] = factoryName;
            }
            if (factories[i] != null) {
            }
        }
        allCount++;
        unusedCount++;
    }

    public Factory(String factoryName, int annualTurnover, String owner) {

        this.factoryName = factoryName;
        this.annualTurnover = annualTurnover;
        this.owner = owner;

        for (int i = 0; i < factories.length; i++) {
            if (factories[i] == null) {
                factories[i] = factoryName;
            }
            if (factories[i] != null) {
            }
        }
        allCount++;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public int getAnnualTurnover() {
        return annualTurnover;
    }

    public void setAnnualTurnover(int annualTurnover) {
        this.annualTurnover = annualTurnover;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void displyfactory() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "-----------" + getFactoryName() + "-----------" + '\n' +
                "factoryName = " + factoryName + '\n' +
                "annualTurnover = " + annualTurnover + '\n' +
                "owner = " + owner +'\n';
    }
}

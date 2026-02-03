public class Certificazione {
    private double lca;
    private double carbonFootPrint;
    private double waterFootPrint;

    public Certificazione(double lca, double carbonFootPrint, double waterFootPrint) {
        this.lca = lca;
        this.carbonFootPrint = carbonFootPrint;
        this.waterFootPrint = waterFootPrint;
    }

    public double getLca() {
        return lca;
    }

    public void setLca(double lca) {
        this.lca = lca;
    }

    public double getCarbonFootPrint() {
        return carbonFootPrint;
    }

    public void setCarbonFootPrint(double carbonFootPrint) {
        this.carbonFootPrint = carbonFootPrint;
    }

    public double getWaterFootPrint() {
        return waterFootPrint;
    }

    public void setWaterFootPrint(double waterFootPrint) {
        this.waterFootPrint = waterFootPrint;
    }

    @Override
    public String toString() {
        return "Certificato{" +
                "lca=" + lca +
                ", carbonFootPrint=" + carbonFootPrint +
                ", waterFootPrint=" + waterFootPrint +
                '}';
    }
}

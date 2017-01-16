/**
 * Created by MałaMi on 2017-01-16.
 */
public class Camera {
    private String producer;
    private String model;
    private double weight;
    private int productionYear;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Camera(String producer, String model, double weight, int productionYear) {
        this.producer = producer;
        this.model = model;
        this.weight = weight;
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Camera camera = (Camera) o;

        if (Double.compare(camera.getWeight(), getWeight()) != 0) return false;
        if (getProductionYear() != camera.getProductionYear()) return false;
        if (!getProducer().equals(camera.getProducer())) return false;
        return getModel().equals(camera.getModel());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getProducer().hashCode();
        result = 31 * result + getModel().hashCode();
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getProductionYear();
        return result;
    }

    @Override
    public String toString() {
        return "Camera producer: " + producer
                + ";\tmodel: " + model
                + ";\tweight: " + weight
                + ";\tproduction year: " + productionYear;
    }
}

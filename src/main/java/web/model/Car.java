package web.model;

public class Car {

    private int id;
    private String model;
    private String series;
    private float engineVolume;

    public Car(int id, String model, String series, float engineVolume) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.engineVolume = engineVolume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}

public class Автомобиль {
    String brand;
    String model;
    String engineVolume;
    String color;
    String year;
    String country;

    Автомобиль(String brand, String model, String engineVolume, String color, String year, String country) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.country = country;
        this.engineVolume = engineVolume;
        this.year = year;
    }

    public String toString() {
        return brand + " " + model + "," + year + "," + country + "," + color + "," + engineVolume;
    }
}

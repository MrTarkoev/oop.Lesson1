public class Автомобиль {
    int productionYear;
    double engineVolume;
    String color;
    String brand;
    String model;
    String productionCountry;
    public Автомобиль(){
        this("default", "default", "default");
    }
    public Автомобиль(String brand, String model, String productionCountry){
        this(2000, 1.5,"белый", brand,model,productionCountry);
    }
    public Автомобиль(int productionYear, double engineVolume, String color, String brand, String model, String productionCountry) {
        if(model==null || model.isEmpty()){
            this.model = "default";
        } else{
            this.model = model;
        }
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (productionYear > 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    @Override
    public String toString(){
        return brand+" "+model+", "+productionYear+" год выпуска"+", страна сборки - "+productionCountry+", "
                +"цвет кузова - "+color+", объем двигателя - "+engineVolume+" л.";
    }
}

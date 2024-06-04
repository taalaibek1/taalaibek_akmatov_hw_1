public  class Car {
   private int year;
   private ColorEnum colorEnum;
   private String typeOfCar;

    public Car(int year, ColorEnum colorEnum, String typeOfCar) {
        this.year = year;
        this.colorEnum = colorEnum;
        this.typeOfCar = typeOfCar;
    }

    public int getYear() {
        return year;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public String getInfo(){
        return "Year: " + year + "\nColor: " + colorEnum + "\nType Of Car: " + typeOfCar;
    }
}

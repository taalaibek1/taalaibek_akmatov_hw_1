public class Honda extends Car{
    public Honda(int year, ColorEnum colorEnum, String typeOfCar) {
        super(year, colorEnum, typeOfCar);
    }

    public final void drivingCar(){
        System.out.println("Car is driving");
    }

    public void drivingCar(String owner){
        System.out.println("Car is driving by: " + owner);
    }
}

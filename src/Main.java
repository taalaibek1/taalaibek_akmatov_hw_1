import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
       Honda honda = new Honda(2018, ColorEnum.BLUE, "Honda");

       Mercedes mercedes = new Mercedes(2020, ColorEnum.WHITE, "Electrical", "Mercedes");
       Mercedes mercedes2 = new Mercedes(2001, ColorEnum.BLACK, "Engine", "Mercedes Benz");

        System.out.println(mercedes.getInfo());
        System.out.println(mercedes2.getInfo());
        System.out.println(honda.getInfo());

        honda.drivingCar();
        honda.drivingCar("by Owner");
    }
}
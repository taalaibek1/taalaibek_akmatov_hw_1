public final class Mercedes extends Car {

    private String mark;

    public Mercedes(int year, ColorEnum colorEnum, String typeOfCar, String mark) {
        super(year, colorEnum, typeOfCar);
        this.mark = mark;
    }



    @Override
    public String getInfo(){
        return super.getInfo()+ " " + "\nMark: " + mark;
    }
}

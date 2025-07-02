package chap1_8.poly.drive;

public class Main {

    public static void main(String[] args) {

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();

        Mustang m1 = new Mustang();
        Mustang m2 = new Mustang();
        Mustang m3 = new Mustang();

        Car[] cars = {t1, t2, t3, s1, s2, m1, m2, m3, new Sonata()};
        for (Car car : cars){
            car.accelerate();
        }

        // 결국 다형성을 통해 다른 타입들을 하나의 배열에 담을 수 있음.
        Object[] arr = {1, "dasas", false, new Sonata()};

        System.out.println("======================================= ");

        Driver heartping = new Driver("하츄핑");

        heartping.drive(t1);

        System.out.println("======================================= ");

        CarShop carShop = new CarShop();

        Car car1 = carShop.exportCar(2000);
        System.out.println("car1 = " + car1);
        if(car1 != null) car1.accelerate(); // null 체크

    }
}

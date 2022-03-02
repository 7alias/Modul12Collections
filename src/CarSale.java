import java.util.*;

public class CarSale {
    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {
        Car car1 = new Car(TOYOTA, "Camry", false);
        Car car2 = new Car(KIA, "Rio", false);
        Car car3 = new Car(BMW, "X5", false);
        Car car4 = new Car(BMW, "X6", false);
        Car car5 = new Car(BMW, "X3", false);
        Car car6 = new Car(TOYOTA, "Rav4", true);
        Car car7 = new Car(KIA, "Ceed", false);
        Car car8 = new Car(TOYOTA, "Yaris", false);
        Car car9 = new Car(BMW, "320l", false);
        Car car10 = new Car(TOYOTA, "Corolla", false);
        Car car11 = new Car(TOYOTA, "Camry", false);
        Car car12 = new Car(KIA, "Rio", false);
        Car car13 = new Car(BMW, "X5", false);
        Car car14 = new Car(BMW, "X6", false);
        Car car15 = new Car(BMW, "X3", false);
        Car car16 = new Car(TOYOTA, "Rav4", true);
        Car car17 = new Car(KIA, "Ceed", false);
        Car car18 = new Car(TOYOTA, "Yaris", false);
        Car car19 = new Car(BMW, "320l", false);
        Car car20 = new Car(TOYOTA, "Corolla", false);


        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);
        carList.add(car17);
        carList.add(car18);
        carList.add(car19);
        carList.add(car20);

Map<Car, Integer> carMap = new HashMap<>();
for(Car car:carList){
    if (carMap.containsKey(car)){
        int value = carMap.get(car);
        carMap.put(car, ++value);
    } else {
        carMap.put(car, 1);
    }
}
for(Map.Entry<Car, Integer> carEntry: carMap.entrySet()){
    System.out.println( carEntry.getKey() + "=" + carEntry.getValue() + " :Similar cars count");

}

    /*    Iterator<Car> iterator = carList.iterator();
        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getBrand().equals(KIA)){


            iterator.remove();

            } else {
                car.setOnSale(false);
            }
        }

        for (Car car : carList) {
            System.out.println(car);
        }*/

    }
}

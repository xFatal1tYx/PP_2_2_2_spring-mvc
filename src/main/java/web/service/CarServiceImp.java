package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    public CarServiceImp() {
        int CARS_COUNT = 0;
        cars.add(new Car(++CARS_COUNT, "BWM", "X5", 3.5f));
        cars.add(new Car(++CARS_COUNT, "Mazda", "RX7", 1.3f));
        cars.add(new Car(++CARS_COUNT, "Chevrolet", "Camaro", 5));
        cars.add(new Car(++CARS_COUNT, "Lada", "Granta", 1.6f));
        cars.add(new Car(++CARS_COUNT, "Bugatti", "Veyron", 8));
    }

    public List<Car> getCars(Optional<Integer> count) {
        if (count.isEmpty() || count.get() >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count.get()).collect(Collectors.toList());
        }
    }
}

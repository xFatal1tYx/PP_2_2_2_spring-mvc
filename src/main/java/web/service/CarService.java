package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CarService {
    public List<Car> cars = new ArrayList<>();
    public List<Car> getCars(Optional<Integer> count);
}

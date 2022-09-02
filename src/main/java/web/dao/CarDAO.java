package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CAR_COUNT = 0;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("model1", 1, "a111aa"));
        cars.add(new Car("model2", 2, "b222bb"));
        cars.add(new Car("model3", 3, "c333cc"));
        cars.add(new Car("model4", 4, "d444dd"));
        cars.add(new Car("model5", 5, "e555ee"));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) return cars;

        List<Car> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(cars.get(i));
        }
        return result;
    }
}

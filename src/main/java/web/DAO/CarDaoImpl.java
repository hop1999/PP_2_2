package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList = new ArrayList<>() {
        {
            add (new Car("5000$", "car1", "Yellow"));
            add (new Car("10000$", "car2", "Blue"));
            add (new Car("8999$", "car3", "Orange"));
            add (new Car("99999$", "ca4", "Rainbow"));
            add (new Car("8-800-555-35-35$", "car5", "Black"));
        }
    };

    @Override
    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();
    }
}
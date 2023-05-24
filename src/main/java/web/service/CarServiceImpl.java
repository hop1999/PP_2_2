package web.service;

import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.model.Car;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }
}
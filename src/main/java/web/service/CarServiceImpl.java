package web.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();


    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}


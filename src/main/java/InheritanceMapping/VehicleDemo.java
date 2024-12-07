package InheritanceMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VehicleDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Vehicle.class);
        cfg.addAnnotatedClass(Car.class);
        cfg.addAnnotatedClass(Bike.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction t = session.beginTransaction();

        // Create and save a Car
        Car car = new Car();
        car.setModel("Toyota Camry");
        car.setSeats(5);
        car.setFuelType("Petrol");

        // Create and save a Bike
        Bike bike = new Bike();
        bike.setModel("Honda CBR");
        bike.setType("Sport");
        bike.setEngineCapacity(1000);

        session.persist(car);
        session.persist(bike);

        t.commit();
        System.out.println("Vehicles saved successfully!");

        session.close();
        sf.close();
    }
}
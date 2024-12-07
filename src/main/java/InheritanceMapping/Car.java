package InheritanceMapping;

import jakarta.persistence.*;

@Entity
@Table(name = "CARS")
public class Car extends Vehicle {
    @Column(name = "seats")
    private int seats;
    
    @Column(name = "fuel_type", length = 50)
    private String fuelType;

    // Getters and setters
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
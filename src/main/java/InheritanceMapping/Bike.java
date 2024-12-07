package InheritanceMapping;

import jakarta.persistence.*;

@Entity
@Table(name = "BIKES")
public class Bike extends Vehicle {
    @Column(name = "type", length = 50)
    private String type;
    
    @Column(name = "engine_capacity")
    private int engineCapacity;

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
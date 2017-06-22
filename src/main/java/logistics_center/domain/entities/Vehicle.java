package logistics_center.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by neto on 21/06/17.
 */

@Entity(name = "vehicles")
public class Vehicle {

    @Id
    private Long id;

    public Vehicle () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package logistics_center.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by neto on 21/06/17.
 */

@Entity(name = "packages")
public class Package {

    @Id
    private Long id;

    private Double weight;

    public Package () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}

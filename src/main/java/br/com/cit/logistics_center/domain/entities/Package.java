package br.com.cit.logistics_center.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by neto on 21/06/17.
 */

/**
 * Package entity created on database.
 */
@Entity(name = "packages")
public class Package implements Cloneable {

    @Id
    private Long id;

    private Double weight;

    @Transient
    public int indexArray;

    public Package() {}

    @Override
    public Package clone() throws CloneNotSupportedException {
        return (Package) super.clone();
    }

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

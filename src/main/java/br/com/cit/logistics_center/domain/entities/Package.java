package br.com.cit.logistics_center.domain.entities;

import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;

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
@ApiObject(name = "Package", description = "Package of one delivery")
public class Package implements Cloneable {

    @Id
    @ApiObjectField(description = "Package identificator")
    private Long id;

    @ApiObjectField(description = "Weight of package")
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

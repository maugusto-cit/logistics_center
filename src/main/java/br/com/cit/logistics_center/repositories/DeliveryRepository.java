package br.com.cit.logistics_center.repositories;

import br.com.cit.logistics_center.domain.entities.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by neto on 21/06/17.
 */

/**
 * CRUD standard delivery repository
 */
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
}

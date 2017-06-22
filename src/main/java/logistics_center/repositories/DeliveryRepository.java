package logistics_center.repositories;

import logistics_center.domain.entities.Delivery;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by neto on 21/06/17.
 */
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
}

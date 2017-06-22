package logistics_center.repositories;

import logistics_center.domain.entities.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by neto on 21/06/17.
 */
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}

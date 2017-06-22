package logistics_center.controllers;

import logistics_center.domain.entities.Delivery;
import logistics_center.domain.wrappers.Step;
import logistics_center.repositories.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by neto on 21/06/17.
 */

@RestController
public class DeliveryController {

    @Autowired
    private DeliveryRepository repository;

    @RequestMapping(value = "/delivery", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity create(@RequestBody() Delivery delivery) {

        repository.save(delivery);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delivery/{deliveryId}/step", method = RequestMethod.GET)
    public List<Step> steps(@PathVariable("deliveryId") Long deliveryId) {

        //TODO: steps of delivery package. Implements logic and the steps.

        return null;
    }

}

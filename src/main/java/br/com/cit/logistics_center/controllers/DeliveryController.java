package br.com.cit.logistics_center.controllers;

import br.com.cit.logistics_center.domain.entities.Delivery;
import br.com.cit.logistics_center.domain.wrappers.Step;
import br.com.cit.logistics_center.repositories.DeliveryRepository;
import br.com.cit.logistics_center.utils.Zone;
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

        Zone zone = new Zone();
        List<Step> steps = null;
        Delivery delivery = repository.findOne(deliveryId);

        if (delivery != null)
            steps = zone.stepsDelivery(delivery.getPackages());

        return steps;
    }

}

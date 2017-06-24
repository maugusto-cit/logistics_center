package br.com.cit.logistics_center.controllers;

import br.com.cit.logistics_center.domain.entities.Delivery;
import br.com.cit.logistics_center.domain.entities.Package;
import br.com.cit.logistics_center.domain.exceptions.GenericExistsRecordException;
import br.com.cit.logistics_center.domain.exceptions.GenericNotFoundException;
import br.com.cit.logistics_center.domain.wrappers.Step;
import br.com.cit.logistics_center.repositories.DeliveryRepository;
import br.com.cit.logistics_center.repositories.PackageRepository;
import br.com.cit.logistics_center.utils.TransferZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neto on 21/06/17.
 */

/**
 * Listen the requisitions related a {@link Delivery} context.
 */
@RestController
public class DeliveryController {

    private final DeliveryRepository repository;
    private final PackageRepository packageRepository;

    @Autowired
    public DeliveryController(DeliveryRepository repository, PackageRepository packageRepository) {
        this.repository = repository;
        this.packageRepository = packageRepository;
    }

    /**
     * Resource to create an Delivery object. If you send one id was persisted, the method will return
     * a generic exception, depending on the object sended.
     *
     * @param delivery Delivery - Object that will be persisted.
     * @return ResponseEntity - HTTP Status.
     */
    @RequestMapping(value = "/delivery", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity create(@RequestBody() Delivery delivery) {

        Delivery existsDelivery = repository.findOne(delivery.getDeliveryId());

        if (existsDelivery == null) {

            List<Long> packagesId = new ArrayList<Long>();

            for (Package pack : delivery.getPackages())
                packagesId.add(pack.getId());

            Iterable<Package> existsPackages = packageRepository.findAll(packagesId);

            if (!existsPackages.iterator().hasNext())
                repository.save(delivery);
            else
                //TODO: The API, checks and sends to requester one Package. It should be a List of Package.
                throw new GenericExistsRecordException(existsPackages.iterator().next().getId(), Package.class);
        }
        else
            throw new GenericExistsRecordException(existsDelivery.getDeliveryId(), Delivery.class);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    /**
     * List all the packages steps to "Zona do caminhão", referenced with a delivery.
     *
     * @param deliveryId Long - Id of delivery
     * @return List<Step> - List with all packages steps.
     */
    @RequestMapping(value = "/delivery/{deliveryId}/step", method = RequestMethod.GET)
    public List<Step> steps(@PathVariable("deliveryId") Long deliveryId) {

        TransferZone transferZone = new TransferZone();
        List<Step> steps = null;
        Delivery delivery = repository.findOne(deliveryId);

        if (delivery != null)
            steps = transferZone.stepsDelivery(delivery.getPackages());
        else
            throw new GenericNotFoundException(deliveryId, Delivery.class);

        return steps;
    }

}

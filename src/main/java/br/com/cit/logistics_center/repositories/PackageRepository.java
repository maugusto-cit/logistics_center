package br.com.cit.logistics_center.repositories;

import br.com.cit.logistics_center.domain.entities.Package;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by neto on 21/06/17.
 */

/**
 * CRUD standard package repository
 */
public interface PackageRepository extends CrudRepository<Package, Long> {
}

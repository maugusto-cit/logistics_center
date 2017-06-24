package br.com.cit.logistics_center.domain.comparators;

import br.com.cit.logistics_center.domain.entities.Package;

import java.util.Comparator;

/**
 * Created by neto on 22/06/17.
 */

/**
 * Compare two packages
 */
public class ComparatorPackage implements Comparator<Package> {

    /**
     * Compares the weight of two packages.
     *
     * @param aPackage Package - First package.
     * @param bPackage Package - Second package.
     * @return int - Number to use on order method.
     */
    @Override
    public int compare(Package aPackage, Package bPackage) {

        double aWeight = aPackage.getWeight();
        double bWeight = bPackage.getWeight();

        if (aWeight < bWeight)
            return 1;
        else if (aWeight > bWeight)
            return -1;
        else
            return 0;
    }

}

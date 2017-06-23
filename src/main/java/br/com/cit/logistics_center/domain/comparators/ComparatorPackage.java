package br.com.cit.logistics_center.domain.comparators;

import br.com.cit.logistics_center.domain.entities.Package;

import java.util.Comparator;

/**
 * Created by neto on 22/06/17.
 */
public class ComparatorPackage implements Comparator<Package> {

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

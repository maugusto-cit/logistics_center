package br.com.cit.logistics_center.utils;

import br.com.cit.logistics_center.domain.comparators.ComparatorPackage;
import br.com.cit.logistics_center.domain.entities.Package;
import br.com.cit.logistics_center.domain.wrappers.Step;

import java.util.*;

/**
 * Created by neto on 22/06/17.
 */

/**
 * Responsible for the transfer of the packages between the zones.
 */
public class TransferZone {

    private List<Step> steps = new ArrayList<Step>();

    private Stack<Package> a, t, c;

    // Needs to create a ARRAY to handle with STACK object.
    private Package[] packagesOrdered;

    private int idStep = 1;

    /**
     * Start of hanoi solution
     *
     * @param packages List<Package> - Packets that will pass at the zones
     * @return List<Step> - List with all packages steps.
     */
    public List<Step> stepsDelivery(List<Package> packages) {

        // First step: Sort packages.
        this.packagesOrdered = new Package[packages.size()];
        packages.toArray(this.packagesOrdered);
        this.sortPackages();

        // Second step: create a STACK object;
        this.a = new Stack<Package>();
        this.t = new Stack<Package>();
        this.c = new Stack<Package>();

        // Third step: Put into STACK A "Zona de abastecimento" the packages ordered.
        a.addAll(Arrays.asList(this.packagesOrdered));

        // Fourth step: Call a recursive function with the hanoi logic implemented.
        recursiveSteps(this.packagesOrdered[0], this.a, this.c, this.t);

        return this.steps;
    }

    /**
     * Descending order of packages by weight
     */
    private void sortPackages() {

        ComparatorPackage comparator = new ComparatorPackage();
        Arrays.sort(this.packagesOrdered, comparator);

        this.indexList();
    }

    private void indexList() {

        int i = 0;
        for (Package packageIndex : this.packagesOrdered)
            packageIndex.indexArray = i++;
    }

    /**
     * Hanoi Algorithm
     */
    private void recursiveSteps(Package pack, Stack<Package> source, Stack<Package> destination, Stack<Package> aux) {

        if (pack.indexArray == this.packagesOrdered.length - 1) {
            destination.push(source.pop());
            this.steps.add(new Step(this.idStep++, pack.getId(), namedZone(source), namedZone(destination)));
        } else {
            recursiveSteps(this.packagesOrdered[pack.indexArray + 1], source, aux, destination);
            destination.push(source.pop());
            this.steps.add(new Step(this.idStep++, pack.getId(), namedZone(source),  namedZone(destination)));
            recursiveSteps(this.packagesOrdered[pack.indexArray + 1], aux, destination, source);
        }
    }

    /**
     * Describes a name of current zone.
     *
     * @param zone Stack<Package> - Current zone.
     * @return String - Name of the current zone.
     */
    private String namedZone(Stack<Package> zone) {

        if (zone.equals(this.a))
            return "Zona de abastecimento";
        else if (zone.equals(this.t))
            return "Zona de transferência";
        else if (zone.equals(this.c))
            return "Zona do caminhão";
        else
            return "";
    }

}

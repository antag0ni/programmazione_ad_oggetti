/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.developed.groupxx;
import it.unisa.diem.oop.provided.DeviceFilter;
import java.util.*;

/**
 *
 * @author antagoni
 */
public class DeviceStore {
    private String name;
    private Set<Device> store;
    
    public DeviceStore(String name) {
        this.name = name;
        store = new TreeSet<>();
    }
    
    public DeviceStore(String name, Comparator<Device> c) {
        this.name = name;
        if (c == null) {
            store = new TreeSet<>(c);
        } else {
            store = new TreeSet<>(c.thenComparing(Comparator.naturalOrder()));
        }
    }
    
    public DeviceStore filter(DeviceFilter d, Comparator<Device> c) {
        
        DeviceStore storeFiltered = new DeviceStore(name + " filtered", c);
        for (Device device : store) {
            if (d.checkDevice(device)) {
                storeFiltered.addDevice(device);
            }
        }
        return storeFiltered;
    }
    
    public void addDevice(Device d) {
        if (store.contains(d)) {
            throw new DeviceInsertionException();
        } else {
            store.add(d);
        }
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s contains %d items.%nPrinting:%n*****%n", name, store.size()));
        for (Device d : store) {
            sb.append(d.toString());
            sb.append("\n*****\n");
        }
        return sb.toString();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.developed.groupxx;
import java.util.*;

/**
 *
 * @author antagoni
 */
public class DeviceReleaseDateComparator implements Comparator<Device>{
    @Override
    public int compare(Device o1, Device o2) {
        int comp = o1.getReleaseDate().compareTo(o2.getReleaseDate());
        return (comp == 0) ? o1.getSerialNumber().compareToIgnoreCase(o2.getSerialNumber()) : comp;
    }
}

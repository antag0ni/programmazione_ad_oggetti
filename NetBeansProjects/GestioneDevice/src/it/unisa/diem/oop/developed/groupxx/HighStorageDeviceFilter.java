/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.developed.groupxx;
import it.unisa.diem.oop.provided.DeviceFilter;
/**
 *
 * @author antagoni
 */
public class HighStorageDeviceFilter implements DeviceFilter{
    private final int minSize;
    
    public HighStorageDeviceFilter(int minSize) {
        this.minSize = minSize;
    }
    
    @Override
    public boolean checkDevice(Device d) {
        if (d == null) return false;
        return d.getStorageCapacity() >= this.minSize;
    }
}

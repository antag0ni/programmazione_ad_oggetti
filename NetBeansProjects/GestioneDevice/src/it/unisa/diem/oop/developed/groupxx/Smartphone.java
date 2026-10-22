/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.developed.groupxx;

import it.unisa.diem.oop.provided.MobileCPUType;

/**
 *
 * @author antagoni
 */
public class Smartphone extends Device {
    
    private final MobileCPUType cpu;
    private final float screenSizeInch;

    public Smartphone(MobileCPUType cpu, float screenSizeInch, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.cpu = cpu;
        this.screenSizeInch = screenSizeInch;
    }
    
    public MobileCPUType getCpu() {
        return this.cpu;
    }
    
    public float getScreenSizeInch() {
        return this.screenSizeInch;
    }

    @Override
    public boolean hasTouchScreen() {
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Smartphone\n");
        sb.append(String.format("CPU= %s%n", this.getCpu().toString()));
        sb.append(String.format("screenSizeInch= %.1f%n", this.getScreenSizeInch()));
        return sb.toString();
    }
    
}

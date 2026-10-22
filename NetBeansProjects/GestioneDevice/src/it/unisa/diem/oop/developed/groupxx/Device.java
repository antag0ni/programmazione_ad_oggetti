/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.developed.groupxx;
import java.time.LocalDate;

/**
 *
 * @author antagoni
 */
public abstract class Device implements Comparable<Device>{
    private final String serialNumber;
    private final LocalDate releaseDate;
    private final int RAMsize;
    private final int storageCapacity;
    
    public Device(String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        this.serialNumber = serialNumber;
        this.releaseDate = LocalDate.of(year, month, dayOfMonth);
        this.RAMsize = RAMsize;
        this.storageCapacity = storageCapacity;
    }
    
    public String getSerialNumber() {
        return this.serialNumber;
    }
    
    public LocalDate getReleaseDate() {
        return this.releaseDate;
    }
    
    public int getRAMsize() {
        return this.RAMsize;
    }
    
    public int getStorageCapacity() {
        return this.storageCapacity;
    }
    
    public abstract boolean hasTouchScreen();
    
    @Override
    public int hashCode() {
        return (this.getSerialNumber() == null) ? 0 : this.getSerialNumber().toUpperCase().hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (this.getClass() != obj.getClass()) return false;
            
        Device d = (Device)obj;
        return this.getSerialNumber().equalsIgnoreCase(d.getSerialNumber());
    }
    
    @Override
    public final int compareTo(Device o) {
        return this.getSerialNumber().compareToIgnoreCase(o.getSerialNumber());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("serialNumber= %s%n", this.getSerialNumber()));
        sb.append(String.format("releaseDate= %s%n", this.getReleaseDate().toString()));
        sb.append(String.format("RAMsize= %dGB%n", this.getRAMsize()));
        sb.append(String.format("storageCapacity= %dGB%n", this.getStorageCapacity()));
        return sb.toString();
    }
}

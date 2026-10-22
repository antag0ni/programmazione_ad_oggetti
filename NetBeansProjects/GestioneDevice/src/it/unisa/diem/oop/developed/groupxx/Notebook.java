/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.developed.groupxx;
import it.unisa.diem.oop.provided.CPUType;
import it.unisa.diem.oop.provided.NBScreenType;
/**
 *
 * @author antagoni
 */
public class Notebook extends Device {
    
    private final CPUType type;
    private final NBScreenType screenType;
    private final boolean touchScreen;
    
    public Notebook(CPUType type, NBScreenType screenType, boolean touchScreen, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.type = type;
        this.screenType = screenType;
        this.touchScreen = touchScreen;
    }
    
    public Notebook(CPUType type, NBScreenType screenType, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        this(type, screenType, false, serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
    }
    
    public CPUType getType() {
        return this.type;
    }
    
    public NBScreenType getScreenType() {
        return this.screenType;
    }
   
    @Override
    public boolean hasTouchScreen() {
        return this.touchScreen;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Notebook\n");
        sb.append(super.toString());
        sb.append(String.format("CPU= %s%n", this.getType().toString()));
        sb.append(String.format("screenType= %s%n", this.getScreenType().toString()));
        if (this.hasTouchScreen())
            sb.append("touchScreen available%n");
        return sb.toString();
    }
    
}

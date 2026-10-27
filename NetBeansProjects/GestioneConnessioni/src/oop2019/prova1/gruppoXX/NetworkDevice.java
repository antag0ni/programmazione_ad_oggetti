/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2019.prova1.gruppoXX;

/**
 *
 * @author antagoni
 */
public abstract class NetworkDevice implements NetworkInterface {
    private static int nextAddress = 1;
    
    private final int address;
    private NetworkInterface connection;
    
    public NetworkDevice() {
        this.address = nextAddress++;
        this.connection = null;
    }
    
    public int getAddress() {
        return this.address;
    }
    
    @Override
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message) {
        
    }
}

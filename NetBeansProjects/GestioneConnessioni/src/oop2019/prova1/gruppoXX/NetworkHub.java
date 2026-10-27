/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2019.prova1.gruppoXX;

import java.util.Objects;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author antagoni
 */
public class NetworkHub implements NetworkInterface {

    private final String id;
    private final Set<NetworkInterface> connections;
    
    public NetworkHub(String id) {
        this.id = id;
        this.connections = new LinkedHashSet<>();
    }
    
    public String getId() {
        return this.id;
    }
    
    @Override
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message) {
        System.out.println(String.format("Hub %s: da %d via %s per %d: %s", getId(), sourceAddress, sourceInterface, destAddress, message));
        for (NetworkInterface i : this.connections) {
            if (!i.equals(sourceInterface)) {
                i.accept(this, sourceAddress, destAddress, message);
            }
        }
    }

    @Override
    public void connect(NetworkInterface other) {
        if (other != null && !other.equals(this)) { 
            this.connections.add(other);
        }
    }
    
    
    public void printConnections() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Connessioni di: Hub %s%n", getId()));
        for (NetworkInterface i : connections) {
            sb.append(i);
        }
        System.out.println(sb);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        
        NetworkHub h = (NetworkHub)o;
        return Objects.equals(this.getId(), h.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getId());
    }

    @Override
    public String toString() {
        return "Hub " + getId();
    }
}

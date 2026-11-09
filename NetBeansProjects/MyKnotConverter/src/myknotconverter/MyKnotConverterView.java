package myknotconverter;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antagoni
 */
public class MyKnotConverterView {
    private HBox root;
    
    private TextField input;
    private Label symbols;
    private Label display;
    private Button reset;
    
    public MyKnotConverterView() {
        root = new HBox();
        
        input = new TextField();
        symbols = new Label();
        display = new Label();
        reset = new Button();
        
        initComponents();
    }
    
    private void initComponents() {
        symbols.setText("km/h ---> kts");
        reset.setText("C");
        root.getChildren().addAll(input, symbols, display, reset);
        root.setSpacing(15);
        root.setAlignment(Pos.CENTER);
    }
    
    public Parent getRoot() {
        return this.root;
    }
    
    public StringProperty inputTextProperty() {
        return input.textProperty();
    }
    
    public StringProperty displayTextProperty() {
        return display.textProperty();
    }
    
    public void setResetAction(EventHandler<ActionEvent> e) {
        reset.setOnAction(e);
    }
    
}

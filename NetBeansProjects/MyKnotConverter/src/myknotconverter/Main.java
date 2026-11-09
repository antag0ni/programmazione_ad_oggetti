/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myknotconverter;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;

/**
 *
 * @author antagoni
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        /*
        
        TextField input = new TextField();
        
        Label symbols = new Label();
        symbols.setText("km/h ---> kts");
        
        input.setPrefColumnCount(7);
        
        Label display = new Label();
        
        Button reset = new Button();
        reset.setText("C");
        
        HBox root = new HBox();
        
        root.setSpacing(15);
        root.setAlignment(Pos.CENTER);
        
        root.getChildren().addAll(input, symbols, display, reset);
        
        // -------------------------------------------------------
        // BINDING
        // -------------------------------------------------------
        DoubleProperty inputValue = new SimpleDoubleProperty();
        
        StringConverter dsc = new DoubleStringConverter();
        
        Bindings.bindBidirectional(input.textProperty(), inputValue, dsc);
        
        NumberBinding output = inputValue.divide(1.852);
        
        display.textProperty().bind(output.asString("%.2f"));
        // -------------------------------------------------------
        
        reset.setOnAction(e -> {
            inputValue.set(0);
        });
        
        */
        
        MyKnotConverterView view = new MyKnotConverterView();
        new MyKnotConverterController(view);
        Scene scene = new Scene(view.getRoot(), 400, 300);
        
        primaryStage.setTitle("MyKnotConverter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

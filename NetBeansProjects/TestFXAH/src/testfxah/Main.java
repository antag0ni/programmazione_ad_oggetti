/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfxah;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author antagoni
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Inizializzazione elementi grafici
        Label lbl = new Label();
        
        TextField tfd = new TextField();
        
        Button btn = new Button();
        btn.setText("Cliccami!");
        
        btn.setOnAction ( e -> {
            lbl.textProperty().unbind();
            // handleClick(e); funzione da implementare per facilitare la gestione dei click
            // lbl.setText(tfd.getText());
            lbl.setText("Hello World!");
            System.out.println(e);
            // lbl.textProperty().bind(tfd.textProperty());
        });
        
        lbl.textProperty().bind(tfd.textProperty());
        
        // Azione del pulsante
        /*
        btn.setOnAction(new EventHandler<ActionEvent>() {
            // Classe anonima
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        */
        
        // Nodo
        // StackPane root = new StackPane();
        
        VBox root = new VBox();
        
        root.addEventFilter(MouseEvent.MOUSE_RELEASED, e -> {
            if (tfd.getText().isEmpty()) {
                e.consume();
            }
        });
        
        // Allineamento
        root.setAlignment(Pos.CENTER);
        // Spazio tra elementi
        root.setSpacing(20);
        // Spaziatura
        root.setPadding(new Insets(40));
        
        // Aggiungo il bottone
        // root.getChildren().add(btn);
        
        // Aggiungo tutti gli elementi
        root.getChildren().addAll(lbl, tfd, btn);
        
        // Inizializzo la finestra
        Scene scene = new Scene(root, 500, 300);
        
        primaryStage.setTitle("My JavaFX App");
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

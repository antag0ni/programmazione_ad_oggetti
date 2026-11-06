/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputconfirmgui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author antagoni
 */
public class MainGrid extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Inizializzazione elementi grafici
        Label lblInput = new Label();
        lblInput.setText("Input:");
        
        Label lblConfirm = new Label();
        lblConfirm.setText("Confirm Input:");
        
        TextField tfdInput = new TextField();
        TextField tfdConfirm = new TextField();
        
        Button btn = new Button();
        btn.setText("Ok");
       
        GridPane root = new GridPane();
        
        // Allineamento
        root.setAlignment(Pos.CENTER);
        root.setHgap(10); // Spazio orizzontale tra colonne
        root.setVgap(15); // Spazio verticale tra righe

        root.setPadding(new Insets(40));
        BooleanBinding ex = Bindings.or(tfdConfirm.textProperty().isEmpty(), tfdInput.textProperty().isNotEqualTo(tfdConfirm.textProperty()));
        btn.disableProperty().bind(ex);
        
        btn.setOnAction(event -> buttonAction());
        
        /*
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                buttonAction();
            }
        });
        */
       
        // Posizionamento diretto degli elementi nella griglia: add(Node, colonna, riga)
        root.add(lblInput, 0, 0);
        root.add(tfdInput, 1, 0);
        
        root.add(lblConfirm, 0, 1);
        root.add(tfdConfirm, 1, 1);
        
        // add(nodo, colonna, riga, colspan, rowspan)
        root.add(btn, 1, 2);
      
        GridPane.setHalignment(btn, HPos.LEFT);
        
        // Inizializzo la finestra
        Scene scene = new Scene(root, 500, 300);
        
        primaryStage.setTitle("MyInputConfirm");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void buttonAction() {
            System.out.println("Input confirmed!");
            Stage newWindow = new Stage();
            newWindow.setTitle("Confirmation");
            
            // Rendiamo la finestra modale (bloccante)
            newWindow.initModality(Modality.APPLICATION_MODAL);
            
            Label message = new Label("input confirmed!");
            StackPane secondaryLayout = new StackPane(message);
            secondaryLayout.setPadding(new Insets(20));
            
            Scene secondScene = new Scene(secondaryLayout, 250, 150);
            newWindow.setScene(secondScene);
            newWindow.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
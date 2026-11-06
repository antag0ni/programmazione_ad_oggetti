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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author antagoni
 */
public class Main extends Application {
    
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
        btn.setText("OK");
       
        VBox root = new VBox();
        HBox row1 = new HBox(10);
        HBox row2 = new HBox(10);
        
        // Allineamento
        root.setAlignment(Pos.CENTER);
        row1.setAlignment(Pos.CENTER);
        row2.setAlignment(Pos.CENTER);
        
        // Spazio tra elementi
        root.setSpacing(20);
        
        // Spaziatura
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
       
        root.getChildren().addAll(row1, row2, btn);
        row1.getChildren().addAll(lblInput, tfdInput);
        row2.getChildren().addAll(lblConfirm, tfdConfirm);
        
        // Inizializzo la finestra
        Scene scene = new Scene(root, 500, 300);
        
        primaryStage.setTitle("MyInputConfirm");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void buttonAction() {
            System.out.println("Input confirmed!");
            Stage newWindow = new Stage();
            newWindow.setTitle("Condirmation");
            
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
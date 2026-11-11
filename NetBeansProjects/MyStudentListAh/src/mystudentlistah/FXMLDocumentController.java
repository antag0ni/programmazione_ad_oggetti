/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystudentlistah;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author antagoni
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private MenuItem saveButton;
    @FXML
    private TextField nameField;
    @FXML
    private TextField surnameField;
    @FXML
    private TextField codeField;
    @FXML
    private Button addButton;
    @FXML
    private Button removeButton;
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> nameClm;
    @FXML
    private TableColumn<Student, String> surnameClm;
    @FXML
    private TableColumn<Student, String> codeClm;
    
    private ObservableList<Student> studentList;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        studentList = FXCollections.observableArrayList();
        
        studentTable.setItems(studentList);
        
        // Gestione delle colonne
        nameClm.setCellValueFactory(r -> new SimpleStringProperty(r.getValue().getName()));
        surnameClm.setCellValueFactory(new PropertyValueFactory("surname"));
        codeClm.setCellValueFactory(new PropertyValueFactory("code"));
        
    }    

    @FXML
    private void openFile(ActionEvent event) {
    }

    @FXML
    private void saveFile(ActionEvent event) {
    }

    @FXML
    private void quitApp(ActionEvent event) {
    }

    @FXML
    private void addStudent(ActionEvent event) {
        studentList.add(new Student(nameField.getText(), surnameField.getText(), codeField.getText()));
        System.out.println(studentList);
        
    }

    @FXML
    private void removeStudent(ActionEvent event) {
            Student s = studentTable.getSelectionModel().getSelectedItem();
            
            studentList.remove(s);
    }
    
}

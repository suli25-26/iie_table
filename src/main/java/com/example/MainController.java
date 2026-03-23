package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {

    @FXML
    private TableColumn<Employee, String> cityCol;

    @FXML
    private TableView<Employee> empTable;

    @FXML
    private TableColumn<Employee, Integer> idCol;

    @FXML
    private TableColumn<Employee, String> nameCol;

    @FXML
    private TableColumn<Employee, Integer> salaryCol;


    @FXML
    private TextField idField;
    
    @FXML
    private TextField nameField;

    @FXML
    private TextField cityField;
        
    @FXML
    private TextField salaryField; 


    @FXML
    void initialize() {
        this.idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        this.cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));
        this.salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));

        this.empTable.getItems().add(
            new Employee(1, "Erős István", "Szeged", 395));
    }


    @FXML
    void onClickAddButton(ActionEvent event) {
        System.out.println("Hozzáadás...");
         this.empTable.getItems().add(
            new Employee(
                Integer.parseInt(idField.getText()), 
                nameField.getText(), 
                cityField.getText(), 
                Integer.parseInt(salaryField.getText())
            ));
        resetFields();
    }

    private void resetFields() {
        idField.clear();
        nameField.clear();
        cityField.clear();
        salaryField.clear();
    }

}

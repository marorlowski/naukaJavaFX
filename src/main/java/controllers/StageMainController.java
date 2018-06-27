package controllers;

import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.control.Button;

public class StageMainController {

    @FXML
    private Button gen;
    
    public StageMainController(){
        System.out.println("StageMainController START");
    }
    
    //Inicjalizacja FXML
    @FXML
    void initialize(){
        gen.setText("Generuj Raport");
    }

    @FXML

    public void onActionGen(ActionEvent e){
        e.getSource();
        System.out.println("onActionGen START ");

    }

}

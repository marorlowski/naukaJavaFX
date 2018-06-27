package controllers;

import javafx.fxml.FXML;
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
        gen.setText("aaaaaaaaaaaa");
    }
}

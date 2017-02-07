/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author robiesun
 */
public class MainScheduleController implements Initializable {

    @FXML
    private TextField textFieldName;
    @FXML
    private TextField textFieldID;
    @FXML
    private TextField textFieldEmail;
    @FXML
    private TableView<?> scheduleTableView;
    @FXML
    private TextField textFieldDate;
    @FXML
    private Button previousBtn;
    @FXML
    private Button nextBtn;
    @FXML
    private Button weekBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logOutBtnAction(ActionEvent event) {
    }

    @FXML
    private void previousBtn(ActionEvent event) {
    }

    @FXML
    private void nextBtn(ActionEvent event) {
    }

    @FXML
    private void weekBtnAction(ActionEvent event) {
    }
    
}

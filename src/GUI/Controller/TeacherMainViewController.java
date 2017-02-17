/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableView;

/**
 * FXML Controller class
 *
 * @author robiesun
 */
public class TeacherMainViewController implements Initializable {

    @FXML
    private TableView<?> studentTableView;
    @FXML
    private TableView<?> studentAbsenceTableVIew;
    @FXML
    private TextField summaryTextField;
    @FXML
    private TextField attendanceTextField;
    @FXML
    private TextField classTextField;
    @FXML
    private TextField dateTextField;
    @FXML
    private TreeTableView<?> ScheduleTableView;
    @FXML
    private Button nextClassBtn;
    @FXML
    private Button previousClassBtn;
    @FXML
    private Button previousDateBtn;
    @FXML
    private Button nextDateBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

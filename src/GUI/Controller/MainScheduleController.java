/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author robiesun
 */
public class MainScheduleController implements Initializable {

  
 
    @FXML
    private Button summaryBtn;
    @FXML
    private Label labelMonday;
    @FXML
    private Label labelTuesday;
    @FXML
    private Label labelWednesday;
    @FXML
    private Label labelThursday;
    @FXML
    private Label labelFriday;
    @FXML
    private Label labelSubjects;
    @FXML
    private Label labelTime;
    @FXML
    private Button previousBtn;
    @FXML
    private Button nextBtn;
    @FXML
    private TextField weekTextField;
    @FXML
    private TextField dateTextField;
    @FXML
    private Button logOutBtn;
    @FXML
    private Label LblName;
    @FXML
    private Label LblId;
    @FXML
    private Label lblEmail;
  

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LblName.setText("Robie");
        LblId.setText("1");
        lblEmail.setText("Robie@hotmail.com");
        
    }    

    @FXML
    private void logOutBtnAction(ActionEvent event) {
        
        if (event.getSource() == logOutBtn)
            {
                Stage stage = null;
                Parent root = null;
                

                //get reference to the button's stage  
                stage = (Stage) logOutBtn.getScene().getWindow();

                //load up OTHER FXML document
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GUI/View/LogInView.fxml"));
                try
                {
                    root = fxmlLoader.load();
                } catch (IOException ex)
                {
                    Logger.getLogger(LogInController.class.getName()).log(Level.SEVERE, null, ex);
                }

                //create a new scene with root and set the stage
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                
        }
          
    }


    @FXML
    private void summaryBtnAction(ActionEvent event) {
        
         if (event.getSource() == summaryBtn)
            {
                Stage stage = null;
                Parent root = null;
                

                //get reference to the button's stage  
                stage = (Stage) summaryBtn.getScene().getWindow();

                //load up OTHER FXML document
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GUI/View/StudentAttendanceChart.fxml"));
                try
                {
                    root = fxmlLoader.load();
                } catch (IOException ex)
                {
                    Logger.getLogger(LogInController.class.getName()).log(Level.SEVERE, null, ex);
                }

                //create a new scene with root and set the stage
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
        }
    }
    
}

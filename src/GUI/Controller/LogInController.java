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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author robiesun
 */
public class LogInController implements Initializable {

    @FXML
    private TextField studentId;
    
    @FXML
    private Button logIn;
    @FXML
    private PasswordField passwordField;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButton(ActionEvent event) {
        
        String username = studentId.getText();
        String pass = passwordField.getText();
        // test
        if(username.equals("123456")&& pass.equals("robiesun"));
        {
             Stage stage = null;
            Parent root = null;

            if (event.getSource() == logIn)
            {

                //get reference to the button's stage  
                stage = (Stage) logIn.getScene().getWindow();

                //load up OTHER FXML document
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GUI/View/MainSchedule.fxml"));
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
}

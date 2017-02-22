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
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author robiesun
 */
public class StudentAttendanceChartController implements Initializable {

    @FXML
    private AnchorPane topPane;
    @FXML
    private AnchorPane bottomPane;
    @FXML
    private Button CurrentMonthBtn;
    @FXML
    private Button SemesterBtn;
    @FXML
    private Button LastTwoMonthsBtn;

   
    private final CategoryAxis xAxis = new CategoryAxis();
    private final NumberAxis yAxis = new NumberAxis();
    private final StackedBarChart<String, Number> attendanceChart = new StackedBarChart<>(xAxis,yAxis);
    private final XYChart.Series<String, Number> present = new XYChart.Series<>();
    private final XYChart.Series<String, Number> absent = new XYChart.Series<>();
    @FXML
    private Label LblMostAbsOn;
    @FXML
    private Label LblAbsSum;
    @FXML
    private Label LblTotalAbs;
    @FXML
    private Label LblStudent;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
          bottomPane.getChildren().add(attendanceChart);
    }    

    @FXML
    private void handleShowMonthAttendance(ActionEvent event) {
        
          
        present.getData().add(new XYChart.Data("mon", 2));
        present.getData().add(new XYChart.Data("tues", 3));
        present.getData().add(new XYChart.Data("wed", 4));
        present.getData().add(new XYChart.Data("thur", 4));
        present.getData().add(new XYChart.Data("fri", 3));
        absent.getData().add(new XYChart.Data("mon", 3));
        absent.getData().add(new XYChart.Data("tues", 2));
        absent.getData().add(new XYChart.Data("wed", 1));
        absent.getData().add(new XYChart.Data("thur", 1));
        absent.getData().add(new XYChart.Data("fri", 2));
        
        present.setName("present");
        absent.setName("absent");
        
        attendanceChart.getData().add(present);
        attendanceChart.getData().add(absent);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casio.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author rian
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField displyFild;
    double number1 , number2;
    String operation;
    String save = "0";
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleOneClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        String newText = oldText + "1";
        if(!oldText.equals("0")){
        displyFild.setText(newText);
        }
        else displyFild.setText("1");
    }

    @FXML
    private void handleTwoClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        String newText = oldText + "2";
        if(!oldText.equals("0")){
        displyFild.setText(newText);
        }
        else displyFild.setText("2");
    }

    @FXML
    private void handleThreeClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        String newText = oldText + "3";
        if(!oldText.equals("0")){
        displyFild.setText(newText);
        }
        else displyFild.setText("3");
    }

    @FXML
    private void handleFourClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        String newText = oldText + "4";
        if(!oldText.equals("0")){
        displyFild.setText(newText);
        }
        else displyFild.setText("4");
    }

    @FXML
    private void handleFiveClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        String newText = oldText + "5";
        if(!oldText.equals("0")){
        displyFild.setText(newText);
        }
        else displyFild.setText("5");
    }

    @FXML
    private void handleSixClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        String newText = oldText + "6";
        if(!oldText.equals("0")){
        displyFild.setText(newText);
        }
        else displyFild.setText("6");
    }

    @FXML
    private void handleSevenClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        String newText = oldText + "7";
        if(!oldText.equals("0")){
        displyFild.setText(newText);
        }
        else displyFild.setText("7");
    }

    @FXML
    private void handleEightClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        String newText = oldText + "8";
        if(!oldText.equals("0")){
        displyFild.setText(newText);
        }
        else displyFild.setText("8");
    }

    @FXML
    private void handleNineClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        String newText = oldText + "9";
        if(!oldText.equals("0")){
        displyFild.setText(newText);
        }
        else displyFild.setText("9");
    }

    @FXML
    private void handleZeroClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        if(!oldText.equals("0")){
        String newText = oldText + "0";
        displyFild.setText(newText);
        }
    }

    @FXML
    private void handleCancleAction(ActionEvent event) {
        String oldText = displyFild.getText();
        /*int cur = Integer.parseInt(oldText);
        cur /= 10;
        displyFild.setText("" + cur);*/
        //StringBuilder build = new StringBuilder(oldText);
        int len = oldText.length();
        //oldText.charAt(len) = null;
        String newText = "";
        for(int i=0; i<len-1 ; i++){
            newText = newText + oldText.charAt(i);
        }
        //build.deleteCharAt();
        displyFild.setText(newText);
    }

    @FXML
    private void handleDivisionOperation(ActionEvent event) {
        String oldText = displyFild.getText();
        number1 = Double.parseDouble(oldText);
        operation = "DIVISION";
        displyFild.setText("");
    }

    @FXML
    private void handleMultiplicationOperator(ActionEvent event) {
        String oldText = displyFild.getText();
        number1 = Double.parseDouble(oldText);
        operation = "MULTIPLICATION";
        displyFild.setText("");
    }

    @FXML
    private void handleAdditionOperation(ActionEvent event) {
        String oldText = displyFild.getText();
        number1 = Double.parseDouble(oldText);
        operation = "ADDITION";
        displyFild.setText("");
    }

    @FXML
    private void handlePointClickAction(ActionEvent event) {
        String oldText = displyFild.getText();
        /*int len = oldText.length();
        Boolean check = false;
        for(int i=0; i<len; i++){
            if(oldText.charAt(i) == '.') check = true;
        }*/
        
        if(!oldText.contains(".")){
            String newText = oldText + ".";
            displyFild.setText(newText);
        }
        
        
    }

    @FXML
    private void handleEqualsOperation(ActionEvent event) {
        String newText = displyFild.getText();
        number2 = Double.parseDouble(newText);
        double result = 0.0;
        if(operation == "ADDITION"){
            result = number1 + number2;
            displyFild.setText("" + result);
        }
        else if(operation == "SUBTRUCTION"){
            result = number1 - number2;
            displyFild.setText("" + result);           
        }
        else if(operation == "MULTIPLICATION"){
            result = number1 * number2;
            displyFild.setText("" + result);           
        }
        else if(operation == "DIVISION"){
            result = number1 / number2;
            displyFild.setText("" + result);           
        }
    }

    @FXML
    private void handleSubtructionOperator(ActionEvent event) {
        String oldText = displyFild.getText();
        number1 = Double.parseDouble(oldText);
        operation = "SUBTRUCTION";
        displyFild.setText("");
    }

    @FXML
    private void handleAllCancleAction(ActionEvent event) {
        displyFild.setText("");
        save = "0";
    }

    @FXML
    private void handleMemoryShowClickAction(ActionEvent event) {
        displyFild.setText(save);
        save = "0";
    }

    @FXML
    private void handleMemorySaveClickAction(ActionEvent event) {
        save = displyFild.getText();
    }
}

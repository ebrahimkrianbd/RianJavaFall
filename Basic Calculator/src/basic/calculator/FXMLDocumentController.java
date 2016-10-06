/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlendMode;

/**
 *
 * @author students
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField DesplyField;

    double number1, number2;
    String operation;
    String save = "0";
    boolean operationPending = true;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleEightAction(ActionEvent event) {
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
            
        String oldText = DesplyField.getText();
        String newText = oldText + "8";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("8");
        }
    }

    @FXML
    private void handleNineAction(ActionEvent event) {
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
            
        String oldText = DesplyField.getText();
        String newText = oldText + "9";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("9");
        }
    }

    @FXML
    private void handleDivisionAction(ActionEvent event) {
        String oldText = DesplyField.getText();
        number1 = Double.parseDouble(oldText);
        operation = "Division";
        DesplyField.setText("");
    }

    @FXML
    private void handleAllDeleteAction(ActionEvent event) {
        DesplyField.setBlendMode(BlendMode.SRC_OVER);
        DesplyField.setText("");
    }

    @FXML
    private void handleClearAction(ActionEvent event) {
        String oldText = DesplyField.getText();
        String newText = null;
        int len = oldText.length();
        
        if(len > 0){
        newText = oldText.substring(0, len-1);
        DesplyField.setText(newText);
        }

        /*String newText = "";
        for (int i = 0; i < len - 1; i++) {
            newText = newText + oldText.charAt(i);
        }
        DesplyField.setText(newText);*/
    }

    @FXML
    private void handleFiveAction(ActionEvent event) {
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
            
        String oldText = DesplyField.getText();
        String newText = oldText + "5";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("5");
        }
    }

    @FXML
    private void handleSixAction(ActionEvent event) {
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
            
        String oldText = DesplyField.getText();
        String newText = oldText + "6";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("6");
        }
    }

    @FXML
    private void handleMultiplyAction(ActionEvent event) {
        String oldText = DesplyField.getText();
        number1 = Double.parseDouble(oldText);
        operation = "Multiply";
        DesplyField.setText("");
    }
    
    @FXML
    private void handleTwoAction(ActionEvent event) {
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
          
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
            
        String oldText = DesplyField.getText();
        String newText = oldText + "2";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("2");
        }
    }

    @FXML
    private void handleThreeAction(ActionEvent event) { 
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
            
        String oldText = DesplyField.getText();
        String newText = oldText + "3";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("3");
        }
    }

    @FXML
    private void handleSubtructAction(ActionEvent event) {
        String oldText = DesplyField.getText();
        number1 = Double.parseDouble(oldText);
        operation = "Subruct";
        DesplyField.setText("");

    }

    @FXML
    private void handleXSqrAction(ActionEvent event) {
        String oldText = DesplyField.getText();
        double data = Double.parseDouble(oldText);
        double sqr = data * data;

        DesplyField.setText("" + sqr);

    }

    @FXML
    private void handleRootAction(ActionEvent event) {
        String oldText = DesplyField.getText();
        double data = Double.parseDouble(oldText);
        double sqrt = Math.sqrt(data);

        DesplyField.setText("" + sqrt);
    }

    @FXML
    private void handleSevenAction(ActionEvent event) {
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
            
        String oldText = DesplyField.getText();
        String newText = oldText + "7";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("7");
        }
    }

    @FXML
    private void handlePointAction(ActionEvent event) {
        String oldText = DesplyField.getText();
        if (!oldText.contains(".")) {
            String newText = oldText + ".";
            DesplyField.setText(newText);
        }
    }

    @FXML
    private void handlePersendAction(ActionEvent event) {
    }

    @FXML
    private void handleEqualAction(ActionEvent event) {
        String newText = DesplyField.getText();
        number2 = Double.parseDouble(newText);
        double result = 0.0;
        if (operation == "Add") {
            result = number1 + number2;
            DesplyField.setText("" + result);
            operationPending = false;
        } else if (operation == "Subruct") {
            result = number1 - number2;
            DesplyField.setText("" + result);
            operationPending = false;
        } else if (operation == "Multiply") {
            result = number1 * number2;
            DesplyField.setText("" + result);
            operationPending = false;
        } else if (operation == "Division") {
            
            if(number2 != 0){
            result = number1 / number2;
            DesplyField.setText("" + result);
            operationPending = false;
            }else{
                DesplyField.setBlendMode(BlendMode.RED);
                DesplyField.setText("Math Error! click " +"AC" +" and continue.");
            }
        }
    }

    @FXML
    private void handleFourAction(ActionEvent event) {
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
            
        String oldText = DesplyField.getText();
        String newText = oldText + "4";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("4");
        }
    }

    @FXML
    private void handleOneAction(ActionEvent event) {
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
          
        String oldText = DesplyField.getText();
        String newText = oldText + "1";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("1");
        }
    }

    @FXML
    private void handleZeroAction(ActionEvent event) {
        if(!operationPending){
            DesplyField.setText("");
            operationPending =true;
        }
          
        String oldText = DesplyField.getText();
        if (!oldText.equals("0")) {
            String newText = oldText + "0";
            DesplyField.setText(newText);
        }
    }

    @FXML
    private void handleAddAction(ActionEvent event) {
        String oldText = DesplyField.getText();
        number1 = Double.parseDouble(oldText);
        operation = "Add";
        DesplyField.setText("");
    }

    @FXML
    private void handleMemoriReturnAction(ActionEvent event) {
        DesplyField.setText(save);
    }

    @FXML
    private void handleMemoriSaveAction(ActionEvent event) {
        save = "0";
        String oldText = DesplyField.getText();
        save = oldText;
    }

    @FXML
    private void handleMemoriClearAction(ActionEvent event) {
        save = "";
    }

}

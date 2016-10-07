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
    
    String oldText = "";
    String newText = "";

    double number1, number2;
    String operation = "";
    String save = "0";
    boolean resultUpdated = true;
    boolean operationPending = true;
    boolean mathError = true;
    boolean number1bool = false;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleEightAction(ActionEvent event) {
        if(mathError){
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
            
        oldText = DesplyField.getText();
        newText = oldText + "8";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("8");
        }
        }
    }

    @FXML
    private void handleNineAction(ActionEvent event) {
        if(mathError){
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
            
        oldText = DesplyField.getText();
        newText = oldText + "9";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("9");
        }
        }
    }

    @FXML
    private void handleDivisionAction(ActionEvent event) {
        if(mathError){
        oldText = DesplyField.getText();
        
        if(!operation.equals("") && number1bool && !oldText.equals("")){
            
        number2 = Double.parseDouble(oldText);
        if (operation == "Add") {
            number1 += number2;
            DesplyField.setText("");
            operation = "Division";
            number1bool = true;
        } else if (operation == "Subruct") {
            number1 -= number2;
            DesplyField.setText("");
            operation = "Division";
            number1bool = true;
        } else if (operation == "Multiply") {
            number1 *= number2;
            DesplyField.setText("");
            operation = "Division";
            number1bool = true;
        } else if (operation == "Division") {
            
            if(number2 != 0){
            number1 /= number2;
            DesplyField.setText("");
            operation = "Division";
            number1bool = true;
            }else{
                DesplyField.setBlendMode(BlendMode.RED);
                DesplyField.setText("Math Error! click " +"AC" +" and continue.");
                mathError = false;
                number1bool = false;
            }
        }
            
        }
        else{
            
        operation = "Division";
        
        if(!oldText.equals("")){
        number1 = Double.parseDouble(oldText);
        DesplyField.setText("");
        number1bool = true;
        }
        }
        }
    }

    @FXML
    private void handleAllDeleteAction(ActionEvent event) {
        DesplyField.setBlendMode(BlendMode.SRC_OVER);
        DesplyField.setText("");
        mathError = true;
    }

    @FXML
    private void handleClearAction(ActionEvent event) {
        if(mathError){
        oldText = DesplyField.getText();
        newText = null;
        int len = oldText.length();
        
        if(len > 0){
        newText = oldText.substring(0, len-1);
        DesplyField.setText(newText);
        }
        }

        /*newText = "";
        for (int i = 0; i < len - 1; i++) {
            newText = newText + oldText.charAt(i);
        }
        DesplyField.setText(newText);*/
    }

    @FXML
    private void handleFiveAction(ActionEvent event) {
        if(mathError){
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
            
        oldText = DesplyField.getText();
        newText = oldText + "5";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("5");
        }
        }
    }

    @FXML
    private void handleSixAction(ActionEvent event) {
        if(mathError){
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
            
        oldText = DesplyField.getText();
        newText = oldText + "6";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("6");
        }
        }
    }

    @FXML
    private void handleMultiplyAction(ActionEvent event) {
        if(mathError){
        oldText = DesplyField.getText();
        
        if(!operation.equals("") && number1bool && !oldText.equals("")){
            
        number2 = Double.parseDouble(oldText);
        if (operation == "Add") {
            number1 += number2;
            DesplyField.setText("");
            operation = "Multiply";
            number1bool = true;
        } else if (operation == "Subruct") {
            number1 -= number2;
            DesplyField.setText("");
            operation = "Multiply";
            number1bool = true;
        } else if (operation == "Multiply") {
            number1 *= number2;
            DesplyField.setText("");
            operation = "Multiply";
            number1bool = true;
        } else if (operation == "Division") {
            
            if(number2 != 0){
            number1 /= number2;
            DesplyField.setText("");
            operation = "Multiply";
            number1bool = true;
            }else{
                DesplyField.setBlendMode(BlendMode.RED);
                DesplyField.setText("Math Error! click " +"AC" +" and continue.");
                mathError = false;
                number1bool = false;
            }
        }
            
        }
        else{
            
        operation = "Multiply";
        
        if(!oldText.equals("")){
        number1 = Double.parseDouble(oldText);
        DesplyField.setText("");
        number1bool = true;
        }
        }
        }
    }
    
    @FXML
    private void handleTwoAction(ActionEvent event) {
        if(mathError){
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
          
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
            
        oldText = DesplyField.getText();
        newText = oldText + "2";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("2");
        }
        }
    }

    @FXML
    private void handleThreeAction(ActionEvent event) {
        if(mathError){
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
            
        oldText = DesplyField.getText();
        newText = oldText + "3";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("3");
        }
        }
    }

    @FXML
    private void handleSubtructAction(ActionEvent event) {
        operation = "Subruct";
        
        if(mathError){
        oldText = DesplyField.getText();
        
        if(!oldText.equals("")){
        number1 = Double.parseDouble(oldText);
        DesplyField.setText("");
        number1bool = true;
        }
        }

    }

    @FXML
    private void handleXSqrAction(ActionEvent event) {
        if(mathError){
        oldText = DesplyField.getText();
        
        if(!oldText.equals("")){
        double data = Double.parseDouble(oldText);
        double sqr = data * data;

        DesplyField.setText("" + sqr);
        }
        }
    }

    @FXML
    private void handleRootAction(ActionEvent event) {
        if(mathError){
        oldText = DesplyField.getText();
        
        if(!oldText.equals("")){
        double data = Double.parseDouble(oldText);
        double sqrt = Math.sqrt(data);

        DesplyField.setText("" + sqrt);
        }
        }
    }

    @FXML
    private void handleSevenAction(ActionEvent event) {
        if(mathError){
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
            
        oldText = DesplyField.getText();
        newText = oldText + "7";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("7");
        }
        }
    }

    @FXML
    private void handlePointAction(ActionEvent event) {
        if(mathError){
        oldText = DesplyField.getText();
        if (!oldText.contains(".")) {
            newText = oldText + ".";
            DesplyField.setText(newText);
        }
        }
    }

    @FXML
    private void handlePersendAction(ActionEvent event) {
        if(mathError){
            
        }
    }

    @FXML
    private void handleEqualAction(ActionEvent event) {
        if(mathError){
            if(!number1bool){
                DesplyField.setBlendMode(BlendMode.RED);
                DesplyField.setText("Math Error! click " +"AC" +" and continue.");
                mathError = false;
            }else{
        newText = DesplyField.getText();
        if(newText.equals("")){
            DesplyField.setBlendMode(BlendMode.RED);
            DesplyField.setText("Math Error! click " +"AC" +" and continue.");
            mathError = false;
            number1bool = false;
        }else{
        number2 = Double.parseDouble(newText);
        double result = 0.0;
        if (operation == "Add") {
            operation = "";
            result = number1 + number2;
            DesplyField.setText("" + result);
            resultUpdated = false;
            number1bool = false;
        } else if (operation == "Subruct") {
            operation = "";
            result = number1 - number2;
            DesplyField.setText("" + result);
            resultUpdated = false;
            number1bool = false;
        } else if (operation == "Multiply") {
            operation = "";
            result = number1 * number2;
            DesplyField.setText("" + result);
            resultUpdated = false;
            number1bool = false;
        } else if (operation == "Division") {
            operation = "";
            
            if(number2 != 0){
            result = number1 / number2;
            DesplyField.setText("" + result);
            resultUpdated = false;
            number1bool = false;
            }else{
                DesplyField.setBlendMode(BlendMode.RED);
                DesplyField.setText("Math Error! click " +"AC" +" and continue.");
                mathError = false;
                number1bool = false;
            }
        }
        }
        }
        }
    }

    @FXML
    private void handleFourAction(ActionEvent event) {
        if(mathError){
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
            
        oldText = DesplyField.getText();
        newText = oldText + "4";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("4");
        }
        }
    }

    @FXML
    private void handleOneAction(ActionEvent event) {
        if(mathError){
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
          
        oldText = DesplyField.getText();
        newText = oldText + "1";
        if (!oldText.equals("0")) {

            DesplyField.setText(newText);
        } else {
            DesplyField.setText("1");
        }
        }
    }

    @FXML
    private void handleZeroAction(ActionEvent event) {
        if(mathError){
        if(!resultUpdated){
            DesplyField.setText("");
            resultUpdated =true;
        }
          
        oldText = DesplyField.getText();
        if (!oldText.equals("0")) {
            newText = oldText + "0";
            DesplyField.setText(newText);
        }
        }
    }

    @FXML
    private void handleAddAction(ActionEvent event) {
        operation = "Add";
        
        if(mathError){
        oldText = DesplyField.getText();
        
        if(!oldText.equals("")){
        number1 = Double.parseDouble(oldText);
        DesplyField.setText("");
        number1bool = true;
        }
        }
    }

    @FXML
    private void handleMemoriReturnAction(ActionEvent event) {
        if(mathError){
        DesplyField.setText(save);
        }
    }

    @FXML
    private void handleMemoriSaveAction(ActionEvent event) {
        if(mathError){
        save = "0";
        oldText = DesplyField.getText();
        save = oldText;
        }
    }

    @FXML
    private void handleMemoriClearAction(ActionEvent event) {
        if(mathError){
        save = "";
        }
    }

}

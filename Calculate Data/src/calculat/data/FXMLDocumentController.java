/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculat.data;

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
 * @author rianix
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField number1Text;
    @FXML
    private TextField number2Text;
    @FXML
    private TextField resultText;
    @FXML
    private Label click;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleSubstructionAction(ActionEvent event) {
        String stringNumber1 = number1Text.getText();
        String stringNumber2 = number2Text.getText();
        click.setText("Clicked Substruction");
        
        if(stringNumber1.equals("") || stringNumber2.equals("")){
            resultText.setBlendMode(BlendMode.RED);
            resultText.setText("Number missing!!!");
        }
        else{
            double number1 = Double.parseDouble(stringNumber1);
            double number2 = Double.parseDouble(stringNumber2);
        
            double result = number1 - number2;
            
            resultText.setBlendMode(BlendMode.GREEN);
            resultText.setText("" + result);
        }       
    }

    @FXML
    private void handleMultiplicationAction(ActionEvent event) {
        String stringNumber1 = number1Text.getText();
        String stringNumber2 = number2Text.getText();
        click.setText("Clicked Multiplication");
        
        if(stringNumber1.equals("") || stringNumber2.equals("")){
            resultText.setBlendMode(BlendMode.RED);
            resultText.setText("Number missing!!!");
        }
        else{
            double number1 = Double.parseDouble(stringNumber1);
            double number2 = Double.parseDouble(stringNumber2);
        
            double result = number1 * number2;
            
            resultText.setBlendMode(BlendMode.GREEN);
            resultText.setText("" + result);
        }
    }

    @FXML
    private void handleDivisionAction(ActionEvent event) {
        String stringNumber1 = number1Text.getText();
        String stringNumber2 = number2Text.getText();
        click.setText("Clicked Division");
        
        if(stringNumber1.equals("") || stringNumber2.equals("")){
            resultText.setBlendMode(BlendMode.RED);
            resultText.setText("Number missing!!!");
        }
        else{
            double number1 = Double.parseDouble(stringNumber1);
            double number2 = Double.parseDouble(stringNumber2);
            
            if(number2 == 0.0){
                resultText.setBlendMode(BlendMode.RED);
                resultText.setText("Math Error!!!");
            }
            else{
                double result = number1 / number2;
            
                resultText.setBlendMode(BlendMode.GREEN);
                resultText.setText("" + result);
            }
        }
    }

    @FXML
    private void handleAddAction(ActionEvent event) {
        String stringNumber1 = number1Text.getText();
        String stringNumber2 = number2Text.getText();
        click.setText("Clicked Add");
        
        if(stringNumber1.equals("") || stringNumber2.equals("")){
            resultText.setBlendMode(BlendMode.RED);
            resultText.setText("Number missing!!!");
        }
        else{
            double number1 = Double.parseDouble(stringNumber1);
            double number2 = Double.parseDouble(stringNumber2);
        
            double result = number1 + number2;
            
            resultText.setBlendMode(BlendMode.GREEN);
            resultText.setText("" + result);
        }
    }
    
}

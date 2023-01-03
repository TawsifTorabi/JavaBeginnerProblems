package com.calculator.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button DivideOperationBtn;

    @FXML
    private Button FactorialBtn;

    @FXML
    private TextField Input1;

    @FXML
    private TextField Input2;

    @FXML
    private Button MinusOperationBtn;

    @FXML
    private Button MultiplyOperationBtn;

    @FXML
    private TextField Output;

    @FXML
    private Button PercentOperationBtn;

    @FXML
    private Button PlusOperationBtn;

    @FXML
    private Button PowerBtn;

    @FXML
    private Button SqrtBtn;

    boolean ValidateInput(){
        if(Input1.getText().isEmpty() || Input1.getText().isBlank() || Input2.getText().isBlank() || Input2.getText().isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    @FXML
    void divideOperation(ActionEvent event) {
        if(ValidateInput() == true){
            double out = Double.parseDouble(Input1.getText())/Double.parseDouble(Input2.getText());
            Output.setText(String.valueOf(out));
        }
    }

    @FXML
    double factorialOperation(ActionEvent event) {
        double i,fact= Double.parseDouble(Input2.getText());
        double number= Double.parseDouble(Input1.getText());
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }

    @FXML
    void minusOperation(ActionEvent event) {
        if(ValidateInput() == true){
            double out = Double.parseDouble(Input1.getText())-Double.parseDouble(Input2.getText());
            Output.setText(String.valueOf(out));
        }
    }

    @FXML
    void multiplyOperation(ActionEvent event) {
        if(ValidateInput() == true){
            double out = Double.parseDouble(Input1.getText())*Double.parseDouble(Input2.getText());
            Output.setText(String.valueOf(out));
        }
    }

    @FXML
    void percentOperation(ActionEvent event) {
        double out = (Double.parseDouble(Input1.getText()) * Double.parseDouble(Input2.getText()))/100;
        Output.setText(String.valueOf(out));
    }

    @FXML
    void plusOperation(ActionEvent event) {
        if(ValidateInput() == true){
            double out = Double.parseDouble(Input1.getText())+Double.parseDouble(Input2.getText());
            Output.setText(String.valueOf(out));
        }
    }

    @FXML
    void powerOperationBtn(ActionEvent event) {
        if(ValidateInput() == true){
            double out = Math.pow(Double.parseDouble(Input1.getText()), Double.parseDouble(Input2.getText()));
            Output.setText(String.valueOf(out));
        }
    }

    @FXML
    void sqrtOperation(ActionEvent event) {
        double out = Math.sqrt(Double.parseDouble(Input1.getText()));
        Output.setText(String.valueOf(out));
    }

}

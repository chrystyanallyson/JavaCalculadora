/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author CHRYSTYAN
 */
public class CalculadoraController implements Initializable {
    
    double valor1 = 0;
    double valor2 = 0;
    double resultado = 0;
    String operacao = "";
    boolean realizado = false;

    private TextField telaTextField;
    @FXML
    private Button seteButton;
    @FXML
    private Button quatroButton;
    @FXML
    private Button umButton;
    @FXML
    private Button zeroButton;
    @FXML
    private Button oitoButton;
    @FXML
    private Button cincoButton;
    @FXML
    private Button doisButton;
    @FXML
    private Button pontoButton;
    @FXML
    private Button noveButton;
    @FXML
    private Button seisButton;
    @FXML
    private Button tresButton;
    @FXML
    private Button subtracaoButton;
    @FXML
    private Button somaButton;
    @FXML
    private Button igualButton;
    @FXML
    private Button apagarButton;
    @FXML
    private Button divisaoButton;
    @FXML
    private Button mutiplicacaoButton;
    @FXML
    private Text tela2Text;
    @FXML
    private Text telaText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        umButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+"1");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+"1");
               }
            }
        });
        doisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+"2");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+"2");
               }
            }
        });
        tresButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+"3");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+"3");
               }
            }
        });
        quatroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+"4");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+"4");
               }
            }
        });
        cincoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+"5");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+"5");
               }
            }
        });
        seisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+"6");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+"6");
               }
            }
        });
        seteButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+"7");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+"7");
               }
            }
        });
        oitoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+"8");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+"8");
               }
            }
        });
        noveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+"9");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+"9");
               }
            }
        });
        zeroButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+"0");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+"0");
               }
            }
        });
        
        pontoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               if(realizado == false){
                   telaText.setText(telaText.getText()+".");
               }else{
                   telaText.setText("");
                    tela2Text.setText("");
                    valor1 = 0;
                    valor2 = 0;
                    operacao = "";
                    realizado = false;
                    telaText.setText(telaText.getText()+".");
               }
            }
        });
          
        /////////////////////////////////////////////////////////////////////////////  
        //OPERADORES
        
        mutiplicacaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              valor1 = Double.parseDouble(telaText.getText());
              tela2Text.setText(telaText.getText()+"*");
              telaText.setText("");
              operacao ="*";
            }
        });
        divisaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               valor1 = Double.parseDouble(telaText.getText());
              tela2Text.setText(telaText.getText()+"/");
              telaText.setText("");
              operacao ="/";
            }
        });
        subtracaoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               valor1 = Double.parseDouble(telaText.getText());
              tela2Text.setText(telaText.getText()+"-");
              telaText.setText("");
              operacao ="-";
            }
        });
        somaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               valor1 = Double.parseDouble(telaText.getText());
              tela2Text.setText(telaText.getText()+"+");
              telaText.setText("");
              operacao ="+";
            }
        });
        
        apagarButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                telaText.setText("");
                tela2Text.setText("");
                valor1 = 0;
                valor2 = 0;
                operacao = "";
            }
        });
        
        igualButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                valor2 = Double.parseDouble(telaText.getText());
                
                switch(operacao){
                    case "+":
                        resultado = valor1 + valor2;
                        telaText.setText( "= " + String.valueOf(resultado));
                        tela2Text.setText(valor1 + " " + operacao + " " + valor2);
                        realizado = true;
                        break;
                    case "-":
                        resultado = valor1 - valor2;
                        telaText.setText( "= " + String.valueOf(resultado));
                        tela2Text.setText(valor1 + " " + operacao + " " + valor2);
                        realizado = true;
                        break;
                    case "*":
                        resultado = valor1 * valor2;
                        telaText.setText( "= " + String.valueOf(resultado));
                        tela2Text.setText(valor1 + " " + operacao + " " + valor2);
                        realizado = true;
                        break;
                    case "/":
                        resultado = valor1 / valor2;
                        telaText.setText( "= " + String.valueOf(resultado));
                        tela2Text.setText(valor1 + " " + operacao + " " + valor2);
                        realizado = true;
                        break;
                }
                operacao = "";
                valor1 = 0;
                valor2 = 0;
            }
        });
    }    
    
}

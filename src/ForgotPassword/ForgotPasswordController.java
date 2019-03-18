/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ForgotPasswordController implements Initializable {

    @FXML 
    Button signup_button=new Button();
    @FXML
    RadioButton male=new RadioButton();
    @FXML
    RadioButton female=new RadioButton();
    @FXML
    ToggleGroup toggleGroup = new ToggleGroup();
    /**
     * Initializes the controller class.
     */
    boolean entered_textfields[]={false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
     boolean invalid[]={false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
    
    @FXML
    TextField Fname=new TextField();
     @FXML
    TextField Mname=new TextField();
     @FXML
    TextField Lname=new TextField();
     @FXML
    TextField SSN=new TextField();
     @FXML
    TextField phone_number=new TextField();
     @FXML
    TextField country=new TextField();
     @FXML
    TextField city=new TextField();
     @FXML
    TextField streetNo=new TextField();
     @FXML
    TextField buildingNo=new TextField();
     @FXML
    TextField zipcode=new TextField();
     @FXML
    TextField emailaddress=new TextField();
     @FXML
    TextField vemailaddress=new TextField();
     @FXML
    TextField recoverEMaddress=new TextField();
     @FXML
    TextField password=new TextField();
     @FXML
    TextField confirm_password=new TextField();
     
     @FXML
     ComboBox month=new ComboBox();
     @FXML
     ComboBox day=new ComboBox();
     @FXML
     ComboBox year=new ComboBox();
     boolean flag_thread=false;
   
    @FXML
    private void handleButtonAction(Event e) throws IOException {
  
        if((e.getEventType()==MouseEvent.MOUSE_CLICKED||e.getEventType()==KeyEvent.KEY_PRESSED)&&e.getSource()==signup_button){
        
 if(Fname.getText().equals("")||Mname.getText().equals("")||Lname.getText().equals("")||SSN.getText().equals("")||phone_number.getText().equals("")||country.getText().equals("")||city.getText().equals("")||streetNo.getText().equals("")||buildingNo.getText().equals("")||zipcode.getText().equals("")||emailaddress.getText().equals("")||vemailaddress.getText().equals("")||password.getText().equals("")||confirm_password.getText().equals(""))
 {
     
             
              Thread ab=new Thread(new Thread(){ public void run(){  if(flag_thread==false) try {flag_thread=true;
   /////////////////////////////////////////////////////////////////////////////////////////////////
             TextField array[]={Fname,Mname,Lname,SSN,phone_number,country,city,streetNo,buildingNo,zipcode,emailaddress,vemailaddress,password,confirm_password};

                                           boolean flag=false;
                               
                               
                               for(int i=0;i<3;i++){
                              if(i==1){
                                  for(int j=0;j<array.length;j++)
                                  if(invalid[j]==true||array[j].getText().equals("")){
                              array[j].setStyle("-fx-background-color: #ffffff;");
                             
                                  }
                              
                              
                              }
                              else{
                                    for(int j=0;j<array.length;j++)
                                     if(invalid[j]==true||array[j].getText().equals("")){
                              array[j].setStyle("-fx-background-color: #ffb3b3;");
                              }
                            
                             }
                               Thread.sleep(500);
                               flag=!flag;
                              for(int j=0;j<array.length;j++) 
                                  if(invalid[j]==true||array[j].getText().equals(""))
                              array[j].setDisable(flag);
                              
                              if(i==2)
                                   for(int j=0;j<array.length;j++)
                                    if(invalid[j]==true||array[j].getText().equals("")){
                              array[j].setDisable(false);
                              
                             
                              }
                               }
                                for(int j=0;j<array.length;j++)
                                     if(invalid[j]==true||array[j].getText().equals(""))
                              array[j].setStyle("-fx-background-color: #ffffff;");




                                   
                              
                               
  /////////////////////////////////////////////////////////////////////////////////////////////////
                       flag_thread=false;    } catch (InterruptedException ex) { Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);} }});ab.start();return;


            
 }
 else{
     
     
       if(!emailaddress.getText().equals(vemailaddress.getText())){
                   Thread ab=new Thread(new Thread(){ public void run(){  if(flag_thread==false) try {flag_thread=true;
   /////////////////////////////////////////////////////////////////////////////////////////////////
                   boolean flag=false;
                               Background old=emailaddress.getBackground();
                                String email_string=emailaddress.getText();
                                String vemail_string=vemailaddress.getText();
                               for(int i=0;i<3;i++){
                              if(i==1){
                              emailaddress.setStyle("-fx-background-color: #ffffff;");
                              emailaddress.setText("Not match");
                              vemailaddress.setStyle("-fx-background-color: #ffffff;");
                              vemailaddress.setText("Not match");}
                              else{
                              emailaddress.setStyle("-fx-background-color: #ffb3b3;");
                              emailaddress.setText("Not match");
                              vemailaddress.setStyle("-fx-background-color: #ffb3b3;");
                              vemailaddress.setText("Not match");}
                               Thread.sleep(700);
                               flag=!flag;
                               
                              emailaddress.setDisable(flag);
                              vemailaddress.setDisable(flag);

                              
                              if(i==2){emailaddress.setDisable(false);
                              emailaddress.setBackground(old);
                              emailaddress.setText(email_string);
                              
                              vemailaddress.setDisable(false);
                              vemailaddress.setBackground(old);
                              vemailaddress.setText(vemail_string);}
                               }
                              emailaddress.setStyle("-fx-background-color: #ffffff;");
                              vemailaddress.setStyle("-fx-background-color: #ffffff;");
                              
  /////////////////////////////////////////////////////////////////////////////////////////////////
                       flag_thread=false;    } catch (InterruptedException ex) { Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);} }});ab.start();return;

           
           
       }
       
       if(!password.getText().equals(confirm_password.getText())){
       
                Thread ab=new Thread(new Thread(){ public void run(){  if(flag_thread==false) try {flag_thread=true;
   /////////////////////////////////////////////////////////////////////////////////////////////////
                   boolean flag=false;
                               Background old=password.getBackground();
                                String email_string=password.promptTextProperty().get();
                                String vemail_string=confirm_password.promptTextProperty().get();
                               for(int i=0;i<3;i++){
                              if(i==1){
                              password.setStyle("-fx-background-color: #ffffff;");
                              password.setText("");
                              password.promptTextProperty().set("Not match");
                              confirm_password.setStyle("-fx-background-color: #ffffff;");
                              confirm_password.setText("");
                              confirm_password.promptTextProperty().set("Not match");}
                              else{
                              password.setStyle("-fx-background-color: #ffb3b3;");
                              password.setText("");
                              password.promptTextProperty().set("Not match");
                              confirm_password.setStyle("-fx-background-color: #ffb3b3;");
                              confirm_password.setText("");
                              confirm_password.promptTextProperty().set("Not match");}
                              Thread.sleep(700);
                               flag=!flag;
                               
                              password.setDisable(flag);
                              confirm_password.setDisable(flag);

                              
                              if(i==2){password.setDisable(false);
                              password.setBackground(old);
                              password.promptTextProperty().set(email_string);
                              password.setText("");
                              confirm_password.setDisable(false);
                              confirm_password.setBackground(old);
                              confirm_password.promptTextProperty().set(vemail_string);
                              confirm_password.setText("");}
                               }
                              password.setStyle("-fx-background-color: #ffffff;");
                              confirm_password.setStyle("-fx-background-color: #ffffff;");
                              
  /////////////////////////////////////////////////////////////////////////////////////////////////
                       flag_thread=false;    } catch (InterruptedException ex) { Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);} }});ab.start();return;

           
       }
      

        
        ///save information to data base 
        
        ///--------------------
            
        FxDialogs.showInformation(null,"Congrats! You Successfully Signed up");
        
        Stage stage;
        Parent root;
        stage = (Stage) password.getScene().getWindow();
        root = FXMLLoader.load(getClass().getClassLoader().getResource("LoginSignup/LoginSignup.fxml"));    
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
 }
            
        }
    }
    
    
    @FXML
    private void handleENTER_EXIT(Event e) throws IOException {
        
      
        TextField array[]={Fname,Mname,Lname,SSN,phone_number,country,city,streetNo,buildingNo,zipcode,emailaddress,vemailaddress,password,confirm_password};
        for(int i=0;i<array.length;i++)
            if((e.getEventType()==MouseEvent.MOUSE_PRESSED||e.getEventType()==KeyEvent.KEY_TYPED||e.getEventType()==KeyEvent.KEY_PRESSED)&&e.getSource()==array[i])
            {entered_textfields[i]=true;break;}
    
         String error_style="-fx-background-color: #ffb3b3;";
         String valid_style="-fx-background-color: #ffff;";
         
         for(int i=0;i<array.length;i++)
          if(entered_textfields[i]==true&&(e.getEventType()==MouseEvent.MOUSE_PRESSED||e.getEventType()==KeyEvent.KEY_TYPED||e.getEventType()==KeyEvent.KEY_PRESSED)&&array[i].getText().equals("")&&e.getSource()!=array[i])
        {array[i].setStyle(error_style);invalid[i]=true;}
        else if (!array[i].getText().equals(""))
        {array[i].setStyle(valid_style);invalid[i]=false;}
  
        
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
 day.getItems().addAll(
  
        "1",
        "2",
        "3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"
    
 );
 day.getSelectionModel().select("1");
 
 month.getItems().addAll(
  
      "January","February","March","April","May","June","July","August","September","October","November","December"    
 );
 month.getSelectionModel().select("January");
 
 String years[]=new String[96];
 for(int i=0;i<96;i++)
     year.getItems().add(Integer.toString(i+1920));
        year.getSelectionModel().select("1920");
        
        male.setToggleGroup(toggleGroup);
        
        female.setToggleGroup(toggleGroup);
    }    
    
}

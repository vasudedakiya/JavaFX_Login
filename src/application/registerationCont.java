package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class registerationCont {

    @FXML
    private TextField usernameInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private RadioButton maleInput;

    @FXML
    private RadioButton femaleInput;
    
    @FXML
    private ToggleGroup genderGroup;

    @FXML
    private DatePicker dobInput;

    @FXML
    private Button register;

    @FXML
    private Hyperlink signin;
    
    @FXML
    private Label fillbox;



    String toogleGroupValue;
    @FXML
    public void selectGender(ActionEvent event) {
  
    	RadioButton selectedRadioButton = (RadioButton) genderGroup.getSelectedToggle();
    	this.toogleGroupValue = selectedRadioButton.getText();
    	
    	

    }
    
    @FXML
    void registerUser(ActionEvent event) {
    	try {
    		 File file = new File("src/application/user.txt");
    		FileWriter fr = new FileWriter(file,true);
    		BufferedWriter br = new BufferedWriter(fr);
    		PrintWriter pw = new PrintWriter(br);

    		String temp = usernameInput.getText() + "##" + passwordInput.getText() + "##" + this.toogleGroupValue + "##" + dobInput.getValue() + "\n";
    		if(temp.equals("####null##null" + "\n")) {
    			fillbox.setText("Fill the all field");
    			
    		}
    		
    		else{
    		pw.append(temp);
    		pw.close();
    		fr.close();
    		
    		new Main().start(Main.primaryStage);
    		}
		} 
    	
    	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    @FXML
    void signInCalled(ActionEvent event) {
    	
    	try {
			new Main().start(Register.primaryStage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}

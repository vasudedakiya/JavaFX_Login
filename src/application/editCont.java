
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class editCont {

    @FXML
    private TextField edit_username;

    @FXML
    private RadioButton edit_male;

    @FXML
    private ToggleGroup genderGroup;

    @FXML
    private RadioButton edit_female;

    @FXML
    private DatePicker edit_dob;

    @FXML
    private Button submitchanges;
    
    @FXML
    private Label isExist;

    @FXML
    private TextField serUsername;

    @FXML
    private Button search;

    
    String[] up;
    @FXML
    void searchUser(ActionEvent event) {
    	
    	try {
    		BufferedReader br = new BufferedReader(new FileReader("src/application/user.txt"));
    		String temp;
    		Boolean flag = false;
    		
    		
    		while((temp = br.readLine())!=null) {
    			up = temp.split("##");
    			
    			
    			if((serUsername.getText().equals(up[0])) ){
    				
    				
    				flag = true;
    				edit_username.setText(up[0]);
    				break;
    			}
    		}
    			
    		if(flag == false) {
    				isExist.setText("User Dose not exist");
    		}
    		
    		br.close();
    		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


    }

    @FXML
    void selectGender(ActionEvent event) {
    	
    	RadioButton selectedRadioButton = (RadioButton) genderGroup.getSelectedToggle();
    	String toogleGroupValue = selectedRadioButton.getText();
    	

    }

    @FXML
    void submitChange(ActionEvent event) {
    	try {
    		
			new Index().start(Edit.primaryStage);
		} 
    	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

    }

}




//    @FXML
//    void selectGender(ActionEvent event) {
//    	RadioButton selectedRadioButton = (RadioButton) genderGroup.getSelectedToggle();
//    	String toogleGroupValue = selectedRadioButton.getText();
//    	System.out.println(toogleGroupValue);
//
//    }

//    @FXML
//    void submitChange(ActionEvent event) {
//    	
//    	try {
//			new Index().start(Edit.primaryStage);
//		} 
//    	catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			}


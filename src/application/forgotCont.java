package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class forgotCont {

    @FXML
    private Button find;

    @FXML
    private TextField username;

    @FXML
    private DatePicker dob;

    @FXML
    private Button Back;

    @FXML
    private Label password;

    @FXML
    void Back(ActionEvent event) {
    	
    	try {
			new Main().start(ForgotPw.primaryStage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void passwordfind(ActionEvent event) {
    	
    	try {
    		BufferedReader br = new BufferedReader(new FileReader("src/application/user.txt"));
    		String temp;
    		Boolean flag = false;
    		
    		
    		while((temp = br.readLine())!=null) {
    			String[] up = temp.split("##");
    			
    			if((username.getText().equals(up[0])) && (dob.getValue().toString().equals(up[3])) ){
    				flag = true;
    				temp = up[1];
    				break;
    			}
    		}
    			
    		if (flag==true) {
    			password.setText("Your Password is " + temp );
			}
    		else {
    			password.setText("Invalid Username or Password.");
    		}
    		
    		br.close();
    		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


    }

}

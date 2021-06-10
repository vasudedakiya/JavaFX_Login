package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;

public class loginCont {
	
	@FXML
    private Button login;
	
	@FXML
	private Hyperlink forgotpw;
	
	@FXML
	private PasswordField txtpassword;
	
	@FXML
	private TextField txtusername;

	@FXML
	private Label noid;

    
	@FXML
    private Hyperlink reginow;

   @FXML
    void forgotActive(ActionEvent event) {
	   try {
			new ForgotPw().start(Main.primaryStage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void loginActive(ActionEvent event) {
    	try {
    		BufferedReader br = new BufferedReader(new FileReader("src/application/user.txt"));
    		String temp;
    		Boolean flag = false;
    		
    		while((temp = br.readLine())!=null) {
    			String[] up = temp.split("##");
    			
    			if((txtusername.getText().equals(up[0])) && (txtpassword.getText().equals(up[1])) ){
    				flag = true;
    				break;
    			}
    		}
    			
    		if (flag==true) {
    				new Index().start(Main.primaryStage);
			}
    		else {
    				noid.setText("Invalid Username or Password.");
    		}
    		
    		br.close();
    		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void regiActive(ActionEvent event) {
    	
    	try {
			new Register().start(Main.primaryStage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    

}

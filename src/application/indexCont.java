package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class indexCont {

	@FXML
    private Label userlist;
	
	@FXML
    private Pane base;
	
	@FXML
	private Label usergender;

	@FXML
	private Label userdob;
    
    @FXML
    private Button back;

    @FXML
    private Button edit_user;
    
    @FXML
    private Label userlist1;

  
    
    @FXML
    void backActive(ActionEvent event) {
    	
    	try {	
			new Main().start(Index.primaryStage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

   

    @FXML
    void editUserDetail(ActionEvent event) {
    	
    	try {
			new Edit().start(Index.primaryStage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    

    
	int count = 0;   
    @FXML
    void listshow(MouseEvent event) {
    	
    	try {
  
    	
    		
    		if(count==0) {
    			
    		
	    		BufferedReader br = new BufferedReader(new FileReader("src/application/user.txt"));
	    		String temp;
	    		
	    		while((temp = br.readLine())!=null) {
	    			String[] up = temp.split("##");
	    			userlist.setText(userlist.getText() + "\n");
	    			userlist.setText(userlist.getText() + up[0]); 
	    		
	    			
	    			usergender.setText(usergender.getText() + "\n");
	    			usergender.setText(usergender.getText() + up[2]);
	    		
	    	
	    			
	    			userdob.setText(userdob.getText() + "\n");
	    			userdob.setText(userdob.getText() + up[3]);
	    		
	    		}
	    		count = 1;
	    		
	    		br.close();
    		}
    		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}

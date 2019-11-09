package ricerca.gui;


	
	/**
	 * Sample Skeleton for 'Ricerca.fxml' Controller Class
	 */



	import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import ricarca.model.Gestione;

	public class RicercaController {
		
		private Gestione ges;
		
		public void setModel(Gestione ges) {
			this.ges=ges;
		}

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="parola"
	    private TextField parola; // Value injected by FXMLLoader

	    @FXML // fx:id="cerca"
	    private Button cerca; // Value injected by FXMLLoader

	    @FXML // fx:id="numero"
	    private Text numero; // Value injected by FXMLLoader

	    @FXML // fx:id="tempo"
	    private Text tempo; // Value injected by FXMLLoader

	    @FXML
	    void onCerca(ActionEvent event) {
	    	long inizio,fine;
	    	inizio=System.currentTimeMillis();
	    	numero.setText(""+ges.nParolaList(parola.getText()));
	    	fine=System.currentTimeMillis();
	    	
	    	tempo.setText(""+(fine-inizio)+"ms");

	    }

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert parola != null : "fx:id=\"parola\" was not injected: check your FXML file 'Ricerca.fxml'.";
	        assert cerca != null : "fx:id=\"cerca\" was not injected: check your FXML file 'Ricerca.fxml'.";
	        assert numero != null : "fx:id=\"numero\" was not injected: check your FXML file 'Ricerca.fxml'.";
	        assert tempo != null : "fx:id=\"tempo\" was not injected: check your FXML file 'Ricerca.fxml'.";

	    }
	}


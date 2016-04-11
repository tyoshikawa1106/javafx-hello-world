package io.github.tyoshikawa1106;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {
	@FXML
	private Label label1;
	
	@FXML
	protected void doClick(ActionEvent event) {
		label1.setText("Hello! World!");
	}
}
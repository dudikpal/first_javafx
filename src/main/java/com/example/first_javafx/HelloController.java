package com.example.first_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
	@FXML
	private Label welcomeText;
	@FXML
	private javafx.scene.control.TextField inputField;

	@FXML
	protected void onHelloButtonClick() {
		welcomeText.setText("Welcome to JavaFX Application!");
	}

	@FXML
	protected void onShowAlertClick() {
		javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setHeaderText(null);
		alert.setContentText("This is a popup message!");
		alert.showAndWait();
	}

	@FXML
	protected void onUpdateLabelClick() {

		String text = inputField.getText();

		if (text.isEmpty()) {
			welcomeText.setText("Please type something!");
		} else {
			welcomeText.setText(text);
		}
	}

}
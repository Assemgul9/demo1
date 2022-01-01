package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
  @FXML
    TextArea chatWindow;

  @FXML
    TextField rowText;

  public void sendText(ActionEvent actionEvent){

      chatWindow.appendText(rowText.getText());
      rowText.clear();
      rowText.requestFocus();
  }
}
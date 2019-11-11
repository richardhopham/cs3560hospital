/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmltestapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author sebas
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    
    @FXML
    private Button p_newButton;
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private Label d_doctorIDLabel;
    @FXML
    private TextField d_officePhoneNo1TextField;
    @FXML
    private Label d_firstNameLabel;
    @FXML
    private TextField d_firstNameTextField;
    @FXML
    private Label d_lastNameLabel;
    @FXML
    private TextField d_lastNameTextField;
    @FXML
    private Label d_officePhoneNo1Label;
    @FXML
    private TextField d_emailAddressTextField;
    @FXML
    private TextField d_doctorIDTextField;
    @FXML
    private TextField d_faxNoTextField;
    @FXML
    private TextField d_officePhoneNo2TextField;
    @FXML
    private Label d_officePhoneNo2Label;
    @FXML
    private Label d_faxNoLabel;
    @FXML
    private Label d_emailAddressLabel;
    @FXML
    private Label d_NotesLabel;
    @FXML
    private TextArea d_notesTextField;
    @FXML
    private ButtonBar d_ButtonBar;
    @FXML
    private Button d_newButton;
    @FXML
    private Button d_editButton;
    @FXML
    private Button d_deleteButton;
    @FXML
    private Button d_saveButton;
    @FXML
    private TableView<?> d_TableView;
    @FXML
    private AnchorPane patientAnchorPane;
    @FXML
    private AnchorPane patientInfoAnchorPane;
    @FXML
    private Label p_patientIDLabel;
    @FXML
    private Label p_firstNameLabel;
    @FXML
    private Label p_lastNameLabel;
    @FXML
    private Label p_dateOfBirthLabel;
    @FXML
    private Label p_addressLabel;
    @FXML
    private Label p_addressSecondLabel;
    @FXML
    private Label p_cityLabel;
    @FXML
    private Label p_stateLabel;
    @FXML
    private Label p_countryLabel;
    @FXML
    private DatePicker p_dateOfBirthDatePicker;
    @FXML
    private ChoiceBox<?> p_stateChoiceBox;
    @FXML
    private TextField p_patientIDTextField;
    @FXML
    private TextField p_firstNameTextField;
    @FXML
    private TextField p_lastNameTextField;
    @FXML
    private TextField p_addressTextField;
    @FXML
    private TextField p_addressSecondTextField;
    @FXML
    private TextField p_cityTextField;
    @FXML
    private Label p_phoneNoLabel;
    @FXML
    private Label p_insuranceProviderLabel;
    @FXML
    private Label p_policyNumberLabel;
    @FXML
    private Label p_notesLabel;
    @FXML
    private TextField p_phoneNuberTextField;
    @FXML
    private TextField p_insuranceProviderTextField;
    @FXML
    private TextField p_policyNumberTextField;
    @FXML
    private TextArea p_notesTextArea;
    @FXML
    private Label p_policyNumberLabel2;
    @FXML
    private TextField p_docIDTextField;
    @FXML
    private Label p_pharmacyIDLabel;
    @FXML
    private TextField p_pharmacyIDTextField;
    @FXML
    private ButtonBar p_patientButtonBar;
    @FXML
    private Button p_editButton;
    @FXML
    private Button p_deleteButton;
    @FXML
    private Button p_saveButton;
    @FXML
    private TableView<?> p_TableView;
    @FXML
    private AnchorPane appointmentAnchorPane;
    @FXML
    private AnchorPane appointmentInfoAnchorPane;
    @FXML
    private Label appointmentPatientIDLabel;
    @FXML
    private DatePicker appointmentDatePicker;
    @FXML
    private ButtonBar a_appointmentButtonBar;
    @FXML
    private Button a_newButton;
    @FXML
    private Button a_editButton;
    @FXML
    private Button a_deleteButton;
    @FXML
    private Button a_saveButton;
    @FXML
    private TableView<?> a_TableView;
    @FXML
    private TextField ph_pharmacyIDTextField;
    @FXML
    private Label ph_pharmacyIDLabel;
    @FXML
    private Label ph_nameLabel;
    @FXML
    private TextField ph_nameTextField;
    @FXML
    private Label ph_addressLabel;
    @FXML
    private Label ph_addressLine2Label;
    @FXML
    private Label ph_phoneNoLabel;
    @FXML
    private Label ph_pharmacistLabel;
    @FXML
    private Label ph_faxNoLabel;
    @FXML
    private Label ph_notesLabel;
    @FXML
    private TextField ph_addressTextField;
    @FXML
    private TextField ph_addressLine2TextField;
    @FXML
    private TextField ph_phoneNoTextField;
    @FXML
    private TextField ph_pharmacistTextField;
    @FXML
    private TextField ph_faxNoTextField;
    @FXML
    private TextArea ph_notesTextArea;
    @FXML
    private ButtonBar ph_ButtonBar;
    @FXML
    private Button ph_newButton;
    @FXML
    private Button ph_editButton;
    @FXML
    private Button ph_deleteButton;
    @FXML
    private Button ph_saveButton;
    @FXML
    private TableView<?> ph_TableView;
    @FXML
    private TextField p_countryTextField;
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
    @FXML
    private void p_newButton_OnAction(ActionEvent event){
        System.out.println("You pressed PATIENT NEW BUTTON");
        //
    }

    @FXML
    private void p_editButton_OnAction(ActionEvent event) {
        System.out.println("You pressed PATIENT EDIT BUTTON");
    }

    @FXML
    private void p_deleteButton_OnAction(ActionEvent event) {
        System.out.println("You pressed PATIENT DELETE BUTTON");
    }

    @FXML
    private void p_saveButton_OnAction(ActionEvent event) {
        System.out.println("You pressed PATIENT SAVE BUTTON");
    }

    @FXML
    private void d_newButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void d_editButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void d_deleteButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void d_saveButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void a_newButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void a_editButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void a_deleteButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void a_saveButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void ph_newButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void ph_editButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void ph_deleteButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void ph_saveButton_OnAction(ActionEvent event) {
    }
    
}

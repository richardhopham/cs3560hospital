/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmltestapp;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author sebas
 */
public class FXMLDocumentController implements Initializable {

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
    private ChoiceBox<String> p_stateChoiceBox;
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
    private Label p_doctorIDLabel;
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
    private TableView<Patient> p_TableView;
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

    String url = "jdbc:postgresql://database-1.cakeqdu3h1oe.us-west-1.rds.amazonaws.com:5432/";
    Properties props = new Properties();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        props.setProperty("user", "postgres");
        props.setProperty("password", "password");

        try {
            fillStatesChoiceBox();
            initializePatientTableView();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fillStatesChoiceBox() throws SQLException {
        Connection conn = DriverManager.getConnection(url, props);
        String sqlStatement = "SELECT * FROM public.states;";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sqlStatement);

        ArrayList<String> statesArr = new ArrayList<>();
        while (rs.next()) {
            String stateName = rs.getString("states_name");
            stateName = stateName.replace('{', ' ');
            stateName = stateName.replace('}', ' ');
            stateName = stateName.replace('"', ' ');
            stateName = stateName.trim();
            statesArr.add(stateName);
        }

        ObservableList<String> stateList = FXCollections.observableList(statesArr);
        p_stateChoiceBox.setItems(stateList);

        conn.close();
    }

    @FXML
    private void p_newButton_OnAction(ActionEvent event) {
        clearPatientFields();
        p_saveButton.setDisable(false);
    }

    @FXML
    private void p_editButton_OnAction(ActionEvent event) {
        //if (p_patientIDTextField.getText().equals("")) {
        String idNum;
        try {
            idNum = p_TableView.getSelectionModel().getSelectedItem().getPatientID();
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR, "Select a Patient to edit.");
            alert.showAndWait();
            return;
        }

        //String idNum = p_patientIDTextField.getText();

        String url = "jdbc:postgresql://database-1.cakeqdu3h1oe.us-west-1.rds.amazonaws.com:5432/";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "password");

        try {
            Connection conn = DriverManager.getConnection(url, props);
            String sqlStatement = "SELECT * FROM public.patients WHERE patient_id = " + idNum + ";";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlStatement);
            rs.next();

            p_patientIDTextField.setText(rs.getString(1));
            p_firstNameTextField.setText(rs.getString(2));
            p_lastNameTextField.setText(rs.getString(3));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
            String date = rs.getString(4);
            LocalDate localDate = LocalDate.parse(date, formatter);
            p_dateOfBirthDatePicker.setValue(localDate);

            p_addressTextField.setText(rs.getString(5));
            p_addressSecondTextField.setText(rs.getString(6));
            p_cityTextField.setText(rs.getString(7));
            p_stateChoiceBox.setValue(rs.getString(8));
            p_countryTextField.setText(rs.getString(9));
            p_phoneNuberTextField.setText(rs.getString(10));
            p_insuranceProviderTextField.setText(rs.getString(11));
            p_policyNumberTextField.setText(rs.getString(12));
            p_docIDTextField.setText(rs.getString(13));
            p_pharmacyIDTextField.setText(rs.getString(14));
            p_notesTextArea.setText(rs.getString(15));

            conn.close();
            p_saveButton.setDisable(false);
            p_deleteButton.setDisable(false);

        } catch (SQLException e) {
            Alert alert = new Alert(AlertType.ERROR, "That patient ID does not exist.");
            alert.showAndWait();
        }
    }

    @FXML
    private void p_deleteButton_OnAction(ActionEvent event) {
        if (p_patientIDTextField.getText().equals("")) {
            Alert alert = new Alert(AlertType.ERROR, "Patient must be selected"
                    + " and in edit mode to be deleted.");
            alert.showAndWait();
            return;
        }

        String idNum = p_patientIDTextField.getText();
        if (validPatientEntry(idNum) == true) {
            Alert alert = new Alert(AlertType.CONFIRMATION, "Are you sure you want to delete this patient?");
            alert.showAndWait();
            try {
                Connection conn = DriverManager.getConnection(url, props);
                String sqlStatement1 = "DELETE FROM public.patients WHERE patient_id = " + idNum + ";";
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sqlStatement1);
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
            if (validPatientEntry(idNum) == false) {
                alert = new Alert(AlertType.INFORMATION, "Entry deleted.");
                alert.showAndWait();
                clearPatientFields();
                p_deleteButton.setDisable(true);
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR, "That patient ID does not exist.");
            alert.showAndWait();
        }

    }

    @FXML
    private void p_saveButton_OnAction(ActionEvent event) {
        String idNum = p_patientIDTextField.getText();

        if (validPatientEntry(idNum) == false) {
            try {
                Connection conn = DriverManager.getConnection(url, props);
                String sqlStatement = "INSERT INTO public.patients(\n"
                        + "patient_id, patient_firstname, patient_lastname, "
                        + "patient_dateofbirth, patient_addressline1, patient_addressline2, "
                        + "patient_city, patient_state, patient_country, "
                        + "patient_phonenumber, patient_insuranceprovider, "
                        + "patient_policynumber, patient_doctorid, patient_pharmacyid, "
                        + "patient_notes)\nVALUES (";
                sqlStatement += p_patientIDTextField.getText() + ", '";
                sqlStatement += p_firstNameTextField.getText() + "', '";
                sqlStatement += p_lastNameTextField.getText() + "', '";
                sqlStatement += p_dateOfBirthDatePicker.getValue().toString() + "', '";
                sqlStatement += p_addressTextField.getText() + "', '";
                sqlStatement += p_addressSecondTextField.getText() + "', '";
                sqlStatement += p_cityTextField.getText() + "', '";
                sqlStatement += p_stateChoiceBox.getValue() + "', '";
                sqlStatement += p_countryTextField.getText() + "', ";
                sqlStatement += p_phoneNuberTextField.getText() + ", '";
                sqlStatement += p_insuranceProviderTextField.getText() + "', '";
                sqlStatement += p_policyNumberTextField.getText() + "', ";
                sqlStatement += p_docIDTextField.getText() + ", ";
                sqlStatement += p_pharmacyIDTextField.getText() + ", '";
                sqlStatement += p_notesTextArea.getText() + "');";

                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sqlStatement);
                conn.close();
                p_saveButton.setDisable(true);
                
                updatePatientTable();

                Alert alert = new Alert(AlertType.INFORMATION, "New entry saved.");
                alert.showAndWait();                
            } catch (SQLException e) {
                System.out.println(e.toString());
                Alert alert = new Alert(AlertType.ERROR, "Error saving new entry. Double check that "
                        + "all required fields are filled out and are in correct format.");
                alert.showAndWait();
            }
        } else if (validPatientEntry(idNum) == true) {
            try {
                Connection conn = DriverManager.getConnection(url, props);
                String sqlStatement = "UPDATE public.patients\nSET ";
                sqlStatement += "patient_id=" + p_patientIDTextField.getText();
                sqlStatement += ", patient_firstname= '" + p_firstNameTextField.getText();
                sqlStatement += "', patient_lastname='" + p_lastNameTextField.getText();
                sqlStatement += "', patient_dateofbirth='" + p_dateOfBirthDatePicker.getValue().toString();
                sqlStatement += "', patient_addressline1='" + p_addressTextField.getText();
                sqlStatement += "', patient_addressline2='" + p_addressSecondTextField.getText();
                sqlStatement += "', patient_city='" + p_cityTextField.getText();
                sqlStatement += "', patient_state='" + p_stateChoiceBox.getValue();
                sqlStatement += "', patient_country='" + p_countryTextField.getText();
                sqlStatement += "', patient_phonenumber=" + p_phoneNuberTextField.getText();
                sqlStatement += ", patient_insuranceprovider='" + p_insuranceProviderTextField.getText();
                sqlStatement += "', patient_policynumber='" + p_policyNumberTextField.getText();
                sqlStatement += "', patient_doctorid=" + p_docIDTextField.getText();
                sqlStatement += ", patient_pharmacyid=" + p_pharmacyIDTextField.getText();
                sqlStatement += ", patient_notes='" + p_notesTextArea.getText();
                sqlStatement += "' WHERE patient_id=" + idNum + ";";

                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sqlStatement);
                conn.close();
                p_saveButton.setDisable(true);
                p_deleteButton.setDisable(true);
                
                updatePatientTable();
                
                Alert alert = new Alert(AlertType.INFORMATION, "Edit saved.");
                alert.showAndWait();
            } catch (SQLException e) {
                System.out.println(e.toString());
                Alert alert = new Alert(AlertType.ERROR, "Error saving changes. Double check that "
                        + "all required fields are filled out and are in correct format.");
                alert.showAndWait();
            }
        }
    }

    private void initializePatientTableView() throws SQLException {

        TableColumn idCol = new TableColumn("Patient ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("patientID"));

        TableColumn fnameCol = new TableColumn("First Name");
        fnameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn lnameCol = new TableColumn("Last Name");
        lnameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn dobCol = new TableColumn("Date of Birth");
        dobCol.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));

        TableColumn ad1Col = new TableColumn("Address");
        ad1Col.setCellValueFactory(new PropertyValueFactory<>("addressLine1"));

        TableColumn ad2Col = new TableColumn("Address Line 2");
        ad2Col.setCellValueFactory(new PropertyValueFactory<>("addressLine2"));

        TableColumn cityCol = new TableColumn("City");
        cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));

        TableColumn stateCol = new TableColumn("State");
        stateCol.setCellValueFactory(new PropertyValueFactory<>("state"));

        TableColumn countryCol = new TableColumn("Country");
        countryCol.setCellValueFactory(new PropertyValueFactory<>("country"));

        TableColumn phoneCol = new TableColumn("Phone Number");
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        TableColumn insurCol = new TableColumn("Insurance Provider");
        insurCol.setCellValueFactory(new PropertyValueFactory<>("insuranceProvider"));

        TableColumn policyCol = new TableColumn("Policy Number");
        policyCol.setCellValueFactory(new PropertyValueFactory<>("policyNumber"));

        TableColumn docIDCol = new TableColumn("Primary Doctor ID");
        docIDCol.setCellValueFactory(new PropertyValueFactory<>("doctorID"));

        TableColumn pharmIDCol = new TableColumn("Pharmacy ID");
        pharmIDCol.setCellValueFactory(new PropertyValueFactory<>("pharmacyID"));

        p_TableView.getColumns().addAll(idCol, fnameCol, lnameCol, dobCol,
                ad1Col, ad2Col, cityCol, stateCol, countryCol, phoneCol,
                insurCol, policyCol, docIDCol, pharmIDCol);

        updatePatientTable();
    }

    private void updatePatientTable() throws SQLException {
        p_TableView.getItems().clear();

        Connection conn = DriverManager.getConnection(url, props);
        String sqlStatement = "SELECT * FROM public.patients ORDER BY patient_id;";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sqlStatement);

        while (rs.next()) {
            Patient patient = new Patient();
            patient.setPatientID(rs.getString(1));
            patient.setFirstName(rs.getString(2));
            patient.setLastName(rs.getString(3));

            patient.setDateOfBirth(rs.getString(4));

            patient.setAddressLine1(rs.getString(5));
            patient.setAddressLine2(rs.getString(6));
            patient.setCity(rs.getString(7));
            patient.setState(rs.getString(8));
            patient.setCountry(rs.getString(9));
            patient.setPhoneNumber(rs.getString(10));
            patient.setInsuranceProvider(rs.getString(11));
            patient.setPolicyNumber(rs.getString(12));
            patient.setDoctorID(rs.getString(13));
            patient.setPharmacyID(rs.getString(14));

            p_TableView.getItems().add(patient);
        }
        conn.close();
    }

    private boolean validPatientEntry(String idNum) {
        try {
            Connection conn = DriverManager.getConnection(url, props);
            String sqlStatement = "SELECT * FROM Public.patients WHERE "
                    + "patient_id=" + idNum + ";";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlStatement);

            conn.close();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }

    private void clearPatientFields() {
        p_patientIDTextField.setText("");
        p_firstNameTextField.setText("");
        p_lastNameTextField.setText("");

        p_dateOfBirthDatePicker.setValue(null);

        p_addressTextField.setText("");
        p_addressSecondTextField.setText("");
        p_cityTextField.setText("");
        p_stateChoiceBox.setValue(null);
        p_countryTextField.setText("");
        p_phoneNuberTextField.setText("");
        p_insuranceProviderTextField.setText("");
        p_policyNumberTextField.setText("");
        p_docIDTextField.setText("");
        p_pharmacyIDTextField.setText("");
        p_notesTextArea.setText("");
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

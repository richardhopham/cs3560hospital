/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmltestapp;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
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
    private TableView<Doctor> d_TableView;
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
    private Label a_patientIDLabel;
    
    @FXML
    private TextField a_patientIDTextField;
    
    @FXML 
    private Label a_doctorIDLabel;
    
    @FXML
    private TextField a_doctorIDTextField;
    
    @FXML
    private Label a_dateLabel;
    
    @FXML
    private DatePicker a_dateDatePicker;
    
    @FXML
    private Label a_descriptionLabel;
    
    @FXML
    private TextArea a_descriptionTextArea;
    
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
    private TableView<Appointment> a_TableView;
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
            initializeDoctorTableView();
            initializeAppointmentTableView();
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
        d_saveButton.setDisable(false);

        String idNum = d_doctorIDTextField.getText();
        try {
            Connection conn = DriverManager.getConnection(url, props);
            String sqlStatement = "";
            if (!validDoctorEntry(idNum)) {
                sqlStatement = "INSERT INTO public.doctors(\n" +
                        "doctor_id, first_name, office_phone_1, office_phone_2, " +
                        "email, fax_number, notes, last_name) \n" +
                        "VALUES(" + d_doctorIDTextField.getText() + ", '" + d_firstNameTextField.getText() + "', '" +
                        d_officePhoneNo1TextField.getText() + "', '" +
                        d_officePhoneNo2TextField.getText() + "', '" + d_emailAddressTextField.getText() + "', '" +
                        d_faxNoTextField.getText() + "', '" + d_notesTextField.getText() + "', '" +
                        d_lastNameTextField.getText()+ "');";
            } else {
                sqlStatement = "UPDATE public.doctors \nSET " +
                        "doctor_id = " + d_doctorIDTextField.getText() + ", " +
                        "first_name = '" + d_firstNameTextField.getText() + "', " +
                        "last_name = '" + d_lastNameTextField.getText() + "', " +
                        "office_phone_1 = '" + d_officePhoneNo1TextField.getText() + "', " +
                        "office_phone_2 = '" + d_officePhoneNo2TextField.getText() + "', " +
                        "email = '" + d_emailAddressTextField.getText() + "', " +
                        "fax_number = '" + d_faxNoTextField.getText() + "', " +
                        "notes = '" + d_notesTextField.getText() + "' WHERE doctor_id = " + idNum + ";";
            }

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sqlStatement);
            conn.close();
            d_saveButton.setDisable(true);
            updateDoctorTable();
            clearDoctorFields();
            Alert alert = new Alert(AlertType.INFORMATION, "New entry saved.");
            alert.showAndWait();


        } catch (SQLException e){
            System.out.println(e.getMessage());
            Alert alert = new Alert(AlertType.ERROR, "Error saving new entry. Double check that "
                    + "all required fields are filled out and are in correct format.");
            alert.showAndWait();
        }
    }

    @FXML
    private void d_editButton_OnAction(ActionEvent event) {
        String idNum;
        try {
            idNum = d_TableView.getSelectionModel().getSelectedItem().getDoctorID();
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR, "Select a Doctor to edit.");
            alert.showAndWait();
            return;
        }


        String url = "jdbc:postgresql://database-1.cakeqdu3h1oe.us-west-1.rds.amazonaws.com:5432/";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "password");

        try {
            Connection conn = DriverManager.getConnection(url, props);
            String sqlStatement = "SELECT * FROM public.doctor WHERE doctor_id = " + idNum + ";";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlStatement);
            rs.next();

            d_doctorIDTextField.setText(rs.getString(1));
            d_firstNameTextField.setText(rs.getString(2));
            d_lastNameTextField.setText(rs.getString(3));

            d_officePhoneNo1TextField.setText(rs.getString(4));
            d_officePhoneNo2TextField.setText(rs.getString(5));
            d_emailAddressTextField.setText(rs.getString(6));
            d_faxNoTextField.setText(rs.getString(7));
            d_notesTextField.setText(rs.getString(8));

            conn.close();
            d_saveButton.setDisable(false);
            d_deleteButton.setDisable(false);

        } catch (SQLException e) {
            Alert alert = new Alert(AlertType.ERROR, "That doctor ID does not exist.");
            alert.showAndWait();
        }
    }

    @FXML
    private void d_deleteButton_OnAction(ActionEvent event) {
    }

    @FXML
    private void d_saveButton_OnAction(ActionEvent event) {


    }

    private void clearDoctorFields(){
        d_doctorIDTextField.setText("");
        d_firstNameTextField.setText("");
        d_lastNameTextField.setText("");
        d_doctorIDTextField.setText("");
        d_emailAddressTextField.setText("");
        d_officePhoneNo1TextField.setText("");
        d_faxNoTextField.setText("");
        d_officePhoneNo2TextField.setText("");
        d_notesTextField.setText("");
    }

    private void initializeDoctorTableView() throws SQLException{
        TableColumn idCol = new TableColumn("Doctor ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("doctorID"));

        TableColumn fnameCol = new TableColumn("First Name");
        idCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn lnameCol = new TableColumn("Last Name");
        idCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn phone1Col = new TableColumn("Office Phone 1");
        idCol.setCellValueFactory(new PropertyValueFactory<>("phone1"));

        TableColumn phone2Col = new TableColumn("Office Phone 2");
        idCol.setCellValueFactory(new PropertyValueFactory<>("phone2"));

        TableColumn faxNoCol = new TableColumn("Fax Number");
        idCol.setCellValueFactory(new PropertyValueFactory<>("faxNo"));

        TableColumn emailCol = new TableColumn("Email Address");
        idCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        TableColumn notesCol = new TableColumn("Notes");
        idCol.setCellValueFactory(new PropertyValueFactory<>("notes"));

        d_TableView.getColumns().addAll(idCol, fnameCol, lnameCol, phone1Col,
                phone2Col, faxNoCol, emailCol, notesCol);

        updateDoctorTable();

    }

    private void updateDoctorTable() throws SQLException{
        d_TableView.getItems().clear();

        Connection conn = DriverManager.getConnection(url, props);
        String sqlStatement = "SELECT * FROM public.doctors ORDER BY doctor_id;";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sqlStatement);
        while(rs.next()){
            Doctor doctor = new Doctor();
            doctor.setDoctorID(rs.getString(1));
            doctor.setFirstName(rs.getString(2));
            doctor.setPhone1(rs.getString(3));
            doctor.setPhone2(rs.getString(4));
            doctor.setEmail(rs.getString(5));
            doctor.setFaxNo(rs.getString(6));
            doctor.setNotes(rs.getString(7));
            doctor.setLastName(rs.getString(8));
            d_TableView.getItems().add(doctor);
        }
        conn.close();

    }

    private boolean validDoctorEntry(String idNum) {
        try {
            Connection conn = DriverManager.getConnection(url, props);
            String sqlStatement = "SELECT * FROM Public.doctors WHERE "
                    + "doctor_id=" + idNum + ";";
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

    @FXML
    private void a_newButton_OnAction(ActionEvent event) {
    	clearAppointmentFields();
    	a_saveButton.setDisable(false);
    }

    @FXML
    private void a_editButton_OnAction(ActionEvent event) {
    	String patientIDNum;
    	String doctorIDNum;
    	String dateNum; 
    	try {
    		patientIDNum = a_TableView.getSelectionModel().getSelectedItem().getPatientID();
    		doctorIDNum = a_TableView.getSelectionModel().getSelectedItem().getDoctorID();
    		dateNum = a_TableView.getSelectionModel().getSelectedItem().getDate();
    	} catch(Exception e) {
    		Alert alert = new Alert(AlertType.ERROR, "Select an Appointment to edit.");
    		alert.showAndWait();
    		return;
    	}
    	
        String url = "jdbc:postgresql://database-1.cakeqdu3h1oe.us-west-1.rds.amazonaws.com:5432/";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "password");
    	
    	try {
            Connection conn = DriverManager.getConnection(url, props);
            String sqlStatement = "SELECT * FROM public.appointments WHERE patient_id = " + patientIDNum + " AND doctor_id = " + doctorIDNum + " AND date = (DATE '" + dateNum + "');";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlStatement);
            rs.next();
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
            String date = rs.getString(1);
            LocalDate localdate = LocalDate.parse(date, formatter);
            a_dateDatePicker.setValue(localdate);
            
            a_patientIDTextField.setText(rs.getString(2));
            a_descriptionTextArea.setText(rs.getString(3));
            a_doctorIDTextField.setText(rs.getString(4));
            
            conn.close();
            a_saveButton.setDisable(false);
            a_deleteButton.setDisable(false);
            
            
    	} catch(SQLException e) {
    		Alert alert = new Alert(AlertType.ERROR, "That Appointment does not exist");
    		alert.showAndWait();
    	}
    }

    @FXML
    private void a_deleteButton_OnAction(ActionEvent event) throws SQLException {
    	if(a_patientIDTextField.getText().equals("") || a_doctorIDTextField.getText().equals("") || a_dateDatePicker.getValue().equals(null)) {
            Alert alert = new Alert(AlertType.ERROR, "Appointment must be selected"
                    + " and in edit mode to be deleted.");
            alert.showAndWait();
            return;
    	}
    	
    	String patientIDNum = a_patientIDTextField.getText();
    	String doctorIDNum = a_doctorIDTextField.getText();
    	String dateNum = a_dateDatePicker.getValue().toString();
    	
    	if(validAppointmentEntry(patientIDNum, doctorIDNum, dateNum)) {
    		Alert alert = new Alert(AlertType.CONFIRMATION, "Are you sure you want to delete this appointment?");
    		alert.showAndWait();
    		try {
    			Connection conn = DriverManager.getConnection(url, props);
    			String sqlStatement = "DELETE FROM public.appointments WHERE patient_ID = " + patientIDNum 
    					+ "AND doctor_id = " + doctorIDNum + "AND date = (DATE '" + dateNum + "');";
    			Statement stmt = conn.createStatement();
    			stmt.executeUpdate(sqlStatement);
    			conn.close();
    		} catch(SQLException e) {
    			System.out.println(e.toString());
    		}
    		if(validAppointmentEntry(patientIDNum, doctorIDNum, dateNum)) {
    			alert = new Alert(AlertType.INFORMATION, "Entry deleted.");
    			alert.showAndWait();
    			clearAppointmentFields();
    			a_deleteButton.setDisable(true);
    		}
    	} else {
    		Alert alert = new Alert(AlertType.ERROR, "That appointment does not exist.");
    		alert.showAndWait();
    	}
    	updateAppointmentTable();
    }

    private boolean validAppointmentEntry(String patientID, String doctorID, String date) {
        try {
            Connection conn = DriverManager.getConnection(url, props);
            String sqlStatement = "SELECT * FROM public.appointments WHERE patient_id = " 
            + patientID + " AND doctor_id = " + doctorID + " AND date = (DATE '" + date + "');";
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
    
    @FXML
    private void a_saveButton_OnAction(ActionEvent event) {
    	String patientIDNum = a_patientIDTextField.getText();
    	String doctorIDNum = a_doctorIDTextField.getText();
    	String dateNum = a_dateDatePicker.getValue().toString();
    	
    	if(!validAppointmentEntry(patientIDNum, doctorIDNum, dateNum)) {
    		try {
                Connection conn = DriverManager.getConnection(url, props);
                String sqlStatement = "INSERT INTO public.appointments(date, patient_id, reason_for_appointment, doctor_id) VALUES ('";
                
                sqlStatement += a_dateDatePicker.getValue().toString() + "', ";
                sqlStatement += a_patientIDTextField.getText() + ", '"; 
                sqlStatement += a_descriptionTextArea.getText() + "', ";
                sqlStatement += a_doctorIDTextField.getText();
                sqlStatement += ");";
                
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sqlStatement);
                conn.close();
                a_saveButton.setDisable(true);
                
                updateAppointmentTable();
                
                Alert alert = new Alert(AlertType.INFORMATION, "New entry saved.");
                alert.showAndWait(); 

    		}  catch (SQLException e) {
                System.out.println(e.toString());
                Alert alert = new Alert(AlertType.ERROR, "Error saving new entry. Double check that "
                        + "all required fields are filled out and are in correct format.");
                alert.showAndWait();
            }
    	} else {
    		try {
    			Connection conn = DriverManager.getConnection(url, props);
    			String sqlStatement = "UPDATE public.appointments SET ";
    			sqlStatement += "date = (DATE '" + a_dateDatePicker.getValue().toString() + "'), ";
    			sqlStatement += "patient_id = " + a_patientIDTextField.getText() + ", ";
    			sqlStatement += "reason_for_appointment = '" + a_descriptionTextArea.getText() + "', ";
    			sqlStatement += "doctor_id = " + a_doctorIDTextField.getText();
    			sqlStatement += " WHERE ";
    			sqlStatement += "patient_id = " + patientIDNum;
    			sqlStatement += " AND doctor_id = " + doctorIDNum;
    			sqlStatement += " AND date = (DATE '" + dateNum + "');";
    			
    			Statement stmt = conn.createStatement();
    			stmt.executeUpdate(sqlStatement);
    			conn.close();
    			a_saveButton.setDisable(true);
    			a_deleteButton.setDisable(true);
    			
    			updateAppointmentTable();
    			
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

    @SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	private void initializeAppointmentTableView() throws SQLException {
    	TableColumn patientIDCol = new TableColumn("Patient ID");
    	patientIDCol.setCellValueFactory(new PropertyValueFactory<>("patientID"));
    	
    	TableColumn doctorIDCol = new TableColumn("Doctor ID");
    	doctorIDCol.setCellValueFactory(new PropertyValueFactory<>("doctorID"));
    	
    	TableColumn dateCol = new TableColumn("Date");
    	dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
    	
    	TableColumn descriptionCol = new TableColumn("Description");
    	descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
    	
    	a_TableView.getColumns().addAll(patientIDCol, doctorIDCol, dateCol, descriptionCol);
    	
    	updateAppointmentTable();
    }
    
    private void updateAppointmentTable() throws SQLException {
    	a_TableView.getItems().clear();
    	
        Connection conn = DriverManager.getConnection(url, props);
        String sqlStatement = "SELECT * FROM public.appointments ORDER BY date;";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sqlStatement);
        
        while(rs.next()) {
        	Appointment app = new Appointment();
        	app.setDate(rs.getString(1));
        	app.setPatientID(rs.getString(2));
        	app.setDescription(rs.getString(3));
        	app.setDoctorID(rs.getString(4));
        	
        	a_TableView.getItems().add(app);
        }
        conn.close();
    }
    
    private void clearAppointmentFields() {
    	a_patientIDTextField.setText("");
    	a_doctorIDTextField.setText("");
    	a_dateDatePicker.setValue(null);
    	a_descriptionTextArea.setText("");
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpd;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.collections.FXCollections;
import javafx.scene.control.*;
import java.net.URL;
import javafx.collections.*;
import javafx.fxml.*;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Request_For_BloodController implements Initializable {

    /**
     * Initializes the controller class.
     */
      
    @FXML
    private AnchorPane Request_For_Blood;
    /**
     * Initializes the controller class.
     */ 
     @FXML
   public ComboBox<String> blood_group;
   ObservableList<String> Blood_Group = FXCollections.observableArrayList("O+","O-","A+","A-","B+","B-","AB+","AB-");
   @FXML
   public ComboBox<String> district;
   ObservableList<String> District = FXCollections.observableArrayList(
"Barguna",
"Barisal",
"Bhola",
"Jhalokati",
"Patuakhali", 
"Pirojpur", 
"Bandarban", 
"Brahmanbaria", 
"Chandpur", 
"Chittagong", 
"Comilla", 
"Cox's Bazar", 
"Feni",
"Khagrachhari", 
"Lakshmipur", 
"Noakhali" ,
"Rangamati" ,
"Dhaka" ,
"Faridpur" ,
"Gazipur" ,
"Gopalganj ",
"Jamalpur " ,
"Kishoreganj " ,
"Madaripur " ,
"Manikganj" ,
"Munshiganj " ,
"Mymensingh " ,
"Narayanganj " ,
"Narsingdi " ,
"Netrakona " ,
"Rajbari " ,
"Shariatpur ",
"Sherpur " ,
"Tangail " ,
"Bagerhat ",
"Chuadanga ",
"Jessore ",
"Jhenaidah ",
"Khulna",
"Kushtia" ,
"Magura ",
"Meherpur ",
"Narail ",
"Satkhira ",
"Bogra ",
"Joypurhat ",
"Naogaon ",
"Natore ",
"Nawabganj",
"Pabna ",
"Rajshahi ",
"Sirajganj ",
"Dinajpur ",
"Gaibandha ",
"Kurigram ",
"Lalmonirhat ",
"Nilphamari",
"Panchagarh ",
"Rangpur ",
"Thakurgaon ",
"Habiganj ",
"Moulvibazar ",
"Sunamganj ",
"Sylhet ");
    @FXML
   public ComboBox<String> upazila;
   ObservableList<String> Upazila = FXCollections.observableArrayList("Dhamrai " ,
"Dohar " ,
"Keraniganj " ,
"Nawabganj ",
"Savar " ,
"Alfadanga " ,
"Bhanga " ,
"Boalmari " ,
"Charbhadrasan " ,
"Faridpur Sadar" ,
"Madhukhali " ,
"Nagarkanda " ,
"Sadarpur " ,
"Saltha " ,
"Gazipur Sadar " ,
"Kaliakair " ,
"Kaliganj " ,
"Kapasia " ,
"Sreepur " ,
"Gopalganj Sadar " ,
"Kashiani " ,
"Kotalipara " ,
"Muksudpur " ,
"Tungipara " ,
"Baksiganj " ,
"Dewanganj " ,
"Islampur" ,
"Jamalpur " ,
"Madarganj " ,
"Melandaha " ,
"Sarishabari " ,
"Astagram ", 
"Bajitpur ",
"Bhairab " ,
"Hossainpur " ,
"Itna " ,
"Karimganj " ,
"Katiadi ",
"Kishoreganj " ,
"Kuliarchar" ,
"Mithamain " ,
"Nikli " ,
"Pakundia " ,
"Tarail ",
"Rajoir " ,
"Madaripur Sadar " ,
"Kalkini ",
"Shibchar " ,
"Daulatpur " ,
"Ghior " ,
"Harirampur " ,
"Manikgonj Sadar ", 
"Saturia " ,
"Shivalaya " ,
"Singair" ,
"Gazaria",
"Lohajang");
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       blood_group.setItems(Blood_Group);
       district.setItems(District);
        upazila.setItems(Upazila);
    }    
    
    @FXML
   private void Request_action(ActionEvent event) throws IOException {
   Parent pane=FXMLLoader.load(getClass().getResource("BloodBank.fxml"));
            Request_For_Blood.getChildren().setAll(pane);
    }
  
           
    //@FXML
    //private void Donor_List_action(ActionEvent event) {
    //}
   // @FXML
    //private void Request_List_action(ActionEvent event) {
    //}
   // @FXML
   // private void Family_Blood_Tree_action(ActionEvent event) {
   // }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @FXML
    private void Back_action(ActionEvent event) throws IOException {
   Parent pane=FXMLLoader.load(getClass().getResource("BloodBank.fxml"));
            Request_For_Blood.getChildren().setAll(pane);
    }
    
    
       
    
    @FXML
    private void Logout_Action(ActionEvent event) throws IOException {
   Parent pane=FXMLLoader.load(getClass().getResource("Login.fxml"));
            Request_For_Blood.getChildren().setAll(pane);
    }
}

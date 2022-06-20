package com.example.sklep;

import Reczy.Przedmiot;
import Reczy.Telewizor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static javafx.application.Platform.exit;

public class Pasek {
    protected static int idd = 1;
    public static String  im, naz, lacz, has, nik;
    static ArrayList<String> listka = new ArrayList<String>();
    static ArrayList<String> listkaa = new ArrayList<String>();
    static ArrayList<Przedmiot> lista = new ArrayList<Przedmiot>();
    static {        lista.add(new Telewizor("FHD", 28, "LCD", "Samsung", false, false, false, 600));
        lista.add(new Telewizor("FHD", 28, "LCD", "Sony", false, false, false, 600));
        lista.add(new Telewizor("FHD", 28, "LCD", "LG", false, false, false, 600));
        lista.add(new Telewizor("FHD", 32, "LCD", "Sony", false, false, false, 800));
        lista.add(new Telewizor("FHD", 32, "LCD", "Samsung", true, false, false, 1000));
        lista.add(new Telewizor("FHD", 36, "QLED", "LG", true, false, false, 1200));
        lista.add(new Telewizor("FHD", 36, "LCD",  "LG", true, false, false, 1200 ));
        lista.add(new Telewizor("FHD", 40, "LCD", "Samsung", false, false, false, 1400));
        lista.add(new Telewizor("FHD", 36, "QLED", "Samsung", true, true, true, 1600));
        lista.add(new Telewizor("UHD", 40, "QLED", "LG", true, false, true, 1650));
        lista.add(new Telewizor("FHD", 40, "QLED", "Sony", true,  false, true, 1750));
        lista.add(new Telewizor("UHD", 40, "QLED", "Sony", true, false, true, 1750));
        lista.add(new Telewizor("UHD", 42, "QLED", "LG", true, false, true, 1800));
        lista.add(new Telewizor("UHD", 42, "LCD", "Sony", true, true, true, 1800));
        lista.add(new Telewizor("UHD", 42, "LCD", "Samsung", true, true, true, 1850));
        lista.add(new Telewizor("UHD", 46, "QLED", "Samsung", true, true, true, 2100));
        lista.add(new Telewizor("4K", 52, "QLED", "Samsung", true, true, true, 3100));
        lista.add(new Telewizor("4K", 52, "QLED", "LG", true, true, true, 3200));
        lista.add(new Telewizor("4K", 56, "QLED", "LG", true, true, true, 3800));
        lista.add(new Telewizor("4K", 60, "QLED", "Sony", true, true, true, 5000));
        lista.add(new Telewizor("4K", 60, "QLED", "Samsung", true, true, true, 5500)); }
    static ArrayList<Przedmiot> wyszukarka = new ArrayList<>();
    @FXML
    public ListView wyszka;
    @FXML
    public ListView wyszukiwarka;
    @FXML
    public ListView koszyczek;
    @FXML
    private CheckBox HDR;
    @FXML
    private CheckBox WIFI;
    @FXML
    private CheckBox SmartTV;
    @FXML
    private ToggleGroup g1;
    @FXML
    private ToggleGroup g2;
    @FXML
    private ToggleGroup g3;
    @FXML
    private ToggleGroup g4;
    @FXML
    private TextField imie;
    @FXML
    private TextField nazwisko;
    @FXML
    private TextField nick;
    @FXML
    private TextField haslo;
    @FXML
    public Label label;
    @FXML
    public Button przycisk;
    //Dodawanie
    @FXML
    private ToggleGroup g8;
    @FXML
    private ToggleGroup g9;
    @FXML
    private ToggleGroup g10;
    @FXML
    private CheckBox HDR1;
    @FXML
    private CheckBox WIFI1;
    @FXML
    private CheckBox SmartTV1;
    @FXML
    private TextField wielk;
    @FXML
    private TextField cena;


    @FXML
    protected void zamknij()
    {
        exit();
    }

    public void dodanie()
    {
        String Pier = ((RadioButton)g8.getSelectedToggle()).getText();
        String Drug = ((RadioButton)g9.getSelectedToggle()).getText();
        String Trzec = ((RadioButton)g10.getSelectedToggle()).getText();
        int czwa = Integer.valueOf(wielk.getText());
        Boolean Piat = HDR1.isSelected();
        Boolean Sz = WIFI1.isSelected();
        Boolean Sied = SmartTV1.isSelected();
        int cenny =  Integer.valueOf(cena.getText());
        System.out.println(Pier + Drug + Trzec + czwa + Piat + Sz + Sied + cenny);
        lista.add(new Telewizor(Pier, czwa, Drug, Trzec, Piat, Sz, Sied, cenny));
        System.out.println();
    }


    public void dane()
    {
        im = imie.getText();
        naz = nazwisko.getText();
        lacz = imie + naz;
        System.out.println(im + naz);

        label.setText(im + " " + naz);
        System.out.println(label);

    }

    public void odczyt()
    {
        label.setText(im + " " + naz);
    }
    public void admin()
    {
        nik = nick.getText();
        has = haslo.getText();
        if(nik.equals("Admin"))
        {
            if(has.equals("root"))
            {
                przycisk.setDisable(false);
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Błąd");
                alert.setHeaderText("Błędny nick lub hasło!");

                alert.showAndWait();
            }
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Błąd");
            alert.setHeaderText("Błędny nick lub hasło!");

            alert.showAndWait();
        }

    }



    @FXML
    protected void zaznacz()
    {

        listka.add(idd + ". " + String.valueOf(wyszka.getSelectionModel().getSelectedItem()));
        idd++;
    }

    public void koszyccc() {
        System.out.println(listka);
        koszyczek.getItems().clear();
        koszyczek.getItems().addAll(listka);


    }



    public void usun()
    {
        int a = koszyczek.getSelectionModel().getSelectedIndex();
        listka.remove(a);
        System.out.println(a);
        koszyczek.getItems().clear();
        koszyczek.getItems().addAll(listka);

    }


    @FXML
    public void telewizory()
    {
        wyszukiwarka.getItems().clear();
        System.out.println(lista);
        wyszukiwarka.getItems().addAll(lista);

    }

    @FXML
    public void wyszukaj()
    {
        int pomocnicza1 = 0;
        int pomocnicza2 = 0;
        System.out.println(lista);
        System.out.println(lista.get(12).getRozdzielczosc());
        System.out.println(((RadioButton)g1.getSelectedToggle()).getText());

        String zmienna = String.valueOf(((RadioButton)g2.getSelectedToggle()).getText());
        if(zmienna.equals("48+"))
        {
             pomocnicza1 = 48;
             pomocnicza2 = 70;
        }
        else {
            String[] parts = zmienna.toString().split("-");
            String part1 = parts[0];
            String part2 = parts[1];
            pomocnicza1 = Integer.valueOf(part1);
            pomocnicza2 = Integer.valueOf(part2);
        }
        wyszka.getItems().clear();
       for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getRozdzielczosc().equals (((RadioButton) g1.getSelectedToggle()).getText())) {
                if(lista.get(i).getRozmiar() >= pomocnicza1 && lista.get(i).getRozmiar() <= pomocnicza2)
                {

                    if(String.valueOf(lista.get(i).getWyswietlacz()).equals(String.valueOf(((RadioButton) g3.getSelectedToggle()).getText())))
                    {
                        if(lista.get(i).getMarka().equals(((RadioButton) g4.getSelectedToggle()).getText()))
                        {
                            if(lista.get(i).isHDR() == HDR.isSelected())
                            {
                                if(lista.get(i).isSmart() == SmartTV.isSelected())
                                {
                                 if(lista.get(i).isWIFI() == WIFI.isSelected())
                                 {

                                     wyszka.getItems().addAll(lista.get(i));
                                     System.out.println(wyszka);

                                 }
                                }
                            }
                        }
                    }
                }
            }

           }
        System.out.println(wyszka);

    }

    public void powiadomienie()
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("");
        alert.setHeaderText("Sklep internetowy u Leśnika!");
        alert.setContentText("W sklepie internetowym możliwe jest dodanie swoich danych osobowych."  +
                        "Dodane zostały takie usprawnienia jak wyszukiwarka, spis telewizorów i koszyk.");

        alert.showAndWait();
    }



    @FXML
    public void startowaScena(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
        Stage scene = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene.setScene(new Scene(root));
        scene.show();
    }

    @FXML
    public void kosz(ActionEvent event) throws IOException {
        Parent root1 = FXMLLoader.load(getClass().getResource("Koszyk.fxml"));
        Stage scene1 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene1.setScene(new Scene(root1));

        scene1.show();
    }

    @FXML
    public void wyszukiwarka(ActionEvent event) throws IOException {
        Parent root2 = FXMLLoader.load(getClass().getResource("Wyszukiwarka.fxml"));
        Stage scene2 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene2.setScene(new Scene(root2));
        scene2.show();
    }
    @FXML
    public void dodawanko(ActionEvent event) throws IOException {
        Parent root3 = FXMLLoader.load(getClass().getResource("Strona_Dodawania.fxml"));
        Stage scene3 = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene3.setScene(new Scene(root3));
        scene3.show();
    }

}
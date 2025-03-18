package com.example.productmanager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class ProductController {

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private ListView<Product> productList;

    private ObservableList<Product> products = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // This method is automatically called after the FXML file has been loaded.
        // You can perform any initialization here.
        productList.setItems(products); // Bind the ListView to the ObservableList
    }

    @FXML
    void addProduct(ActionEvent event) {
        try {
            String name = nameTextField.getText();
            double price = Double.parseDouble(priceTextField.getText());

            Product newProduct = new Product(name, price);
            products.add(newProduct);

            // Clear the input fields
            nameTextField.clear();
            priceTextField.clear();

        } catch (NumberFormatException e) {
            // Handle invalid input (e.g., non-numeric price)
            System.err.println("Invalid price format."); // Replace with a proper error message to the user
        }
    }
}
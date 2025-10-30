package controller;

import dao.ClienteDao;
import model.Cliente;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClienteController {
    @FXML private TavleView<Cliente> tableView;
    @FXML private TableColumn<Cliente, Integer> colId;
    @FXML private TableColumn<Cliente, String> colName;
    @FXML private TableColumn<Cliente, String> colEmail;
    @FXML private TableColumn<Cliente, String> colTelefone;
    @FXML private TextField txtNome, txtEmail, txtTelefone, txtEndereco;

    private ObservableList<Cliente> clienteLista;
    private ClienteDAO clienteDAO;

}


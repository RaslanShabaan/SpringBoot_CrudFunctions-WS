package com.example.demo.Dao;


import com.example.demo.Entities.Client;
import java.util.List;

public interface ClientDao {



    public void InsertClient (Client client) ;
    public Client SelectClient (String Id) ;
    public void UpdateClient (Client client) ;
    public void D(String Id);
    public List<Client> AllClientsClient () ;



}

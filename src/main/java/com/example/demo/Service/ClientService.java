package com.example.demo.Service;

import com.example.demo.Dao.ClientDao;
import com.example.demo.Entities.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientDao clientDao;

    public void InsertClient(Client client) {

        clientDao.InsertClient(client);
    }

    public Client SelectClient(String Id) {
  return clientDao.SelectClient(Id);

    }
//
    public void D(String Id) {
     clientDao.D(Id);
    }

    public void UpdateClient(Client client) {
 clientDao.UpdateClient(client);
    }

    public List<Client> AllClientsClient() {
    return clientDao.AllClientsClient();

    }

}

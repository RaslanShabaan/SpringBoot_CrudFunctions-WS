package com.example.demo.Rest;

import com.example.demo.Entities.Client;
import com.example.demo.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Rest")
public class Client_Rest {

    @Autowired
    ClientService clientService;

@RequestMapping(value = "/cv",method = RequestMethod.GET)
public List<Client> Restt()
{
    List<Client> c =new ArrayList<Client>();
    Client client=new Client();
    client.setId("1");
    client.setName("111");
    client.setPhone("11111");
    client.setSalary("11111");

    Client client1=new Client();
    client1.setId("1");
    client1.setName("111");
    client1.setPhone("11111");
    client1.setSalary("11111");

    Client client2=new Client();
    client2.setId("1");
    client2.setName("111");
    client2.setPhone("11111");
    client2.setSalary("11111");

    c.add(client);
    c.add(client1);
    c.add(client2);
    return c;


}

    @RequestMapping(value = "/Spr" )
    public void Hi()
    {
        Client c =new Client();
//        c.setId("c");
//        c.setName("c");
//        c.setSalary("c");
//        c.setPhone("c");

     clientService.D("c");


    }

    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,value = "/S",method= RequestMethod.POST )
    public void H(@RequestBody Client client)
    {
        System.out.println(client.getId().toString());
        System.out.println(client.getName());
    }


}


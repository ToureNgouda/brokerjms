package org.example;

import org.apache.activemq.broker.BrokerService;


public class Main {
    public static void main(String[] args) {
        try {
            BrokerService  broker  =  new BrokerService();
            broker.setPersistent(true);
            broker.addConnector("tcp://localhost:61616");
            broker.start();

            System.out.println("<<<<<<  broker jms start avec succes >>>>>>>");
        } catch (Exception e){
            System.out.println("error start broker "+e.getMessage());
        }

    }
}
package org.anpc76.hm;

import org.anpc76.hm.daoimpl.TrainnerDAOImpl;

public class App 
{
    public static void main( String[] args ) {

    TrainnerDAOImpl t=new TrainnerDAOImpl();
    
   // t.insert();
    t.read();
    
    }
}

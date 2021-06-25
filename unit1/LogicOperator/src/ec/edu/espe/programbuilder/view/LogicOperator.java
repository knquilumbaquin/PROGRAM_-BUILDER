/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.programbuilder.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.Filemanager.utils.FileManager;
import ec.edu.espe.programbuilder.model.Bond;
import ec.edu.espe.programbuilder.model.Compare;
import ec.edu.espe.programbuilder.model.Gender;
import ec.edu.espe.programbuilder.model.Ubication;
import ec.edu.espe.programbuilder.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class LogicOperator {
    public static void main(String[] args) 
    {          
              
         //String UserDataJson = gson.toJson(User);
         //FileManager.save("UsersList.json", UserDataJson);
         //userArray  = FileManager.findAll("UsersList.json");
         //System.out.println(userArray); //prints in Json format on the console
         //System.out.println(" The total of user registers are: "+userArray.size());
         
         System.out.println("Escoja el metodo de filtrado que desee:\n"+"\t1.ZONA\n"+"\t2.BONO\n"+"\t3.EDAD\n"+"\t4.GENERO");
         Scanner entry=new Scanner(System.in); 
         int i = entry.nextInt();
        
        switch (i)
        {
             case 1: System.out.println("ZONA");
             
                    ArrayList<Ubication> ubicationArray= new ArrayList();
             
                    Ubication o1 = new Ubication("Alejandro", "Aguilar","Costa","Guayas");
                    Ubication o2 = new Ubication("David", "Bedoya","Amazonia","Orellana");
                    Ubication o3 = new Ubication("Melissa", "Camacho","Costa","Manabi");
                    Ubication o4 = new Ubication("Belen", "Diaz","Sierra","Pichincha");
                    Ubication o5 = new Ubication("Benajamin", "Manosalva","Sierra","Imbabura");
                    Ubication o6 = new Ubication("Juan", "Montalvo","Costa" ,"Esmeraldas");         
                    Ubication o7 = new Ubication("Jose", "Nantes","Sierra","Azuay");
                    Ubication o8 = new Ubication("Fernanda", "Ovando", "Costa", "El Oro");
                    Ubication o9 = new Ubication("Pablo", "Paucar","Sierra","Cañar");
                    Ubication o10 = new Ubication("Raquel", "Zambrano","Sierra","Pichincha");
                    Ubication o11 = new Ubication("Milton", "Ortiz","Amazonia","Napo");
                    Ubication o12 = new Ubication("Karime", "Rivera","Amazonia","Pastaza"); 
                    Ubication o13 = new Ubication("Erick", "Hinojosa","Costa","Guayas");
                    Ubication o14 = new Ubication("Karen", "Andrade","Costa","Esmeraldas");
                    Ubication o15 = new Ubication("Enrique", "Valladares","Sierra","Carchi");
                    Ubication o16 = new Ubication("Fabricio", "Sánchez", "Amazonia","Pastaza");
                    Ubication o17 = new Ubication("Bryan", "López","Costa","Manabi");
                    Ubication o18 = new Ubication("Paola", "Mendosa","Amazonia","Pastaza");         
                    Ubication o19 = new Ubication("Diego", "Castro","Costa","Loja");
                    Ubication o20 = new Ubication("Santiago", "Guerrero","Sierra","Cotopaxi");
                    Ubication o21 = new Ubication("Patricia", "Jacome","Sierra","Cañar");
                    Ubication o22 = new Ubication("Julio", "Proaño","Costa","Azuay");
                    Ubication o23 = new Ubication("Martha", "Gutieerez","Amazonia","Napo");
                    Ubication o24 = new Ubication("Tatiana", "Terán","Sierra","Pichincha");          
                    Ubication o25 = new Ubication("Raquel", "Egas","Amazonia","Pastaza");
                   
                    ubicationArray.add(o1);
                    ubicationArray.add(o2);
                    ubicationArray.add(o3);
                    ubicationArray.add(o4);
                    ubicationArray.add(o5);
                    ubicationArray.add(o6);
                    ubicationArray.add(o7);
                    ubicationArray.add(o8);
                    ubicationArray.add(o9);
                    ubicationArray.add(o10);
                    ubicationArray.add(o11);
                    ubicationArray.add(o12);     
                    ubicationArray.add(o13);
                    ubicationArray.add(o14);
                    ubicationArray.add(o15);
                    ubicationArray.add(o16);
                    ubicationArray.add(o17);
                    ubicationArray.add(o18);
                    ubicationArray.add(o19);
                    ubicationArray.add(o20);
                    ubicationArray.add(o21);
                    ubicationArray.add(o22);
                    ubicationArray.add(o23);
                    ubicationArray.add(o24);  
                    ubicationArray.add(o25); 
               
                                String jsonUbication ="";

                                GsonBuilder gsonBuilder=new GsonBuilder();
                                Gson gson = gsonBuilder.create();
                              //serializacion  
                                jsonUbication= gson.toJson(o1);
                                jsonUbication= gson.toJson(o2);
                                jsonUbication= gson.toJson(o3);
                                jsonUbication= gson.toJson(o4);
                                jsonUbication= gson.toJson(o5);
                                jsonUbication= gson.toJson(o6);
                                jsonUbication= gson.toJson(o7);
                                jsonUbication= gson.toJson(o8);                    
                                jsonUbication= gson.toJson(o9);
                                jsonUbication= gson.toJson(o10);
                                jsonUbication= gson.toJson(o11);
                                jsonUbication= gson.toJson(o12);
                                jsonUbication= gson.toJson(o13);
                                jsonUbication= gson.toJson(o14);
                                jsonUbication= gson.toJson(o15);
                                jsonUbication= gson.toJson(o16);                     
                                jsonUbication= gson.toJson(o17);                    
                                jsonUbication= gson.toJson(o18);
                                jsonUbication= gson.toJson(o19);
                                jsonUbication= gson.toJson(o20);
                                jsonUbication= gson.toJson(o21);
                                jsonUbication= gson.toJson(o22);
                                jsonUbication= gson.toJson(o23);
                                jsonUbication= gson.toJson(o24);
                                jsonUbication= gson.toJson(o25); 

                          FileManager.save("UbicationList.json", gson.toJson(o1));      
                          FileManager.save("UbicationList.json", gson.toJson(o2));
                          FileManager.save("UbicationList.json", gson.toJson(o3));      
                          FileManager.save("UbicationList.json", gson.toJson(o4));
                          FileManager.save("UbicationList.json", gson.toJson(o5));      
                          FileManager.save("UbicationList.json", gson.toJson(o6));
                          FileManager.save("UbicationList.json", gson.toJson(o7));      
                          FileManager.save("UbicationList.json", gson.toJson(o8));
                          FileManager.save("UbicationList.json", gson.toJson(o9));      
                          FileManager.save("UbicationList.json", gson.toJson(o10));
                          FileManager.save("UbicationList.json", gson.toJson(o11));      
                          FileManager.save("UbicationList.json", gson.toJson(o12));
                          FileManager.save("UbicationList.json", gson.toJson(o13));      
                          FileManager.save("UbicationList.json", gson.toJson(o14));
                          FileManager.save("UbicationList.json", gson.toJson(o15));      
                          FileManager.save("UbicationList.json", gson.toJson(o16));               
                          FileManager.save("UbicationList.json", gson.toJson(o17));      
                          FileManager.save("UbicationList.json", gson.toJson(o18));
                          FileManager.save("UbicationList.json", gson.toJson(o19));      
                          FileManager.save("UbicationList.json", gson.toJson(o20));
                          FileManager.save("UbicationList.json", gson.toJson(o21));      
                          FileManager.save("UbicationList.json", gson.toJson(o22));
                          FileManager.save("UbicationList.json", gson.toJson(o23));      
                          FileManager.save("UbicationList.json", gson.toJson(o24));
                          FileManager.save("UbicationList.json", gson.toJson(o25));      
             
                    
             Collections.sort(ubicationArray);
             for(Ubication aux:ubicationArray){System.out.println("\t"+aux);}
             System.out.println(" The total of user registers are: "+ubicationArray.size());
             break;
    
}

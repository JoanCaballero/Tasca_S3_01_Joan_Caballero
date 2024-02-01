package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Undo {
    public Scanner sc = new Scanner(System.in);

    public ArrayList<String> comandes;
    public ArrayList<String> registre;
    private int index;
    private Undo(){
        this.comandes = new ArrayList<>();
        this.registre = new ArrayList<>();
    }
    private static Undo undoInstance;

    public static Undo getInstance(){
        if(undoInstance == null){
            undoInstance = new Undo();
        }
        return undoInstance;
    }

    public void setArrayList(ArrayList<String> comandes)
    {
        this.comandes = comandes;
    }
    public ArrayList<String> getArrayList()
    {
        return this.comandes;
    }

    public void addComandaiRegistre (){
        System.out.println("Introdueix el nom de la comanda: ");
        String comanda = sc.nextLine();
        addComanda(comanda);
        registre.add(comanda);
        registre.add("index no utilitzat");
        registre.add("added");

    }

    public void addComanda (String comanda){
        comandes.add(comanda);
        System.out.println("Comanda afegida.");
    }

    public void removeComandaiRegistre (){
        System.out.println("Introduexi el nom de la comanda que vols eliminar: ");
        String comanda = sc.nextLine();
        if(removeComanda(comanda)){
            registre.add(comanda);
            registre.add(Integer.toString(index));
            registre.add("removed");
        }
    }
    public boolean removeComanda (String comanda){
        if(hiEs(comanda)){
            comandes.remove(index);
            System.out.println("Comanda eliminada.");
            return true;
        }
        System.out.println("No s'ha trobat cap comanda amb aquest nom.");
        return false;
    }

    public boolean hiEs(String comanda){
        for(int i = 0; i < comandes.size(); i++){
            if(comandes.get(i).equals(comanda)){
                index = i;
                return true;
            }
        }
        return false;
    }

    public void ultimesComandes(){
        int cont = 0;
        System.out.println("Introdueix quantes comandes vols que es mostrin: ");
        int quantes = sc.nextInt();
        if(quantes > comandes.size()){
            System.out.println("No existeixen tantes comandes realitzades");
        }else {
            for (int i = comandes.size() - 1; cont < quantes; i--) {
                System.out.println(comandes.get(i));
                cont++;
            }
        }
    }

    public void deshacer (){
        if(registre.get(registre.size()-1).equals("added")){
            comandes.remove(comandes.size()-1);
        }
        else{
            int number = Integer.parseInt(registre.get(registre.size() - 2));
            comandes.add(number, registre.get(registre.size()-3));
        }
        for(int i = 0; i<3;i++){
            registre.remove(registre.size()-1);
        }
    }
}

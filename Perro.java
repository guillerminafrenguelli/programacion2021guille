/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Perro {
private String nombre;
    private int edad;
    private String raza;
    
     public Perro(){}
    
    //public Perro(String n,int e, String r){
        //this.nombre=n;
       // this.edad=e;
       //this.raza=r;
    //}
    
    public void setNombre(String n){
        this.nombre = n;
    }
   
    public String getNombre(){
        return this.nombre;
    }
   
    // Guardar dato
    public void setEdad(int e){
        this.edad = e+1;
    }
   
    //Leer dato
    public int getEdad(){
        return this.edad;
    }

    public String getRaza() {
        return this.raza;
    }
   public void setRaza(String r){
       this.raza=r; 
   } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
int i;      
     Perro labrador[] = new Perro[a];
     for(i=0; i<labrador.length; i++){

            labrador[i] = new Perro();
            labrador[i].setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));

            labrador[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese Edad(en años)")));
            labrador[i].setRaza(JOptionPane.showInputDialog("Ingrese Raza"));


        }
     for(i=0; i<labrador.length; i++){

            JOptionPane.showMessageDialog(null, labrador[i].getNombre()+", "+labrador[i].getEdad()+" años, "+labrador[i].getRaza());

        }
}
    }
    


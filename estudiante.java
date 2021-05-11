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
public class estudiante {
private String Legajo;
private String Nombre;
private int Edad;
private String Curso;
    
public estudiante(){}

    public String getLegajo() {
        return Legajo;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public String getCurso() {
        return Curso;
    }

    public void setLegajo(String Legajo) {
        this.Legajo = Legajo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0, tam=3;
        estudiante [] info = new estudiante [tam];
        for (i=0; i<info.length; i++){
            info [i]= new estudiante ();
            info [i].setLegajo(JOptionPane.showInputDialog("ingrese el legajo: "));
            info [i].setNombre(JOptionPane.showInputDialog("ingrese el nombre:"));
            info [i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("ingrese la edad")));
            info [i].setCurso(JOptionPane.showInputDialog("Ingrese el curso: "));
        }
        for (i=0; i<tam; i++){
            JOptionPane.showMessageDialog(null, "Legajo: " + info[i].getLegajo() + "\n Nombre: " + info[i].getNombre() + "\n Edad: " +info[i].getEdad() + "\n Curdo " + info[i].getCurso());
        }
       } 
     }


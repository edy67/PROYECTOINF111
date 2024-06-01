/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voni;

/**
 *
 * @author DELL
 */
public class Match {
    private String paj;
    private UsuarioH  ush[]= new UsuarioH[20];
    private UsuarioM  usm[]= new UsuarioM[20];
    public Match()
    {
        paj="pareja 1";
        ush[1]=new UsuarioH ("Mateo Campos Guzmán", 1998, "Riberalta", "Bolivia", "Soy un entusiasta de la tecnología y los videojuegos.\nDisfruto de la programación y el desarrollo de software. También me gusta el deporte y mantenerme en forma.", "Licenciatura", "Ingeniero en Sistemas", 0, "Ateo", "Español", "Bisexual");
        usm [1] = new UsuarioM();
        
        
    }
     public Match( String a)
    {
        paj=a;
        ush[1]=new UsuarioH ("Mateo Campos Guzmán", 1998, "Riberalta", "Bolivia", "Soy un entusiasta de la tecnología y los videojuegos.\nDisfruto de la programación y el desarrollo de software. También me gusta el deporte y mantenerme en forma.", "Licenciatura", "Ingeniero en Sistemas", 0, "Ateo", "Español", "Bisexual");
        usm [1] = new UsuarioM();
        
        
    }

    public String getPaj() {
        return paj;
    }

    public UsuarioH[] getUsh() {
        return ush;
    }

    public UsuarioM[] getUsm() {
        return usm;
    }

    public void setPaj(String paj) {
        this.paj = paj;
    }
    public void leer(){
        System.out.println("");
        paj = Leer.dato(); //aqui no me leee broo
    }
    public void mostrar(){
        System.out.println("numero de la pareja"+paj);
        
    }
    
    public void compatibles (){
        if(this.usm == this.usm){
            System.out.println("son compatibles");
        }
        else{
            System.out.println("no son compatibles");
        }
    }
            
    

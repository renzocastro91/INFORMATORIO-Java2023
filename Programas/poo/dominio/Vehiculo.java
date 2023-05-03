package Programas.poo.dominio;

public class Vehiculo {
    //Atributos, Caracterísiticas
    private String marca;
    private int cantDeRuedas;
    private boolean esDeCompetencia;
    private boolean alarmaEncendida;
    private String kmMaximmo;
    private String kmMinimo;

    //Métodos
    private boolean puedoArrancarlo(){
        if(this.alarmaEncendida){
            System.out.println("**SUENA ALARMA**");
        }else { 
            System.out.println("**VEHICULO ENCENDIDO**");
        }
        return this.alarmaEncendida;
    }

    public void acelerarVehiculo(){

        boolean resultado = puedoArrancarlo();

        if(!resultado){
            System.out.println("**ACELERO VEHICULO**");
        }else { 
            System.out.println("**NO SE PUEDE ACELERAR**");
        }
    }
    //Constructor
    public Vehiculo(String marca, int cantDeRuedas, boolean esDeCompetencia, boolean alarmaEncendida, String kmMaximmo, String kmMinimo){
        //Operaciones de inicialización
        this.marca = marca;
        this.cantDeRuedas = cantDeRuedas;
        this.esDeCompetencia = esDeCompetencia;
        this.alarmaEncendida = alarmaEncendida;
        this.kmMaximmo = kmMaximmo;
        this.kmMinimo = kmMinimo;
    }

    public Vehiculo(String marca, int cantDeRuedas){
        this.marca = marca;
        this.cantDeRuedas = cantDeRuedas;
    }

    public Vehiculo(){

    }
    //Mostrar informacion 
    public String getMarca(){
        //Return es devolver
        //this.marca apunta al atributo marca
        return this.marca;
    }

    public int getCantidadDeRuedas(){
        //Return es devolver
        //this.marca apunta al atributo marca
        return this.cantDeRuedas;
    }

    public boolean getEsDeCompetencia(){
        return this.esDeCompetencia;
    }

    public boolean getAlarmaEncendida(){
        return this.alarmaEncendida;
    }

    public String getKmMaximo(){
        return this.kmMaximmo;
    }

    public String getKmMinimo(){
        return this.kmMinimo;
    }
    //Guardar informacion 
    public void setMarca(String marca){
        this.marca = marca;
    }

    
    public void setCantidadDeRuedas(int cantDeRuedas){
        this.cantDeRuedas = cantDeRuedas;
    }

    public void setEsDeCompetencia(boolean esDeCompetencia){
        this.esDeCompetencia = esDeCompetencia;
    }

    public void setAlarmaEncencida(boolean alarmaEncendida){
        this.alarmaEncendida = alarmaEncendida;
    }

    public void setKmMaximo(String kmMaximo){
        this.kmMaximmo = kmMaximo;
    }

    public void setKmMinimo(String kmMinimo){
        this.kmMinimo = kmMinimo;
    }
}

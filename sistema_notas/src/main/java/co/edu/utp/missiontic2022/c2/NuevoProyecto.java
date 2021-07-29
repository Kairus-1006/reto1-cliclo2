package co.edu.utp.missiontic2022.c2;

public class NuevoProyecto {
    
    //atributos
    private int periodo;
    private double monto;
    private double interes;
    
    //Metodos

    //-->Constructores
    NuevoProyecto()
    {
        this.periodo = 0;
        this.monto = 0;
        this.interes = 0;
    }

    NuevoProyecto(int p1Periodo, double p1Monto, double p1Interes){
        this.periodo = p1Periodo;
        this.monto = p1Monto;
        this.interes = p1Interes;
                
    }
   
    public double calcularInteresSimple()
    {
        double interesSimple = Math.round(this.monto * (this.interes/100) * this.periodo);
        return interesSimple;

    }

    public double calcularInteresCompuesto()
    {

        double interesCompuesto = Math.round(this.monto *((Math.pow((1 + (this.interes/100)),this.periodo))-1));
        return interesCompuesto;

    }

    public String compararInversion(int pPeriodo, double pMonto, double pInteres)
    {
        String respuesta = "";
       
        respuesta = String.valueOf(compararInversion());
       
        return respuesta;

        
    } 



    public double compararInversion()
    {
        double compararInversion = 0;
        compararInversion = Math.round(calcularInteresCompuesto() - calcularInteresSimple());
        return compararInversion;
       
    }
       
        //************getters****************

  /*   public double getInteres() {
        return interes;
    }
    /*public double getInteresCompuesto() {
        return interesCompuesto;
    }
    public double getInteresSimple() {
        return interesSimple;
    } 
    public double getMonto() {
        return monto;
    }
    public int getPeriodo() {
        return periodo;
    } 

    //setters
    public void setInteres(double interes) {
        this.interes = interes;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
     public void setInteresSimple(double interesSimple) {
        this.interesSimple = interesSimple;
    } */

    

    public static void main(String[] args) {
        NuevoProyecto np = new NuevoProyecto(6, 10000000, 1.2);
        //np.mostrar();
        //NuevoProyecto np1 = new NuevoProyecto();
        System.out.println("Interes compuesto calculado "+np.calcularInteresCompuesto());
        System.out.println("Interes simple caluculado "+np.calcularInteresSimple());
        System.out.println(np.compararInversion(6, 10000000, 1.2));
    }
}

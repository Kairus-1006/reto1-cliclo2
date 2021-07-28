package co.edu.utp.missiontic2022.c2;

public class NuevoProyecto {
    
    //atributos
    private int periodo;
    private double monto;
    private double interes;
    private double interesSimple;
    private double interesCompuesto;
    private double compararInversion;


    //Metodos

    //-->Constructores
    NuevoProyecto(int opt){

        if(opt == 1)
        {
            this.periodo = 0;
            this.monto = 0;
            this.interes = 0;
            this.interesSimple = 0;
            this.interesCompuesto = 0;
            this.compararInversion = 0;
        }else{
            this.periodo = 3

        }
    }
    /* NuevoProyecto(int ppPerido, double ppMonto, double ppInteres){
        this.periodo = ppPerido;
        this.monto = ppMonto;
        this.interes = ppInteres;


    } */
    
    public double compararInversion(int pPeriodo, double pMonto, double pInteres)
    {
        this.periodo = pPeriodo;
        this.monto = pMonto;
        this.interes = pInteres;
        

        this.compararInversion = calcularInteresCompuesto() - calcularInteresSimple();
        return this.compararInversion;

    }
       
    public double calcularInteresSimple()
    {
        this.interesSimple = this.monto * (this.interes / 100) * this.periodo;
        return this.interesSimple;

    }

    public double calcularInteresCompuesto()
    {

        this.interesCompuesto = this.monto *(Math.pow((1 + this.interes),this.periodo))-1;
        return this.interesCompuesto;

    }

   
/*
    public double compararInversion()
    {


    }
*/

   /*  public void mostrar(){

        System.out.println("Periodo: "+this.periodo);
        System.out.println("Periodo: "+this.monto);
        System.out.println("Periodo: "+this.interes);
        System.out.println("Periodo: "+this.interesSimple);
        System.out.println("Periodo: "+this.interesCompuesto);
    } */



    //getters

    public double getInteres() {
        return interes;
    }
    public double getInteresCompuesto() {
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
    }

    
    


    public static void main(String[] args) {
        NuevoProyecto np = new NuevoProyecto(0);
        System.out.println(np);
        //np.mostrar();
        System.out.println(np.calcularInteresCompuesto());
        System.out.println(np.calcularInteresSimple());
        System.out.println(np.compararInversion(3, 500000, 3));
    }
}

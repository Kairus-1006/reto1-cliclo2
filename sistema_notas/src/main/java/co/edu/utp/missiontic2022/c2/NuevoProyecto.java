package co.edu.utp.missiontic2022.c2;

public class NuevoProyecto {
    
    //atributos
    private int periodo;
    private double monto;
    private double interes;
    private double interesSimple;
    private double interesCompuesto;


    //Metodos

    //-->Constructores
    NuevoProyecto(){
        this.periodo = 0;
        this.monto = 0;
        this.interes = 0;
        this.interesSimple = 0;
        this.interesCompuesto = 0;
    }

    NuevoProyecto(int pmonto){



    }
    
    public double calcularInteresSimple()
    {
        interesSimple = monto * (interes / 100) * periodo;
        return interesSimple;

    }

    public double calcularInteresCompuesto()
    {

        interesCompuesto = monto *(Math.pow((1 + interes),periodo))-1;
        return interesCompuesto;

    }

    public String compararInversion(int pPeriodo, double pMonto, double pInteres)
    {



    }

    public double compararInversion()
    {


    }



    //


    public static void main(String[] args) {
        System.out.println();        
    }
}

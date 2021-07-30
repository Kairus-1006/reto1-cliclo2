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

    NuevoProyecto(int pPeriodo, double pMonto, double pInteres){
        this.periodo = pPeriodo;
        this.monto = pMonto;
        this.interes = pInteres;
                
    }

    //Metodos 
   
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

    public double compararInversion(int pPeriodo, double pMonto, double pInteres)
    {
        double diferencia = 0;
        this.periodo = pPeriodo;
        this.monto = pMonto;
        this.interes = pInteres;
        diferencia = Math.round(calcularInteresCompuesto() - calcularInteresSimple());
        return diferencia;
       
    } 



    public double compararInversion()//no se pasan datos porque los toma del constructor en los metodos calcularInteresCompuesto y calcularInteresSimple
    {
        double diferencia = 0;
        diferencia = Math.round(calcularInteresCompuesto() - calcularInteresSimple());
        return diferencia;
       
    }
       
     

    public static void main(String[] args) {
        NuevoProyecto np = new NuevoProyecto(6, 10000000, 1.2);//se pasan datos al constructor de la clase con estos datos trabajan los metodos
        
        System.out.println("Interes compuesto calculado "+np.calcularInteresCompuesto());
        System.out.println("Interes simple caluculado "+np.calcularInteresSimple());
        System.out.println(np.compararInversion());//no se pasan datos porque ya se pasaron al constructor en la creacion del objeto
    }
}

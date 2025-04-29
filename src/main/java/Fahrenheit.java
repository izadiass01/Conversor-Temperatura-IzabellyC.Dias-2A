public class Fahrenheit extends Temperatura{
    
    //CONSTRUTOR
    public Fahrenheit(double valorGraus) {
        
    //SE REFERE A CLASE PAI
    super(valorGraus);
    }
    
    //METODO QUE CONVERTE FAHRENHEIT P/ CELSIUS
    public double paraCelsius(){
        return(getGraus()-32)*5/9;
        
    }
    
    //FAHRENHEIT P/ KELVIN
    public double paraKelvin(){
        return paraCelsius()+273;
    }
    
    //
}

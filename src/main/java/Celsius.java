//CLASSE FILHA
public class Celsius extends Temperatura {
    
    //COSTRUTOR
    public Celsius(double valorGraus){
        
        //REFERE A CLASSE PAI
        super(valorGraus);
        
    }
    
    //CRIANDO OS METODOS PARA CONVERTER
    public double paraFahrenheit(){
        return (getGraus()*9/5)+32;
    }
    
    //CRIANDO METODO PARA CONVERTER CELSIUS P/ KELVIN
    public double paraKelvin(){
        return getGraus()+273;
    }
    
    //
}

package corto12s_2022;

public class Operaciones {

   
    public  static int AreaCuadrado(int x){
    int resultado = x * x;
    return resultado ;
    }
    
    public static int VolCubo(int x){
        int resultado=x*x*x;
        return resultado;
    }
    
    public static float AreaCirculo(int r){
        float pi= 3.14f;
        float resultado=pi*r*r;
        return resultado;
    }
    public static float VolEsfera(int r){
        float pi = 3.14f;
        float frac= 0.66f;
        float resultado= pi*frac*r*r*r;
        return resultado;
    }
    

}

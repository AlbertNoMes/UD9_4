
public class Raices {

	//Atributos(caracteristicas)
	private double a;
	private double b;
	private double c;
	

	//Constructores
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	//Metodos
	//getDiscriminante
	public double getDiscriminante() {
			
		double resultado = Math.pow(b, 2)-(4*a*c);
		return resultado;
			
	}
	
	
	//ObtenerRaices
	public void obtenerRaices() {
		
		double resultado1 = (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		double resultado2 = (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		
		System.out.println("Los resultados de la operaci�n s�n: "+resultado1+" y "+resultado2);
		
	}
	
	//ObtenerRaiz
	private void obtenerRaiz(){
        
        double x=-b+Math.sqrt(0)/(2*a);
         
        System.out.println("Unica solucion");
        System.out.println(x);
         
    }
	
	//tineneRaices
	private boolean tieneRaices(){
        return getDiscriminante()>0;
    }
	
	
	//tieneRaiz
    private boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
	
	
	//calcular
    public void calcular(){
        
        if(tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene soluciones");
        }
         
    }

	//getters & setters

	public double getA() {
		return a;
	}



	public void setA(double a) {
		this.a = a;
	}



	public double getB() {
		return b;
	}



	public void setB(double b) {
		this.b = b;
	}



	public double getC() {
		return c;
	}



	public void setC(double c) {
		this.c = c;
	}
	
	
	
}

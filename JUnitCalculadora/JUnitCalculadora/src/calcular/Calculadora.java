package calcular;

public class Calculadora {
	
	private Integer a, b;
	
	public Calculadora (Integer a, Integer b)
	{
		this.a=a;
		this.b=b;
	}
		

	public Integer suma(){
			
		return a+b;
	}
	
	
	
	
	public static void main(String args[])
	{
		
		Calculadora oper = new Calculadora(20,10);
		
		
		Integer resultados= oper.suma();
		Integer resultador= oper.resta();
		Integer resultadom= oper.multiplica();
		
		System.out.println(resultados);
		System.out.println(resultadom);
		System.out.println(resultador);
		
		
		
		
		
		
		//int resultado= oper.resta2();
		//int resultado= oper.divide();
		//System.out.println(resultado);
		//Integer resultado= oper.divide2();
		//System.out.println(resultado);
		
		
	}
	
	
	
	
}

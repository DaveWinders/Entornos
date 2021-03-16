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
	
	public Integer resta(){
		
		if (a<b)
		return b-a;
		else
			return a-b;
	}
	

	
	public Integer multiplica(){
		
		return a*b;
	}
	public Integer divide(){
		
		return a/b;
	
	}
	
	public boolean mayor(){
		
			if (a>b)
				return true;
			else
				return false;
		} 
	
	public Integer resta2(){
		
		if (this.mayor())
			return a-b;
		else
			return b-a;
	}
	
	
	public Integer divide2(){
		
		if (b!=0)
			return a/b;
		else
			return null;
	}
	
	
	public Integer dividir(){
		
		if (b==0)
			throw new ArithmeticException("Division por 0");
		
		return a/b;
	}
	
	
	public static void main(String args[])
	{
		
		Calculadora oper = new Calculadora(20,10);
		
		
		Integer resultados= oper.suma();
		Integer resultador= oper.resta();
		Integer resultadom= oper.multiplica();
		Integer resultadod= oper.divide();
		System.out.println(resultados);
		System.out.println(resultadom);
		System.out.println(resultadod);
		System.out.println(resultador);
		
		
		
		
		
		
		//int resultado= oper.resta2();
		//int resultado= oper.divide();
		//System.out.println(resultado);
		//Integer resultado= oper.divide2();
		//System.out.println(resultado);
		
		
	}
	
	
	
	
}

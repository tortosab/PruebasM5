
public class EmpleadoBR {

	float calculaSalarioBruto(String tipo, float ventasMes, float horasExtra) throws BRException{
		float salario=0;
		if (tipo==null ||ventasMes <0 || horasExtra<0) throw new BRException();
		if(tipo.equalsIgnoreCase("vendedor")){
			salario=1000;
		}
		else salario=1500;
		if(ventasMes>=1000)salario+=100;
		else if(ventasMes>=1000 && ventasMes<=1500) salario+=200;
		salario=salario+20*horasExtra;

		return salario;
	}
	float calculaSalarioNeto(float salarioBruto){
		
		return 0;
	}
}

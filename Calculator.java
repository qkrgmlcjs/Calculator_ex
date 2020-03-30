package calculator_pack;

public class Calculator {

	int op_1,op_2;
	double result;
	public void setOprands(int op_1,int op_2){
		this.op_1=op_1;
		this.op_2=op_2;
	}
	
	public double sum() {
		result = op_1+op_2;
		System.out.println(result);
		return result;
	}
	
	public double sub() {
		result = op_1-op_2;
		System.out.println(result);
		return result;
	}
	
	public double div() {
		result = op_1/op_2;
		System.out.println(result);
		return result;
	}
	
	public double mul() {
		result = op_1*op_2;
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.setOprands(3, 4);
		cal.sum();
		System.out.println(cal.result);
		cal.sub();
		System.out.println(cal.result);
		cal.mul();
		cal.div();

	}

}

package model;

public class Principal {

	public static void main(String[] args) {
		Long num = 9000000000000000000L;
		Operacao op = new Operacao();
		
		if(op.verificarLong(2147483647)){
			System.out.println("� Long!!!");
		} else {
			System.out.println("N�o � Long!!!");
		}
		
		if(op.verificarLong(num)){
			System.out.println("� Long!!!");
		} else {
			System.out.println("N�o � Long!!!");
		}
		
	}

}

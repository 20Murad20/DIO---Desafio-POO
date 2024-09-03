package dominio;

public class Main {

	public static void main(String[] args) {
		
		Curso Java = new Curso(); 
		Java.setTitulo("Curso Java");
		Java.setDescricao("Um Curso Sobre Java");
		Java.setCargaHoraria(10);
		
		Mentoria JS = new Mentoria();
		JS.setTitulo("JavaScript");
		JS.setDescricao("Uma Mentoria Sobre Java Script");
		
		Bootcamp POO = new Bootcamp();
		Bootcamp LOGICA = new Bootcamp();
		POO.setTituloBootcamp("POO");
		POO.addConteudo(Java);
		POO.setXpRecompensa(50);
		LOGICA.setTituloBootcamp("LOGICA");
		LOGICA.addConteudo(JS);
		LOGICA.setXpRecompensa(40);
		
		
		Dev dev1 = new Dev();
		dev1.setNome("Peter Benjamin Parker");
		dev1.setIdade(15);
		dev1.inscreverConteudo(POO);
		dev1.inscreverConteudo(LOGICA);
		
		Dev dev2 = new Dev();
		dev2.setNome("Ben Reilly");
		dev2.setIdade(15);
		dev2.inscreverConteudo(POO);
		
		System.out.println(dev1.getNome());
		System.out.println(dev1.getConteudosInscritos());
		System.out.println(POO.getConteudos());
		System.out.println(POO.getInscritos());
		System.out.println(LOGICA.getInscritos());
		System.out.println(dev1.getXP());
		dev1.concluirConteudo(POO);
		System.out.println(dev1.getXP());
		
		
		
	}

}

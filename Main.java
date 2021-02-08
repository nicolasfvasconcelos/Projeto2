package empresa;

import java.util.InputMismatchException;


public class Main {
	public int getAnexo() {
		int anexo= 0;
		SaidaUsuario.qualAnexo();
		try {
			anexo = EntradaUsuario.getInt();
			while(anexo < 1 || anexo >5 ) {
				System.out.println("Por favor digite um valor v�lido, atente-se ao menu: ");
				SaidaUsuario.qualAnexo();
				anexo = EntradaUsuario.getInt();
			}
			
		}catch (InputMismatchException e) {
			System.out.println("Voc� digitou uma entrada inv�lida, por favor tente novamente!\nErro: "+e);
			return this.getAnexo();
		}
		catch(NumberFormatException ne) {
			System.out.println("Voc� digitou uma entrada inv�lida, por favor tente novamente!\nErro: "+ne);
			return this.getAnexo();
		}
		return anexo;
	}
	
	public void execucaoPrograma() {
		// TODO Auto-generated constructor stub
		int anexo;
		
		System.out.println("Ol� empres�rio! Bem vindo! Vamos planejar seu futuro?\n");
		
		System.out.println("Digite o nome da empresa");
		String nome= EntradaUsuario.getString();
		
		System.out.println("Digite o CNPJ da empresa");
		String cnpj= EntradaUsuario.getString();
		
		
		int opMenu = SaidaUsuario.menuInicial();
		
		System.out.println("Qual a atividade da sua empresa? (Escolha um n�mero): ");
		
		switch (opMenu) {
		
		
		
			case 1: {
				int continua1 = 0;
				do {
					
				anexo = this.getAnexo();
				System.out.println(anexo);
				switch (anexo) {
					case 1: {
						//chama a classe do case 1
						Anexo1Comercio emp = new Anexo1Comercio();
						emp.run();
						System.out.println("\n\nDigite 1 se deseja ver informa��es de outros anexos.");
						break;
					}
					case 2:{
						Anexo2Industria emp = new Anexo2Industria();
						emp.run();
						System.out.println("\n\nDigite 1 se deseja ver informa��es de outros anexos.");
						break;
					}
					
					case 3:{
						Anexo3Servico emp = new Anexo3Servico();
						emp.run();
						System.out.println("\n\nDigite 1 se deseja ver informa��es de outros anexos.");
						break;
					}
					
					case 4:{
						Anexo4ServicoConstucaoCivil emp = new Anexo4ServicoConstucaoCivil();
						emp.run();
						System.out.println("\n\nDigite 1 se deseja ver informa��es de outros anexos.");
						break;
					}
					
					case 5:{
						AnexoVServi�osDeCunhoIntelectual emp = new AnexoVServi�osDeCunhoIntelectual();
						emp.run();
						System.out.println("\n\nDigite 1 se deseja ver informa��es de outros anexos.");
						break;
					}
					
					default:
						System.out.println("Saindo do programa");
						break;
					}
						
				 try {
		    		 continua1= EntradaUsuario.getInt();
		    		 } 
		    		 catch (Exception e) {
		    			 System.out.println("O programa ser� encerrado!");
		    			 continua1=0;
		    		 }
				
					}
				while(continua1==1); 
				break;
			}
				
		    case 2: {
		    	
		    	
		    	 int continua;
		    	 
		    	 do {
		    		 int anexos = getAnexo();
		    		 
		    		 System.out.println(SaidaUsuario.informacoes(anexos));
		    		 System.out.println("Digite 1 se deseja ver informa��es de outros anexos.");
		    		 
		    		 try {
		    		 continua= EntradaUsuario.getInt();
		    		 } 
		    		 catch (Exception e) {
		    			 System.out.println("O programa ser� encerrado!");
		    			 continua=0;
		    		 }
		    	 } while (continua==1);
		    	 
		    	 
		    	 
		    	
		    	 
		    }
		}
		
		
						System.out.println("Programa Encerrado!");
						System.out.println("\nOLOCO MEUUUUU, QUEM SABE FAZ AO VIVO! \nPS: PALMEIRAS SEM MUNDIAL!");
						
		
		}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.execucaoPrograma();
	}
}
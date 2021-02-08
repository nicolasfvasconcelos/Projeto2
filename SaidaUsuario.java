package empresa;

import java.util.List;

public class SaidaUsuario {
	//static Scanner = new Sc
	public static void qualAnexo() {
		String menuAnexo = "\n1- Anexo I - Com�rcio\r\n"
				  + "2- Anexo II - Industria\r\n"
				  + "3- Anexo III - Servi�o\r\n"
				  + "4- Anexo IV � Constru��o Civil\r\n"
				  + "5- Anexo  V � Servi�os de cunho intelectual\r\n";
		System.out.println(menuAnexo);
	}
	
	public static void relatorio(List<Float> pagamento, float total, float imposto) {
		for (int i = 0; i <= 11; i++) {
			System.out.printf("Faturamento mes %d foi de: R$ %.2f\n", i+1, pagamento.get(i) );	
		}
		System.out.printf("\nSeu faturamento total dos ultimos 12 meses foi de: R$ %.2f\n\n",total);
		System.out.printf("\nSeu imposto do m�s � de: R$ %.2f\n\n",imposto);
		
		if (total < 0)
		{
			System.out.println("Erro! O sistema n�o aceita valores negativos! Tente novamente");			
		}
		

		else if (pagamento.get(11)<=0)
		{
			System.out.printf("\nN�o houve faturamento nesse m�s. Voc� n�o ter� imposto � pagar!");
		}
		else if (total > 4800000)
		{
			System.out.printf("\nUhul! Parece que voc� est� voando!!! \r\n"
					+ "Voc� excedeu seu limite de faturamento para o Simples Nacional. Fique atento e converse com seu contador!  Pois precisa se enquadrar direitinho!\r\n"
					+ "");
		}
		else if (total <=81000)
		{
			System.out.printf("\nUhul! Parece que voc� est� crescendo!!! \r\n"
					+ "Mas sabia que talvez voc� esteja pagando mais imposto do que deveria?! Converse com seu contador, pois voc� pode ser um Microempreendedor individual e pagar menos imposto! ");
		}
		
		
	}
	
	
	
public static int menuInicial() {
		
		
		int x,y;
		
		do {
			System.out.println("Como posso te ajudar hoje?\n"
					+ "\n1 - Planejamento tribut�rio"
					+ "\n"
					+ "2 - Informa��es\r\n"
					 );
			try {
				x = EntradaUsuario.getInt();
			}catch (Exception e) {
				System.out.println("Op��o inv�lida. Tente novamente!");
				return SaidaUsuario.menuInicial();
				
			}
			
		}while(x < 0 || x > 2);
		return x; 
		
	}

	public static String informacoes(int numAnexo) {
	
		String lista[] = {"\nEst�o inclu�das neste anexo atividades diversas relacionada a comerciantes, lojistas e inclusive produtores que comercializam produtos. Confira exemplos: horticultura, distribui��o\nde �gua por caminh�es, produ��o de ovos, pesca de peixes em �gua salgada, extra��o de min�rio de alum�nio, com�rcio a varejo de autom�veis,  produ��o de carv�o vegetal, entre outras.\r\n"
				+ "\n"
				+ "","\nEst�o inclu�das neste anexo f�bricas/ind�strias e empresas industriais, dentre outras atividades como: beneficiamento de min�rios de cobre, chumbo, zinco e outros minerais;\nfrigor�ficos; abatedouros; preserva��o de peixes, crust�ceos e moluscos; fabrica��o de latic�nios.\r\n"
						+ "\n"
					+ "","\nAnexo III do Simples Nacional � Atividades de Servi�os\n\n"
							+ "Est�o inclu�dos servi�os diversos, como acupuntura, podologia, academias, laborat�rios, instala��o, reparos e manuten��o, ag�ncias de viagens, lot�ricas, escrit�rios de contabilidade,\ndentre outros.\r\n"
							+ " \n"
						+ "","\nAnexo IV do Simples Nacional � Atividades de Servi�os de constru��o civil\n\n"
								+ "Aqui est�o inclu�das empresas diversas, que fornecem desde servi�o de limpeza, vigil�ncia, obras, constru��o de im�veis, servi�os de pintura de edif�cios em geral, perfura��o\ne constru��o de po�os de �gua, servi�os advocat�cios, dentre outros.\r\n"
								+ "\n"
							+ "","\nAnexo V do Simples Nacional � Atividades de Servi�os de cunho intelectual\n\n"
									+ "Neste caso, s�o empresas que fornecem servi�o de auditoria, jornalismo, tecnologia, publicidade, engenharia, design de produto e interiores, servi�os de tradu��o, atividades\nveterin�rias, dentre outros.\r\n"
									+ "" 
							
		};
			
	
	return lista[numAnexo-1];
	
	
	}
	
	
	
	
	
	
}
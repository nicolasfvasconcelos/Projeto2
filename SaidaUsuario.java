package empresa;

import java.util.List;

public class SaidaUsuario {
	//static Scanner = new Sc
	public static void qualAnexo() {
		String menuAnexo = "1- Anexo I   - Com�rcio\r\n"
				  + "2- Anexo II  - Industria\r\n"
				  + "3- Anexo III - Servi�o\r\n"
				  + "4- Anexo IV  - Constru��o Civil\r\n"
				  + "5- Anexo V   - Servi�os de cunho intelectual\r\n";
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
	
		String lista[] = {
				"\n Anexo I do Simples Nacional � Atividades do Com�rcio\r\n"
				+ "\r\n"
				+ "Est�o inclu�das neste anexo atividades diversas relacionada a comerciantes, lojistas e inclusive produtores que comercializam produtos. \r\n"
				+ "Confira exemplos: horticultura, distribui��o de �gua por caminh�es, produ��o de ovos, pesca de peixes em �gua salgada, extra��o de min�rio de alum�nio, com�rcio a varejo de autom�veis,� produ��o de carv�o vegetal, entre outras.\r\n"
				+ "\r\n"
				+ "Consulte a lista completa do anexo de acordo com sua atividade://cnae-simples.com.br/\r\n"
				+ "\r\n"
				+ "**************Informa��es tribut�rias**************\r\n"
				+ " Para as atividades de Com�rcio:\r\n"
				+ "\r\n"
				+ "1- Sua al�quota de imposto pode variar de: 4,0% � 19,0% de acordo com o faturamento do m�s. Consulte nosso simulador tribut�rio na OP��O 1 e simule se faturamento anual e imposto.\r\n"
				+ "\r\n"
				+ "2-Atente-se! Sua guia de imposto (DAS � Documento de Arrecada��o do Simples Nacional), vence todo o dia 20 de cada m�s. Ela dever� ser emitida no site: http://www8.receita.fazenda.gov.br/simplesnacional/ com seu CNPJ e c�digo de acesso.\r\n"
				+ "\r\n"
				+ "3- Atente-se! Voc� pode faturar no m�ximo R$ 4.800.000,00 entre Janeiro � Dezembro de cada ano.\r\n"
				+ "Caso seu faturamento anual ultrapasse esse valor, ao final do ano vigente voc�  ser� desenquadrado automaticamente do Simples Nacional. \r\n"
				+ "Ser� necess�rio procurar um contador de sua confian�a para que ele realize o reenquadramento da sua empresa no regime tribut�rio mais adequado.\r\n"
				+ "\r\n "
				+ "4- Atente-se! Caso voc� esteja enquadrado SIMPLES NACIONAL e  seu faturamento anual n�o ultrapasse o valor acima de R$ 81.000,00, voc� pode estar pagando mais imposto do que deveria!\r\n"
				+ "Ser� necess�rio procurar um contador de sua confian�a para que ele realize o reenquadramento da sua empresa no MEI (Microempreendedor Individual).\r\n"
				+ "Nesse regime de tributa��o, seu imposto ser� uma taxa fica de R$ 55,00. \n\n"
				
				
				
				+ "","\nAnexo II do Simples Nacional � Atividades da Ind�stria\r\n"
						+ "\r\n"
						+ "Est�o inclu�das neste anexo f�bricas/ind�strias e empresas industriais, dentre outras atividades como: beneficiamento de min�rios de cobre, chumbo, zinco e outros minerais; frigor�ficos; abatedouros; preserva��o de peixes, crust�ceos e moluscos; fabrica��o de latic�nios.\r\n"
						+ "\r\n"
						+ "Consulte a lista completa do anexo de acordo com sua atividade://cnae-simples.com.br/\r\n"
						+ "\r\n"
						+ "**************Informa��es tribut�rias**************\r\n"
						+ " Para as atividades de Com�rcio:\r\n"
						+ "\r\n"
						+ "1- Sua al�quota de imposto pode variar de: 4,0% � 19,0% de acordo com o faturamento do m�s. Consulte nosso simulador tribut�rio na OP��O 1 e simule se faturamento anual e imposto.\r\n"
						+ "\r\n"
						+ "2-Atente-se! Sua guia de imposto (DAS � Documento de Arrecada��o do Simples Nacional), vence todo o dia 20 de cada m�s. Ela dever� ser emitida no site: http://www8.receita.fazenda.gov.br/simplesnacional/ com seu CNPJ e c�digo de acesso.\r\n"
						+ "\r\n"
						+ "3- Atente-se! Voc� pode faturar no m�ximo R$ 4.800.000,00 entre Janeiro � Dezembro de cada ano.\r\n"
						+ "Caso seu faturamento anual ultrapasse esse valor, ao final do ano vigente voc�  ser� desenquadrado automaticamente do Simples Nacional. \r\n"
						+ "Ser� necess�rio procurar um contador de sua confian�a para que ele realize o reenquadramento da sua empresa no regime tribut�rio mais adequado.\r\n"
						+ "\r\n"
						+ "4- Atente-se! Caso voc� esteja enquadrado SIMPLES NACIONAL e  seu faturamento anual n�o ultrapasse o valor acima de R$ 81.000,00, voc� pode estar pagando mais imposto do que deveria!\r\n"
						+ "Ser� necess�rio procurar um contador de sua confian�a para que ele realize o reenquadramento da sua empresa no MEI (Microempreendedor Individual).\r\n"
						+ "Nesse regime de tributa��o, seu imposto ser� uma taxa fica de R$ 55,00.\n\n"
						
						
					
					
					+ "","\nAnexo III do Simples Nacional � Atividades de Servi�os\r\n"
						+ "\r\n"
						+ "Est�o inclu�dos neste anexo servi�os diversos,  como acupuntura, podologia, academias, laborat�rios, instala��o, reparos e manuten��o, ag�ncias de viagens, lot�ricas, escrit�rios de contabilidade, dentre outros.�\r\n"
						+ "\r\n"
						+ "Consulte a lista completa do anexo de acordo com sua atividade://cnae-simples.com.br/\r\n"
						+ "\r\n"
						+ "**************Informa��es tribut�rias**************\r\n"
						+ " Para as atividades de Com�rcio:\r\n"
						+ "\r\n"
						+ "1- Sua al�quota de imposto pode variar de: 6,0% � 33,0% de acordo com o faturamento do m�s. Consulte nosso simulador tribut�rio na OP��O 1 e simule se faturamento anual e imposto.\r\n"
						+ "\r\n"
						+ "2-Atente-se! Sua guia de imposto (DAS � Documento de Arrecada��o do Simples Nacional), vence todo o dia 20 de cada m�s. Ela dever� ser emitida no site: http://www8.receita.fazenda.gov.br/simplesnacional/ com seu CNPJ e c�digo de acesso.\r\n"
						+ "\r\n"
						+ "3- Atente-se! Voc� pode faturar no m�ximo R$ 4.800.000,00 entre Janeiro � Dezembro de cada ano.\r\n"
						+ "Caso seu faturamento anual ultrapasse esse valor, ao final do ano vigente voc�  ser� desenquadrado automaticamente do Simples Nacional. \r\n"
						+ "Ser� necess�rio procurar um contador de sua confian�a para que ele realize o reenquadramento da sua empresa no regime tribut�rio mais adequado.\r\n"
						+ "\r\n"
						+ "4- Atente-se! Caso voc� esteja enquadrado SIMPLES NACIONAL e  seu faturamento anual n�o ultrapasse o valor acima de R$ 81.000,00, voc� pode estar pagando mais imposto do que deveria!\r\n"
						+ "Ser� necess�rio procurar um contador de sua confian�a para que ele realize o reenquadramento da sua empresa no MEI (Microempreendedor Individual).\r\n"
						+ "Nesse regime de tributa��o, seu imposto ser� uma taxa fica de R$ 55,00. \n\n"
							
							
						+ "","\nAnexo IV do Simples Nacional � Atividades de Servi�os de constru��o civil\r\n"
								+ "\r\n"
								+ "Est�o inclusos neste anexo empresas diversas, que fornecem desde servi�o de limpeza, vigil�ncia, obras, constru��o de im�veis, servi�os de pintura de edif�cios em geral, perfura��o e constru��o de po�os de �gua, dentre outros.�\r\n"
								+ "\r\n"
								+ "Consulte a lista completa do anexo de acordo com sua atividade://cnae-simples.com.br/\r\n"
								+ "\r\n"
								+ "**************Informa��es tribut�rias**************\r\n"
								+ " Para as atividades de Com�rcio:\r\n"
								+ "\r\n"
								+ "1- Sua al�quota de imposto pode variar de: 4,5% � 33,0% de acordo com o faturamento do m�s. Consulte nosso simulador tribut�rio na OP��O 1 e simule se faturamento anual e imposto.\r\n"
								+ "\r\n"
								+ "2-Atente-se! Sua guia de imposto (DAS � Documento de Arrecada��o do Simples Nacional), vence todo o dia 20 de cada m�s. Ela dever� ser emitida no site: http://www8.receita.fazenda.gov.br/simplesnacional/ com seu CNPJ e c�digo de acesso.\r\n"
								+ "\r\n"
								+ "3- Atente-se! Voc� pode faturar no m�ximo R$ 4.800.000,00 entre Janeiro � Dezembro de cada ano.\r\n"
								+ "Caso seu faturamento anual ultrapasse esse valor, ao final do ano vigente voc�  ser� desenquadrado automaticamente do Simples Nacional. \r\n"
								+ "Ser� necess�rio procurar um contador de sua confian�a para que ele realize o reenquadramento da sua empresa no regime tribut�rio mais adequado.\r\n"
								+ "\r\n"
								+ "4- Atente-se! Caso voc� esteja enquadrado SIMPLES NACIONAL e  seu faturamento anual n�o ultrapasse o valor acima de R$ 81.000,00, voc� pode estar pagando mais imposto do que deveria!\r\n"
								+ "Ser� necess�rio procurar um contador de sua confian�a para que ele realize o reenquadramento da sua empresa no MEI (Microempreendedor Individual).\r\n"
								+ "Nesse regime de tributa��o, seu imposto ser� uma taxa fica de R$ 55,00.\n\n"
								
								
							+ "","\nAnexo V do Simples Nacional � Atividades de Servi�os de cunho intelectual \r\n"
							+ "\r\n"
							+ "Est�o inclusos neste anexo empresas que fornecem servi�o de auditoria, jornalismo, tecnologia, publicidade, engenharia, design de produto e interiores, servi�os de tradu��o, atividades veterin�rias, dentre outros.\r\n"
							+ "\r\n"
							+ "Consulte a lista completa do anexo de acordo com sua atividade://cnae-simples.com.br/\r\n"
							+ "\r\n"
							+ "**************Informa��es tribut�rias**************\r\n"
							+ " Para as atividades de Com�rcio:\r\n"
							+ "\r\n"
							+ "1- Sua al�quota de imposto pode variar de: 15,5% � 30,5% de acordo com o faturamento do m�s. Consulte nosso simulador tribut�rio na OP��O 1 e simule se faturamento anual e imposto.\r\n"
							+ "\r\n"
							+ "2-Atente-se! Sua guia de imposto (DAS � Documento de Arrecada��o do Simples Nacional), vence todo o dia 20 de cada m�s. Ela dever� ser emitida no site: http://www8.receita.fazenda.gov.br/simplesnacional/ com seu CNPJ e c�digo de acesso.\r\n"
							+ "\r\n"
							+ "3- Atente-se! Voc� pode faturar no m�ximo R$ 4.800.000,00 entre Janeiro � Dezembro de cada ano.\r\n"
							+ "Caso seu faturamento anual ultrapasse esse valor, ao final do ano vigente voc�  ser� desenquadrado automaticamente do Simples Nacional. \r\n"
							+ "Ser� necess�rio procurar um contador de sua confian�a para que ele realize o reenquadramento da sua empresa no regime tribut�rio mais adequado.\r\n"
							+ "\r\n"
							+ "4- Atente-se! Caso voc� esteja enquadrado SIMPLES NACIONAL e  seu faturamento anual n�o ultrapasse o valor acima de R$ 81.000,00, voc� pode estar pagando mais imposto do que deveria!\r\n"
							+ "Ser� necess�rio procurar um contador de sua confian�a para que ele realize o reenquadramento da sua empresa no MEI (Microempreendedor Individual).\r\n"
							+ "Nesse regime de tributa��o, seu imposto ser� uma taxa fica de R$ 55,00.\n\n"
							
		};
			
	
	return lista[numAnexo-1];
	
	
	}
	
	
	
	
	
	
}
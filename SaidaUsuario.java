package empresa;

import java.util.List;

public class SaidaUsuario {
	//static Scanner = new Sc
	public static void qualAnexo() {
		String menuAnexo = "1- Anexo I   - Comércio\r\n"
				  + "2- Anexo II  - Industria\r\n"
				  + "3- Anexo III - Serviço\r\n"
				  + "4- Anexo IV  - Construção Civil\r\n"
				  + "5- Anexo V   - Serviços de cunho intelectual\r\n";
		System.out.println(menuAnexo);
	}
	
	public static void relatorio(List<Float> pagamento, float total, float imposto) {
		for (int i = 0; i <= 11; i++) {
			System.out.printf("Faturamento mes %d foi de: R$ %.2f\n", i+1, pagamento.get(i) );	
		}
		System.out.printf("\nSeu faturamento total dos ultimos 12 meses foi de: R$ %.2f\n\n",total);
		System.out.printf("\nSeu imposto do mês é de: R$ %.2f\n\n",imposto);
		
		if (total < 0)
		{
			System.out.println("Erro! O sistema não aceita valores negativos! Tente novamente");			
		}
		

		else if (pagamento.get(11)<=0)
		{
			System.out.printf("\nNão houve faturamento nesse mês. Você não terá imposto à pagar!");
		}
		else if (total > 4800000)
		{
			System.out.printf("\nUhul! Parece que você está voando!!! \r\n"
					+ "Você excedeu seu limite de faturamento para o Simples Nacional. Fique atento e converse com seu contador!  Pois precisa se enquadrar direitinho!\r\n"
					+ "");
		}
		else if (total <=81000)
		{
			System.out.printf("\nUhul! Parece que você está crescendo!!! \r\n"
					+ "Mas sabia que talvez você esteja pagando mais imposto do que deveria?! Converse com seu contador, pois você pode ser um Microempreendedor individual e pagar menos imposto! ");
		}
		
		
	}
	
	
	
public static int menuInicial() {
		
		
		int x,y;
		
		do {
			System.out.println("Como posso te ajudar hoje?\n"
					+ "\n1 - Planejamento tributário"
					+ "\n"
					+ "2 - Informações\r\n"
					 );
			try {
				x = EntradaUsuario.getInt();
			}catch (Exception e) {
				System.out.println("Opção inválida. Tente novamente!");
				return SaidaUsuario.menuInicial();
				
			}
			
		}while(x < 0 || x > 2);
		return x; 
		
	}

	public static String informacoes(int numAnexo) {
	
		String lista[] = {
				"\n Anexo I do Simples Nacional – Atividades do Comércio\r\n"
				+ "\r\n"
				+ "Estão incluídas neste anexo atividades diversas relacionada a comerciantes, lojistas e inclusive produtores que comercializam produtos. \r\n"
				+ "Confira exemplos: horticultura, distribuição de água por caminhões, produção de ovos, pesca de peixes em água salgada, extração de minério de alumínio, comércio a varejo de automóveis,  produção de carvão vegetal, entre outras.\r\n"
				+ "\r\n"
				+ "Consulte a lista completa do anexo de acordo com sua atividade://cnae-simples.com.br/\r\n"
				+ "\r\n"
				+ "**************Informações tributárias**************\r\n"
				+ " Para as atividades de Comércio:\r\n"
				+ "\r\n"
				+ "1- Sua alíquota de imposto pode variar de: 4,0% à 19,0% de acordo com o faturamento do mês. Consulte nosso simulador tributário na OPÇÃO 1 e simule se faturamento anual e imposto.\r\n"
				+ "\r\n"
				+ "2-Atente-se! Sua guia de imposto (DAS – Documento de Arrecadação do Simples Nacional), vence todo o dia 20 de cada mês. Ela deverá ser emitida no site: http://www8.receita.fazenda.gov.br/simplesnacional/ com seu CNPJ e código de acesso.\r\n"
				+ "\r\n"
				+ "3- Atente-se! Você pode faturar no máximo R$ 4.800.000,00 entre Janeiro à Dezembro de cada ano.\r\n"
				+ "Caso seu faturamento anual ultrapasse esse valor, ao final do ano vigente você  será desenquadrado automaticamente do Simples Nacional. \r\n"
				+ "Será necessário procurar um contador de sua confiança para que ele realize o reenquadramento da sua empresa no regime tributário mais adequado.\r\n"
				+ "\r\n "
				+ "4- Atente-se! Caso você esteja enquadrado SIMPLES NACIONAL e  seu faturamento anual não ultrapasse o valor acima de R$ 81.000,00, você pode estar pagando mais imposto do que deveria!\r\n"
				+ "Será necessário procurar um contador de sua confiança para que ele realize o reenquadramento da sua empresa no MEI (Microempreendedor Individual).\r\n"
				+ "Nesse regime de tributação, seu imposto será uma taxa fica de R$ 55,00. \n\n"
				
				
				
				+ "","\nAnexo II do Simples Nacional – Atividades da Indústria\r\n"
						+ "\r\n"
						+ "Estão incluídas neste anexo fábricas/indústrias e empresas industriais, dentre outras atividades como: beneficiamento de minérios de cobre, chumbo, zinco e outros minerais; frigoríficos; abatedouros; preservação de peixes, crustáceos e moluscos; fabricação de laticínios.\r\n"
						+ "\r\n"
						+ "Consulte a lista completa do anexo de acordo com sua atividade://cnae-simples.com.br/\r\n"
						+ "\r\n"
						+ "**************Informações tributárias**************\r\n"
						+ " Para as atividades de Comércio:\r\n"
						+ "\r\n"
						+ "1- Sua alíquota de imposto pode variar de: 4,0% à 19,0% de acordo com o faturamento do mês. Consulte nosso simulador tributário na OPÇÃO 1 e simule se faturamento anual e imposto.\r\n"
						+ "\r\n"
						+ "2-Atente-se! Sua guia de imposto (DAS – Documento de Arrecadação do Simples Nacional), vence todo o dia 20 de cada mês. Ela deverá ser emitida no site: http://www8.receita.fazenda.gov.br/simplesnacional/ com seu CNPJ e código de acesso.\r\n"
						+ "\r\n"
						+ "3- Atente-se! Você pode faturar no máximo R$ 4.800.000,00 entre Janeiro à Dezembro de cada ano.\r\n"
						+ "Caso seu faturamento anual ultrapasse esse valor, ao final do ano vigente você  será desenquadrado automaticamente do Simples Nacional. \r\n"
						+ "Será necessário procurar um contador de sua confiança para que ele realize o reenquadramento da sua empresa no regime tributário mais adequado.\r\n"
						+ "\r\n"
						+ "4- Atente-se! Caso você esteja enquadrado SIMPLES NACIONAL e  seu faturamento anual não ultrapasse o valor acima de R$ 81.000,00, você pode estar pagando mais imposto do que deveria!\r\n"
						+ "Será necessário procurar um contador de sua confiança para que ele realize o reenquadramento da sua empresa no MEI (Microempreendedor Individual).\r\n"
						+ "Nesse regime de tributação, seu imposto será uma taxa fica de R$ 55,00.\n\n"
						
						
					
					
					+ "","\nAnexo III do Simples Nacional – Atividades de Serviços\r\n"
						+ "\r\n"
						+ "Estão incluídos neste anexo serviços diversos,  como acupuntura, podologia, academias, laboratórios, instalação, reparos e manutenção, agências de viagens, lotéricas, escritórios de contabilidade, dentre outros. \r\n"
						+ "\r\n"
						+ "Consulte a lista completa do anexo de acordo com sua atividade://cnae-simples.com.br/\r\n"
						+ "\r\n"
						+ "**************Informações tributárias**************\r\n"
						+ " Para as atividades de Comércio:\r\n"
						+ "\r\n"
						+ "1- Sua alíquota de imposto pode variar de: 6,0% à 33,0% de acordo com o faturamento do mês. Consulte nosso simulador tributário na OPÇÃO 1 e simule se faturamento anual e imposto.\r\n"
						+ "\r\n"
						+ "2-Atente-se! Sua guia de imposto (DAS – Documento de Arrecadação do Simples Nacional), vence todo o dia 20 de cada mês. Ela deverá ser emitida no site: http://www8.receita.fazenda.gov.br/simplesnacional/ com seu CNPJ e código de acesso.\r\n"
						+ "\r\n"
						+ "3- Atente-se! Você pode faturar no máximo R$ 4.800.000,00 entre Janeiro à Dezembro de cada ano.\r\n"
						+ "Caso seu faturamento anual ultrapasse esse valor, ao final do ano vigente você  será desenquadrado automaticamente do Simples Nacional. \r\n"
						+ "Será necessário procurar um contador de sua confiança para que ele realize o reenquadramento da sua empresa no regime tributário mais adequado.\r\n"
						+ "\r\n"
						+ "4- Atente-se! Caso você esteja enquadrado SIMPLES NACIONAL e  seu faturamento anual não ultrapasse o valor acima de R$ 81.000,00, você pode estar pagando mais imposto do que deveria!\r\n"
						+ "Será necessário procurar um contador de sua confiança para que ele realize o reenquadramento da sua empresa no MEI (Microempreendedor Individual).\r\n"
						+ "Nesse regime de tributação, seu imposto será uma taxa fica de R$ 55,00. \n\n"
							
							
						+ "","\nAnexo IV do Simples Nacional – Atividades de Serviços de construção civil\r\n"
								+ "\r\n"
								+ "Estão inclusos neste anexo empresas diversas, que fornecem desde serviço de limpeza, vigilância, obras, construção de imóveis, serviços de pintura de edifícios em geral, perfuração e construção de poços de água, dentre outros. \r\n"
								+ "\r\n"
								+ "Consulte a lista completa do anexo de acordo com sua atividade://cnae-simples.com.br/\r\n"
								+ "\r\n"
								+ "**************Informações tributárias**************\r\n"
								+ " Para as atividades de Comércio:\r\n"
								+ "\r\n"
								+ "1- Sua alíquota de imposto pode variar de: 4,5% à 33,0% de acordo com o faturamento do mês. Consulte nosso simulador tributário na OPÇÃO 1 e simule se faturamento anual e imposto.\r\n"
								+ "\r\n"
								+ "2-Atente-se! Sua guia de imposto (DAS – Documento de Arrecadação do Simples Nacional), vence todo o dia 20 de cada mês. Ela deverá ser emitida no site: http://www8.receita.fazenda.gov.br/simplesnacional/ com seu CNPJ e código de acesso.\r\n"
								+ "\r\n"
								+ "3- Atente-se! Você pode faturar no máximo R$ 4.800.000,00 entre Janeiro à Dezembro de cada ano.\r\n"
								+ "Caso seu faturamento anual ultrapasse esse valor, ao final do ano vigente você  será desenquadrado automaticamente do Simples Nacional. \r\n"
								+ "Será necessário procurar um contador de sua confiança para que ele realize o reenquadramento da sua empresa no regime tributário mais adequado.\r\n"
								+ "\r\n"
								+ "4- Atente-se! Caso você esteja enquadrado SIMPLES NACIONAL e  seu faturamento anual não ultrapasse o valor acima de R$ 81.000,00, você pode estar pagando mais imposto do que deveria!\r\n"
								+ "Será necessário procurar um contador de sua confiança para que ele realize o reenquadramento da sua empresa no MEI (Microempreendedor Individual).\r\n"
								+ "Nesse regime de tributação, seu imposto será uma taxa fica de R$ 55,00.\n\n"
								
								
							+ "","\nAnexo V do Simples Nacional – Atividades de Serviços de cunho intelectual \r\n"
							+ "\r\n"
							+ "Estão inclusos neste anexo empresas que fornecem serviço de auditoria, jornalismo, tecnologia, publicidade, engenharia, design de produto e interiores, serviços de tradução, atividades veterinárias, dentre outros.\r\n"
							+ "\r\n"
							+ "Consulte a lista completa do anexo de acordo com sua atividade://cnae-simples.com.br/\r\n"
							+ "\r\n"
							+ "**************Informações tributárias**************\r\n"
							+ " Para as atividades de Comércio:\r\n"
							+ "\r\n"
							+ "1- Sua alíquota de imposto pode variar de: 15,5% à 30,5% de acordo com o faturamento do mês. Consulte nosso simulador tributário na OPÇÃO 1 e simule se faturamento anual e imposto.\r\n"
							+ "\r\n"
							+ "2-Atente-se! Sua guia de imposto (DAS – Documento de Arrecadação do Simples Nacional), vence todo o dia 20 de cada mês. Ela deverá ser emitida no site: http://www8.receita.fazenda.gov.br/simplesnacional/ com seu CNPJ e código de acesso.\r\n"
							+ "\r\n"
							+ "3- Atente-se! Você pode faturar no máximo R$ 4.800.000,00 entre Janeiro à Dezembro de cada ano.\r\n"
							+ "Caso seu faturamento anual ultrapasse esse valor, ao final do ano vigente você  será desenquadrado automaticamente do Simples Nacional. \r\n"
							+ "Será necessário procurar um contador de sua confiança para que ele realize o reenquadramento da sua empresa no regime tributário mais adequado.\r\n"
							+ "\r\n"
							+ "4- Atente-se! Caso você esteja enquadrado SIMPLES NACIONAL e  seu faturamento anual não ultrapasse o valor acima de R$ 81.000,00, você pode estar pagando mais imposto do que deveria!\r\n"
							+ "Será necessário procurar um contador de sua confiança para que ele realize o reenquadramento da sua empresa no MEI (Microempreendedor Individual).\r\n"
							+ "Nesse regime de tributação, seu imposto será uma taxa fica de R$ 55,00.\n\n"
							
		};
			
	
	return lista[numAnexo-1];
	
	
	}
	
	
	
	
	
	
}
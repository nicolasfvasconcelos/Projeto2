package empresa;

import java.util.List;

public class SaidaUsuario {
	//static Scanner = new Sc
	public static void qualAnexo() {
		String menuAnexo = "\n1- Anexo I - Comércio\r\n"
				  + "2- Anexo II - Industria\r\n"
				  + "3- Anexo III - Serviço\r\n"
				  + "4- Anexo IV – Construção Civil\r\n"
				  + "5- Anexo  V – Serviços de cunho intelectual\r\n";
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
	
		String lista[] = {"\nEstão incluídas neste anexo atividades diversas relacionada a comerciantes, lojistas e inclusive produtores que comercializam produtos. Confira exemplos: horticultura, distribuição\nde água por caminhões, produção de ovos, pesca de peixes em água salgada, extração de minério de alumínio, comércio a varejo de automóveis,  produção de carvão vegetal, entre outras.\r\n"
				+ "\n"
				+ "","\nEstão incluídas neste anexo fábricas/indústrias e empresas industriais, dentre outras atividades como: beneficiamento de minérios de cobre, chumbo, zinco e outros minerais;\nfrigoríficos; abatedouros; preservação de peixes, crustáceos e moluscos; fabricação de laticínios.\r\n"
						+ "\n"
					+ "","\nAnexo III do Simples Nacional – Atividades de Serviços\n\n"
							+ "Estão incluídos serviços diversos, como acupuntura, podologia, academias, laboratórios, instalação, reparos e manutenção, agências de viagens, lotéricas, escritórios de contabilidade,\ndentre outros.\r\n"
							+ " \n"
						+ "","\nAnexo IV do Simples Nacional – Atividades de Serviços de construção civil\n\n"
								+ "Aqui estão incluídas empresas diversas, que fornecem desde serviço de limpeza, vigilância, obras, construção de imóveis, serviços de pintura de edifícios em geral, perfuração\ne construção de poços de água, serviços advocatícios, dentre outros.\r\n"
								+ "\n"
							+ "","\nAnexo V do Simples Nacional – Atividades de Serviços de cunho intelectual\n\n"
									+ "Neste caso, são empresas que fornecem serviço de auditoria, jornalismo, tecnologia, publicidade, engenharia, design de produto e interiores, serviços de tradução, atividades\nveterinárias, dentre outros.\r\n"
									+ "" 
							
		};
			
	
	return lista[numAnexo-1];
	
	
	}
	
	
	
	
	
	
}
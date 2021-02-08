package empresa;

public class Anexo1Comercio extends Empresa{
		
		public void run() {
			this.digitaFaturamento();
			this.calculaImposto();
			SaidaUsuario.relatorio(getFaturamento(), getFaturamentoTotal(), getImposto());
		}
		
		
		@Override
		public void calculaImposto() {
			// TODO Auto-generated method stub
			this.setFaturamentoTotal();
			float mes12 = this.getFaturamento().get(11);
			
			if (this.getFaturamentoTotal() >= 0 && this.getFaturamentoTotal() <= 180000.00f) {
				this.setImposto(mes12 * 0.04f);
			}
			
			
			else if (this.getFaturamentoTotal() > 180000.00f && this.getFaturamentoTotal() <= 360000.00f) {
				this.setImposto(mes12 * 0.073f);
						
			}
			
			else if (this.getFaturamentoTotal() > 360000.00f && this.getFaturamentoTotal() <= 720000.00f) {
				this.setImposto(mes12 * 0.095f);
						
			}
			
			else if (this.getFaturamentoTotal() > 720000.00f && this.getFaturamentoTotal() <= 1800000.00f) {
				this.setImposto(mes12 * 0.107f);
			}
			
			else if (this.getFaturamentoTotal() > 1800000.00f && this.getFaturamentoTotal() <= 3600000.00f) {
				this.setImposto(mes12 * 0.143f);
			}
			
			else if (this.getFaturamentoTotal() > 3600000.00f && this.getFaturamentoTotal() <= 4800000.00f) {
				this.setImposto(mes12 * 0.19f);
}			
			
			else if (this.getFaturamentoTotal() > 4800000)
			{
				System.out.println("Seu perfil não se enquadra aos anexos do Simples Nacional!!!");
				
			}
			else if (this.getFaturamentoTotal() < 0)
			{
				System.out.println("Os valores de faturamento são inválidos!!! Por favor, repita o processo novamente!!!");
				
			}
		}
	}
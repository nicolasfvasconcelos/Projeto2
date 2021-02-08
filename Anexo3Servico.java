package empresa;

public class Anexo3Servico extends Empresa{


	public void run() {
		this.digitaFaturamento();
		this.calculaImposto();
		SaidaUsuario.relatorio(getFaturamento(), getFaturamentoTotal(), getImposto());
	}

	@Override
	public void calculaImposto() {
		// TODO Auto-generated method stub
		this.setFaturamentoTotal();
		//float mes12 = this.getFaturamentoTotal().get(11);
		float mes12 = this.getFaturamento().get(11);

		if (this.getFaturamentoTotal() >=0 && this.getFaturamentoTotal() <= 180000f) {
			this.setImposto(mes12 * 0.06f);
		}
		
		else if (this.getFaturamentoTotal()>180000f && this.getFaturamentoTotal()<=360000.00f) {
			this.setImposto(mes12 * 0.112f);
			
		}
		else if (this.getFaturamentoTotal()>360000f && this.getFaturamentoTotal()<=720000.00f) {
			this.setImposto(mes12 * 0.135f);
			
		}
		else if (this.getFaturamentoTotal()>720000f && this.getFaturamentoTotal()<=180000.00f) {
			this.setImposto(mes12 * 0.16f);
			
		}
		else if (this.getFaturamentoTotal()>180000f && this.getFaturamentoTotal()<=3600000.00f) {
			this.setImposto(mes12 * 0.21f);
			
		}
		else if (this.getFaturamentoTotal()>3600000f && this.getFaturamentoTotal()<=4800000.00f) {
			this.setImposto(mes12 * 0.33f);
			
		}			
		
		else if (this.getFaturamentoTotal() > 4800000)
		{
			System.out.println("Seu perfil n�o se enquadra aos anexos do Simples Nacional!!!");
			
			
		}
		else if (this.getFaturamentoTotal() < 0)
		{
			System.out.println("Os valores de faturamento s�o inv�lidos!!! Por favor, repita o processo novamente!!!");
			
		}
	}
}
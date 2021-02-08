package empresa;

public class AnexoVServiçosDeCunhoIntelectual extends Empresa{
	@Override
	public void calculaImposto() {
		// TODO Auto-generated method stub
		float mes12 = this.getFaturamento().get(11);
	
		

if (this.getFaturamentoTotal() <= 180000f) {
	this.setImposto(mes12 * 0.155f);
}

else if (this.getFaturamentoTotal() >180000f && this.getFaturamentoTotal() <= 360000.00f) {
	this.setImposto(mes12 * 0.18f);
}

else if (this.getFaturamentoTotal() >360000 && this.getFaturamentoTotal() <= 720000.00f) {
	this.setImposto(mes12 *0.0195f);
}

else if (this.getFaturamentoTotal() >720000f && this.getFaturamentoTotal() <= 1800000.00f) {
	this.setImposto(mes12 * 0.205f);
}

else if (this.getFaturamentoTotal() >180000f && this.getFaturamentoTotal() <= 3600000.00f) {
	this.setImposto(mes12 * 0.23f);
}

else if (this.getFaturamentoTotal() >360000f && this.getFaturamentoTotal() <= 4800000.00f) {
	this.setImposto(mes12 * 0.305f);
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

	@Override
	public void run() { 
		// TODO Auto-generated method stub
		this.digitaFaturamento();
		this.calculaImposto();
		SaidaUsuario.relatorio(getFaturamento(), getFaturamentoTotal(), getImposto());
	}


}
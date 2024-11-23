package Atividade14_2;
class NotificacaoEmail implements Email {
	@Override
	public void enviarEmail() {
		System.out.println("Enviando Email!");
	}
}

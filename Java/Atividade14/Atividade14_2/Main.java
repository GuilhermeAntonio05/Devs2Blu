package Atividade14_2;

public class Main {

	public static void main(String[] args) {
		NotificacaoEmail email = new NotificacaoEmail();
		NotificacaoSMS sms = new NotificacaoSMS();
		NotificacaoPush push = new NotificacaoPush();
		
		email.enviarEmail();
		sms.enviarSMS();
		push.enviarPushNotification();
	}
}

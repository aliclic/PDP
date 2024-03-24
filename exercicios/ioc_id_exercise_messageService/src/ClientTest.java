public class ClientTest {
	public static void main(String[] args) {
		String mensagem = "Ola Alex! Mostra um exemplo de DI.";
		String email = "alex@ifpb.edu.br";
		String telefone = "83988889999";

		// Declarando o injetor de dependência para a classe consumidora
		InjectorServiceMessage injector = null;
		Consumer app;

		//Enviando mensagem por email: criando o Injetor concreto de
		// serviço por email
		injector = new EmailServiceInjector();
		app = injector.getConsumer(); // Obtendo um consumidor compatível
		app.processMessages(mensagem, email); // Envia a mensagem

		System.out.println();

		//Enviando mensagem por SMS: criando o Injetor concreto
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(mensagem, telefone);

	}
}

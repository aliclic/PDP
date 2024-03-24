/**
 * O código de cliente que usará a classe Application para enviar mensagens de e-mail será como abaixo.
 * @author alexs
 *
 */
public class MyApplication extends Consumer {
	// classe está responsável por criar e inicializar o serviço de e-mail, para posteriormente utilizá-lo.
	// Isso leva à "dependência codificada"

	public MyApplication(InjectorServiceMessage injectorServiceMessage) {
        super(injectorServiceMessage);
    }
	
}

package lpv.tp.chatbot.watson;

import com.ibm.cloud.sdk.core.security.basicauth.BasicAuthConfig;
import com.ibm.watson.assistant.v2.Assistant;
import com.ibm.watson.assistant.v2.model.CreateSessionOptions;
import com.ibm.watson.assistant.v2.model.MessageInput;
import com.ibm.watson.assistant.v2.model.MessageOptions;
import com.ibm.watson.assistant.v2.model.MessageResponse;
import com.ibm.watson.assistant.v2.model.SessionResponse;

public class IntegracaoWatson {
	private static BasicAuthConfig config;
	private static Assistant assistant;
	private static CreateSessionOptions options;
	private static SessionResponse response;
	private static MessageInput input;
	
	
	
	public IntegracaoWatson() {
		config =  new BasicAuthConfig.Builder().username(Consts.LOGIN).password(Consts.PASSWORD).build();
		assistant = new Assistant(Consts.VERSION_DATE, config);
		assistant.setEndPoint(Consts.URL);
		options = new CreateSessionOptions.Builder(Consts.ASSISTANT_ID).build();
		response = assistant.createSession(options).execute().getResult();
	}

	public MessageResponse enviarMensagem(String mensagem) {
		input = new MessageInput.Builder()
				.text(mensagem)
				.build();
		
		MessageOptions messageOptions = new MessageOptions.Builder()
				.assistantId(Consts.ASSISTANT_ID)
				.sessionId(response.getSessionId())
				.input(input).build();
		
		return assistant.message(messageOptions).execute().getResult();
	}
}

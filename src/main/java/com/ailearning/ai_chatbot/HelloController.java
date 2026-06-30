package com.ailearning.ai_chatbot;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private final ChatClient chatClient;
	
	public HelloController(@Value("${spring.ai.openai.api-key}")String apiKey) {
		OpenAiApi groqApi = new OpenAiApi("https://api.groq.com/openai",apiKey);
		OpenAiChatOptions options = OpenAiChatOptions.builder().model("llama-3.1-8b-instant").build();
		OpenAiChatModel model = new OpenAiChatModel(groqApi, options);
		this.chatClient = ChatClient.create(model);
	}
	@GetMapping("/ask")
	public String ask(@RequestParam String question) {
		return chatClient.prompt().user(question).call().content();
	}
	

}

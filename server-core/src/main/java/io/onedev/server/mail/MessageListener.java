package io.onedev.server.mail;

import java.io.IOException;

import javax.mail.Message;
import javax.mail.MessagingException;

public interface MessageListener {
	
	void onReceived(Message message) throws MessagingException, IOException;
	
}
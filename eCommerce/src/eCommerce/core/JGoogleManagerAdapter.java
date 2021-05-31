package eCommerce.core;

import eCommerce.jGoogle.JGoogleManager;

public class JGoogleManagerAdapter implements GoogleService {

	@Override
	public void registerToSystem(String message) {
		JGoogleManager manager = new JGoogleManager();
		manager.send(message);
		
	}

	
		
	}




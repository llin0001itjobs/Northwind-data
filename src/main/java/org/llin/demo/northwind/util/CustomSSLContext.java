package org.llin.demo.northwind.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomSSLContext {

	@Value("server.ssl.trust-store")
	private String trustStore;
	
	@Value("server.ssl.key-store-password")
	private String password;
	
	public SSLContext getSSLContext() throws NoSuchAlgorithmException {
		
		// Create an SSLContext with the custom TrustManager
		SSLContext sslContext = SSLContext.getInstance("TLS");
		try {		
			// Load the custom truststore
			KeyStore truststore = KeyStore.getInstance("JKS");
			truststore.load(new FileInputStream(trustStore), password.toCharArray());

			// Create a TrustManagerFactory and initialize it with the truststore
			TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			trustManagerFactory.init(truststore);

			sslContext.init(null, trustManagerFactory.getTrustManagers(), null);
		} catch (KeyStoreException | CertificateException | IOException | KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sslContext;
	}
}

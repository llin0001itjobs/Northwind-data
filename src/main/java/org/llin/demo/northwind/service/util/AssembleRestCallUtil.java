package org.llin.demo.northwind.service.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AssembleRestCallUtil {
	
	@Value("${server.servlet.context-path}")
	private String contextPath;
	
	/**
	 * https://localhost/northwind-data/api/customer
	 * @param host
	 * @param entityName
	 * @return
	 */
	public String assembleApiUrl(String host, String entityName) {
		return "https://" + host + "/northwind-data/api/" + entityName.toLowerCase();
	}
}

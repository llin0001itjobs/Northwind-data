package org.llin.demo.northwind.data.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile({"dev", "test", "prod"})
@PropertySource(value={"classpath:application.properties","classpath:dev.application.properties"})
@Import({
    PropertyDefaultConfig.class,
    PropertyDevConfig.class,
    PropertyProdConfig.class
})
public class PropertyConfig {
	private final PropertyDefaultConfig propertyDefaultConfig;
	private final PropertyDevConfig propertyDevConfig;
	private final PropertyProdConfig propertyProdConfig;

	@Autowired
	public PropertyConfig(
	    PropertyDefaultConfig propertyDefaultConfig,
	    PropertyDevConfig propertyDevConfig,
	    PropertyProdConfig propertyProdConfig
	) {
	    this.propertyDefaultConfig = propertyDefaultConfig;
	    this.propertyDevConfig = propertyDevConfig;
	    this.propertyProdConfig = propertyProdConfig;
	}

	public PropertyDefaultConfig getPropertyDefaultConfig() {
		return propertyDefaultConfig;
	}

	public PropertyDevConfig getPropertyDevConfig() {
		return propertyDevConfig;
	}

	public PropertyProdConfig getPropertyProdConfig() {
		return propertyProdConfig;
	}

	
}


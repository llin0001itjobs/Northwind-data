package org.llin.demo.northwind;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyDevConfig {
			
	@Value("${server.ssl.key-store}")
	private String sslKeyStore;
	
	@Value("${server.ssl.key-store-type}")
	private String sslKeyStoreType;
	
	@Value("${server.ssl.key-store-password}")
	private String sslKeyStorePwd;
	
	@Value("${server.ssl.key-alias}")
	private String sslKeyAlias;
	
	@Value("${server.ssl.trust-store}")
	private String sslTrustStore;
	
	@Value("${hibernate.dialect}")
	private String hibernateDialect;
	
	@Value("${spring.datasource.url}")
	private String datasourceUrl;
	
	@Value("${spring.datasource.username}")
	private String datasourceUser;
	
	@Value("${spring.datasource.password}")
	private String datasourcePwd;
	
	@Value("${spring.jpa.show-sql}")
	private String jpaShowSql;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String jpaHibernateDDLauto;
	
	@Value("${spring.jpa.database-platform}")
	private String jpaDatabasePlatform;

	public String getSslKeyStore() {
		return sslKeyStore;
	}

	public void setSslKeyStore(String sslKeyStore) {
		this.sslKeyStore = sslKeyStore;
	}

	public String getSslKeyStorePwd() {
		return sslKeyStorePwd;
	}

	public void setSslKeyStorePwd(String sslKeyStorePwd) {
		this.sslKeyStorePwd = sslKeyStorePwd;
	}

	public String getSslKeyAlias() {
		return sslKeyAlias;
	}

	public void setSslKeyAlias(String sslKeyAlias) {
		this.sslKeyAlias = sslKeyAlias;
	}

	public String getSslTrustStore() {
		return sslTrustStore;
	}

	public void setSslTrustStore(String sslTrustStore) {
		this.sslTrustStore = sslTrustStore;
	}

	public String getHibernateDialect() {
		return hibernateDialect;
	}

	public void setHibernateDialect(String hibernateDialect) {
		this.hibernateDialect = hibernateDialect;
	}

	public String getDatasourceUrl() {
		return datasourceUrl;
	}

	public void setDatasourceUrl(String datasourceUrl) {
		this.datasourceUrl = datasourceUrl;
	}

	public String getDatasourceUser() {
		return datasourceUser;
	}

	public void setDatasourceUser(String datasourceUser) {
		this.datasourceUser = datasourceUser;
	}

	public String getDatasourcePwd() {
		return datasourcePwd;
	}

	public void setDatasourcePwd(String datasourcePwd) {
		this.datasourcePwd = datasourcePwd;
	}

	public String getJpaShowSql() {
		return jpaShowSql;
	}

	public void setJpaShowSql(String jpaShowSql) {
		this.jpaShowSql = jpaShowSql;
	}

	public String getJpaHibernateDDLauto() {
		return jpaHibernateDDLauto;
	}

	public void setJpaHibernateDDLauto(String jpaHibernateDDLauto) {
		this.jpaHibernateDDLauto = jpaHibernateDDLauto;
	}

	public String getJpaDatabasePlatform() {
		return jpaDatabasePlatform;
	}

	public void setJpaDatabasePlatform(String jpaDatabasePlatform) {
		this.jpaDatabasePlatform = jpaDatabasePlatform;
	}

	@Override
	public String toString() {
		return "PropertyDevConfig [sslKeyStore=" + sslKeyStore + ", sslKeyStorePwd=" + sslKeyStorePwd + ", sslKeyAlias="
				+ sslKeyAlias + ", sslTrustStore=" + sslTrustStore + ", hibernateDialect=" + hibernateDialect
				+ ", datasourceUrl=" + datasourceUrl + ", datasourceUser=" + datasourceUser + ", datasourcePwd="
				+ datasourcePwd + ", jpaShowSql=" + jpaShowSql + ", jpaHibernateDDLauto=" + jpaHibernateDDLauto
				+ ", jpaDatabasePlatform=" + jpaDatabasePlatform + "]";
	}

	
}

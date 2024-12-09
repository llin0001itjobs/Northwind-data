package org.llin.demo.northwind.data.entity;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = _EntityNames.SUPPLIER)
public class Supplier implements _Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "company_id")
	private Company company;

	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinTable(name = _EntityNames.PRODUCT_SUPPLIER, joinColumns = {
			@JoinColumn(name = "supplier_id") }, inverseJoinColumns = { @JoinColumn(name = "product_id") })
	private List<Product> products;

	@Value(value = "last_name")
	private String lastName;

	@Value(value = "first_name")
	private String firstName;

	@Value(value = "email_address")
	private String emailAddress;

	@Value(value = "job_title")
	private String jobTitle;

	@Value(value = "business_phone")
	private String businessPhone;

	@Value(value = "home_phone")
	private String homePhone;

	@Value(value = "mobile_phone")
	private String mobilePhone;

	@Value(value = "fax_number")
	private String faxNumber;

	private String address1;
	private String address2;
	private String city;

	@Value(value = "state_province")
	private String stateProvince;

	@Value(value = "zip_postal_code")
	private String zipPostalCode;

	@Value(value = "country_region")
	private String countryRegion;

	private String notes;

	@Value(value = "web_site_url")
	private String webSiteUrl;

	@Value(value = "web_site_title")
	private String webSiteTitle;

	@Value(value = "portrait_path")
	private String portraitPath;

	@Value(value = "portrait_title")
	private String portraitTitle;

	public Supplier() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getBusinessPhone() {
		return businessPhone;
	}

	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getZipPostalCode() {
		return zipPostalCode;
	}

	public void setZipPostalCode(String zipPostalCode) {
		this.zipPostalCode = zipPostalCode;
	}

	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getWebSiteUrl() {
		return webSiteUrl;
	}

	public void setWebSiteUrl(String webSiteUrl) {
		this.webSiteUrl = webSiteUrl;
	}

	public String getWebSiteTitle() {
		return webSiteTitle;
	}

	public void setWebSiteTitle(String webSiteTitle) {
		this.webSiteTitle = webSiteTitle;
	}

	public String getPortraitPath() {
		return portraitPath;
	}

	public void setPortraitPath(String portraitPath) {
		this.portraitPath = portraitPath;
	}

	public String getPortraitTitle() {
		return portraitTitle;
	}

	public void setPortraitTitle(String portraitTitle) {
		this.portraitTitle = portraitTitle;
	}

	public String generateProductIds() {
		return products.stream()
				.map(product -> String.valueOf(product.getId()))
				.collect(Collectors.joining(","));
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", company=" + company + ", product=" + products + ", lastName=" + lastName
				+ ", firstName=" + firstName + ", emailAddress=" + emailAddress + ", jobTitle=" + jobTitle
				+ ", businessPhone=" + businessPhone + ", homePhone=" + homePhone + ", mobilePhone=" + mobilePhone
				+ ", faxNumber=" + faxNumber + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city
				+ ", stateProvince=" + stateProvince + ", zipPostalCode=" + zipPostalCode + ", countryRegion="
				+ countryRegion + ", notes=" + notes + ", webSiteUrl=" + webSiteUrl + ", webSiteTitle=" + webSiteTitle
				+ ", portraitPath=" + portraitPath + ", portraitTitle=" + portraitTitle + super.toString() + "]";
	}

}

package org.llin.demo.northwind.controller;

import org.llin.demo.northwind.service.CustomerService;
import org.llin.demo.northwind.service.EmployeeService;
import org.llin.demo.northwind.service.ProductService;
import org.llin.demo.northwind.service.PurchaseOrderService;
import org.llin.demo.northwind.service.ShipperService;
import org.llin.demo.northwind.service.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	
    @GetMapping("/instruction")
    public ModelAndView showInstruction() {
		ModelAndView modelAndView = new ModelAndView("home");	
		execute(modelAndView);
		return modelAndView; 
    }
    
    //sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
    private void execute(ModelAndView modelAndView) {
    	String s;
    	CustomerService cs = new CustomerService();
    	s = cs.getCustomers();
    	modelAndView.addObject("Customers", s);
    	System.out.println(s);    	
    	EmployeeService es = new EmployeeService();
    	s = es.getEmployees();
    	modelAndView.addObject("Employees", s);
    	System.out.println(s);    	
    	ProductService ps = new ProductService();
    	s = ps.getProducts();
    	modelAndView.addObject("Products", s);
    	System.out.println(s);    	
    	PurchaseOrderService pos = new PurchaseOrderService();
    	s = pos.getPurchaseOrders();
    	modelAndView.addObject("PurchaseOrders", s);
    	System.out.println(s);
    	ShipperService ss = new ShipperService();
    	s = ss.getShippers();
    	modelAndView.addObject("Shippers", s);
    	System.out.println(s);
    	SupplierService shs = new SupplierService();
    	s = shs.getSuppliers();
    	modelAndView.addObject("Suppliers", s);
    	System.out.println(s);    	
    }
}
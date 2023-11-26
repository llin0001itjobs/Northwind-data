package org.llin.demo.northwind.controller;

import org.llin.demo.northwind.entity._Entity;
import org.llin.demo.northwind.service.CustomerOrderService;
import org.llin.demo.northwind.service.CustomerService;
import org.llin.demo.northwind.service.EmployeeService;
import org.llin.demo.northwind.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Controller
@RequestMapping("/home")
public class HomeController<T extends _Entity> {

	@Value("${data.sample.size}")
	private int dataSampleSize;

	@Autowired
	private CustomerOrderService co;

	@GetMapping("/entities")
	public ModelAndView showEntities() {
		ModelAndView modelAndView = new ModelAndView("home");
		execute(modelAndView);
		return modelAndView;
	}

	private void execute(ModelAndView modelAndView) {
		modelAndView.addObject("CustomerOrders", co.getCustomerOrders(dataSampleSize));
	}

}
package org.llin.demo.northwind.data.controller;

import java.util.List;

import org.llin.demo.northwind.data.repository.CustomerOrderRepository;
import org.llin.demo.northwind.data.repository.ProductRepository;
import org.llin.demo.northwind.data.repository.PurchaseOrderDetailRepository;
import org.llin.demo.northwind.data.repository.model.CategoryRatio;
import org.llin.demo.northwind.data.repository.model.FeeRangePerCount;
import org.llin.demo.northwind.data.repository.model.PriceRangePerListPrice;
import org.llin.demo.northwind.data.repository.model.PriceRangePerStandardCost;
import org.llin.demo.northwind.data.repository.model.QuantityPerCostRange;
import org.llin.demo.northwind.data.repository.model.QuantityPerUnitCost;
import org.llin.demo.northwind.data.repository.model.ShippingFeePerMonth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomController {

    @Autowired
    private CustomerOrderRepository customerOrderRepository;
    
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PurchaseOrderDetailRepository purchaseOrderDetailRepository;
    
    @GetMapping("/customerOrder/shippingFeePerMonth")
    public ResponseEntity<List<ShippingFeePerMonth>> getShippingFeePerMonth() {
        List<ShippingFeePerMonth> quantity = customerOrderRepository.shippingFeePerMonth();
        return ResponseEntity.ok(quantity);
    }    
    
    @GetMapping("/customerOrder/feeRangePerCount")
    public ResponseEntity<List<FeeRangePerCount>> getFeeRangePerCount() {
        List<FeeRangePerCount> priceRange = customerOrderRepository.feeRangePerCount();
        return ResponseEntity.ok(priceRange);
    }  
    
    @GetMapping("/product/categoryRatios")
    public ResponseEntity<List<CategoryRatio>> getCategoryRatios() {
        List<CategoryRatio> ratios = productRepository.categoryRatios();
        return ResponseEntity.ok(ratios);
    }
    
    @GetMapping("/product/priceRangePerStandardCost")
    public ResponseEntity<List<PriceRangePerStandardCost>> getPriceRangePerStandardCost() {
        List<PriceRangePerStandardCost> priceRange = productRepository.priceRangePerStandardCost();
        return ResponseEntity.ok(priceRange);
    }
       
    @GetMapping("/product/priceRangePerListPrice")
    public ResponseEntity<List<PriceRangePerListPrice>> getPriceRangePerListPrice() {
        List<PriceRangePerListPrice> priceRange = productRepository.priceRangePerListPrice();
        return ResponseEntity.ok(priceRange);
    }
           
    
    @GetMapping("/purchaseOrderDetail/quantityPerUnitCost")
    public ResponseEntity<List<QuantityPerUnitCost>> getQuantityPerUnitCost() {
        List<QuantityPerUnitCost> quantity = purchaseOrderDetailRepository.quantityPerUnitCost();
        return ResponseEntity.ok(quantity);
    }    
    
    @GetMapping("/purchaseOrderDetail/quantityPerCostRange")
    public ResponseEntity<List<QuantityPerCostRange>> getQuantityPerCostRange() {
        List<QuantityPerCostRange> priceRange = purchaseOrderDetailRepository.quantityPerCostRange();
        return ResponseEntity.ok(priceRange);
    }        
    
    
}
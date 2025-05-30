package com.telusko.TestWebApp.Service;

import com.telusko.TestWebApp.Repo.ProductRepo;
import com.telusko.TestWebApp.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "iphone", 30000),
//            new Product(102, "charger", 890),
//            new Product(103, "airpods", 6700)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

public Product getProductById(int prodId){
    return repo.findById(prodId).orElse(new Product(100, "No Item", 0));
}

    public void addProduct(Product prod){
       repo.save(prod);
    }

    public void updateProduct(Product prod) {

       repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}

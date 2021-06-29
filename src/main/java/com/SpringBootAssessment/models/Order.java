package com.SpringBootAssessment.models;

import com.SpringBootAssessment.repositories.OrderRepository;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name="orders")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="OrderNumber")
    private long orderNumber;

    @Column(name="email", length = 50)
    private String email;

    @Column(name="totalPrice", length = 50)
    private Double totalPrice;

//
//    @RequestMapping("/orderList")
//    List<OrderList> ordersList = new ArrayList<OrderRepository>();



        /*
    {}+{}{}{}{}{}{{}{}{}+{}{}{}+{}{}{}+{}{}{}+{}{}{}+{}{}{}{}+{}{}{}{}{}{{}{}{}+{}{}{}+{}{}{}+{}{}{}+{}{}{}+{}{}{}
     */ //   Constructor

    public Order() {

    }



    public Order(long orderNumber, String email, Double totalPrice) {

        this.orderNumber = orderNumber;
        this.email = email;
        this.totalPrice = totalPrice;
    }



    /*
    {}+{}{}{}{}{}{{}{}{}+{}{}{}+{}{}{}+{}{}{}+{}{}{}+{}{}{}{}+{}{}{}{}{}{{}{}{}+{}{}{}+{}{}{}+{}{}{}+{}{}{}+{}{}{}
     */ //   Getters and Setters


    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

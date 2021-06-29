package com.SpringBootAssessment.models;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Entity // << this is how hibernate knows to make tables out of the class
@Data
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




//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Post> posts;

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

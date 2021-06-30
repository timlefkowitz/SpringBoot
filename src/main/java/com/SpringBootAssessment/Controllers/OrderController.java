package com.SpringBootAssessment.Controllers;


import java.math.BigInteger;
import com.SpringBootAssessment.models.Order;
import com.SpringBootAssessment.repositories.OrderRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class OrderController {

    private final OrderRepository orderDao;

//    @Autowired
    public OrderController(OrderRepository orderDao){
            this.orderDao = orderDao;
    }

    // Show Constructors

    @GetMapping("/show")
    public String show(Model view){
        view.addAttribute("ads", orderDao.findAll());
        return"orders/show";
    }

    @GetMapping("/show/{id}")
    public String showById(@PathVariable Long id, Model view){
        view.addAttribute("ads", orderDao.getById(id));
        return "orders/show";
    }


        /////////////// Create Controllers

    @GetMapping("/create")
    public String IndexForCreate(){
        return"orders/create";
    }

    @PostMapping("/create")
    public String addNewOrder(@RequestParam(name="email") String email, @RequestParam(name="totalPrice") Double totalPrice){

        Order n = new Order();
        n.setTotalPrice(totalPrice);
        n.setEmail(email);
        orderDao.save(n);
        return "redirect:/show";
    }



}

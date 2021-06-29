package com.SpringBootAssessment.Controllers;


import com.SpringBootAssessment.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    private final OrderRepository orderDao;

    @Autowired
    public OrderController(OrderRepository orderDao){
            this.orderDao = orderDao;
    }

    @GetMapping("/show")
    public String index(Model model){
        model.addAttribute("Allorders", orderDao.findAll());
        model.addAttribute("topAd", orderDao.findAllByEmail("link@halo.com"));
        return"orders/show";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("Allorders", orderDao.findAll());
        model.addAttribute("topAd", orderDao.findAllByEmail("link@halo.com"));
        return"orders/create";
    }

//        @GetMapping("/orders/create")
//        public String CreateOrder(Model model){
////        model.addAttribute("total_price", new Order )
////        model.addAttribute()
//        }

    @PostMapping("/orders/{id}/update")
    public String Modorder(@PathVariable long id){
        orderDao.deleteById(id);
        return "redirect:/index";
    }


    @PostMapping("/orders/{id}/delete")
    public String destroy(@PathVariable long id){
//        orderDao.deleteById(id);
        return "redirect:/index";
    }




}

package com.SpringBootAssessment.Controllers;



import com.SpringBootAssessment.models.Order;
import com.SpringBootAssessment.repositories.OrderRepository;

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

    @GetMapping("/show")
    public String show(Model view){
        view.addAttribute("ads", orderDao.findAll());
        return"orders/show";
    }





        /////////////// Create Controllers

    @GetMapping("/create")
    public String IndexForCreate(@ModelAttribute Model ViewModel){
       ViewModel.addAttribute("post", orderDao.findAll());
        return"orders/create";
    }

    @PostMapping("/create")
    public @ResponseBody String addNewUser (@RequestParam Double totalPrice, @RequestParam String email){

        Order n = new Order();
        n.setTotalPrice(totalPrice);
        n.setEmail(email);
        orderDao.save(n);
        return "orders/create";
    }


    @GetMapping("/orders/{id}")
    public String Modorder(@PathVariable long OrderNumber){
        orderDao.deleteById(OrderNumber);
        return "redirect:/index";
    }


    @GetMapping("/orders/{id}/update")
    public String destroy(Model model){
//        orderDao.deleteById(id);
        return "redirect:/index";
    }

    @PostMapping("/orders/{id}/update")
    public String updateById(@PathVariable long id){
//        orderDao.deleteById(id);
        return "redirect:/index";
    }

    @PostMapping("/orders/{id}/delete")
    public String destroyById(Model model){
//        orderDao.deleteById(id);
        return "redirect:/index";
    }




}

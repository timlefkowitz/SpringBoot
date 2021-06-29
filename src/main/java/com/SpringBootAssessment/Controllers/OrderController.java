package com.SpringBootAssessment.Controllers;



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

//    @GetMapping("/create")
//    public String IndexForCreate(@ModelAttribute Model ViewModel){
//       ViewModel.addAttribute("post", orderDao.findAll());
//        return"orders/create";
//    }
//
//
//    @PostMapping("/orders/{id}/update")
//    public String Modorder(@PathVariable long id){
//        orderDao.deleteById(id);
//        return "redirect:/index";
//    }
//
//
//    @PostMapping("/orders/{id}/delete")
//    public String destroy(@PathVariable long id){
////        orderDao.deleteById(id);
//        return "redirect:/index";
//    }




}

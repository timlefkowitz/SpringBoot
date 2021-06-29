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

    @GetMapping("/show2")
    public String show2(Model view){
        view.addAttribute("ads", orderDao.findAll());
        return"orders/show";
    }
        /////////////// Create Controllers

    @GetMapping("/create")
    public String IndexForCreate(@ModelAttribute Model ViewModel){
       ViewModel.addAttribute("orders", orderDao.findAll());
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



    @GetMapping("/posts/{id}/edit")
    public String viewEditForm(@PathVariable Long id, Model viewModel) {
        viewModel.addAttribute("post", orderDao.getOne(id));
        return "/posts/edit";
    }

//    @PostMapping("/posts/{id}/edit")
//    public String updatePost(@PathVariable Long id, @ModelAttribute Order postToBeUpdated) {
//
//        postToBeUpdated.setOrderNumber(order);
//        orderDao.save(postToBeUpdated);
//        return "redirect:/posts/" + postToBeUpdated.getOrderNumber();
//    }
//
//    @PostMapping("posts/{id}/delete")
//    public String deletePost(@PathVariable Long OrderNumber) {
//        Order post = orderDao.
//        orderDao.delete(post);
//        return "redirect:/posts";
//    }




}

package com.SpringBootAssessment.Controllers;


import com.SpringBootAssessment.models.Order;
import com.SpringBootAssessment.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AdController {

    @Autowired
    private final OrderRepository adDao;

    public AdController(OrderRepository adDao){
        this.adDao = adDao;
    }

    @GetMapping("/")
    public String root(Model model) {
        model.addAttribute("indexCurrent", adDao.findAll());
        return "index";
    }

    @RequestMapping(value = "message", method = RequestMethod.GET)
    public String messages(Model model) {
        model.addAttribute("messages", adDao.findAll());
        return "message/list";
    }



//    @GetMapping("/create")
//    public String viewCreateForm(Model viewModel) {
//        viewModel.addAttribute("orders", new Order());
//        return "orders/create";
//    }

//    @PostMapping(path="/add") //this means that this class is a controller. I'm going throught the docs to see why my post isn't working...
//    public @ResponseBody String addNewUser (@RequestParam Double totalPrice, @RequestParam String email){
//
//
//        Order n = new Order();
//        n.setTotalPrice(totalPrice);
//        n.setEmail(email);
//        OrderRepository.save(n);
//        return "Saved";
//
//
//    }

}

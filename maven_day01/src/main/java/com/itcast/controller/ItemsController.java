package com.itcast.controller;

import com.itcast.domain.items;
import com.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetall(Model model){
        items a = itemsService.findById(8);

        model.addAttribute("item",a);
        return "itemDetail";
    }
}

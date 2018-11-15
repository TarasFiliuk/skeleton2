package forcelate.skeleton.skeleton2.controller;

import forcelate.skeleton.skeleton2.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
    @Autowired
    ItemService itemService;

    @GetMapping("/get")
    public String getItem1() {
        return itemService.getItems();
    }
}

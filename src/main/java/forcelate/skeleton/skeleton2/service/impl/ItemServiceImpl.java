package forcelate.skeleton.skeleton2.service.impl;

import forcelate.skeleton.skeleton2.service.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public String getItems() {
        return "Forcelate";
    }
}

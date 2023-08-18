
package pos.layerd.controller;

import java.util.ArrayList;
import pos.layerd.dto.ItemDto;
import pos.layerd.service.ServiceFactory;
import pos.layerd.service.custom.ItemService;


public class ItemController {
     ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);

    public String addItem(ItemDto itemDto) throws Exception {
        return itemService.addItem(itemDto);
    }

    public ArrayList<ItemDto> getAllItem() throws Exception {
        return itemService.getAllItem();
    }

    public String updateItem(ItemDto itemDto) throws Exception {
        return itemService.updateItem(itemDto);
    }

    public String deleteItem(String id) throws Exception {
        return itemService.deleteItem(id);
    }

    public ItemDto getItem(String custId) throws Exception {
        return itemService.getItem(custId);
    }
    
}

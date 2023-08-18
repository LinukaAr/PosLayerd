
package pos.layerd.service.custom;

import java.util.ArrayList;
import pos.layerd.dto.ItemDto;
import pos.layerd.service.SuperService;


public interface ItemService extends SuperService{
     String addItem(ItemDto itemDto) throws Exception;

    String updateItem(ItemDto itemDto) throws Exception;

    String deleteItem(String id) throws Exception;

    ItemDto getItem(String id) throws Exception;

    ArrayList<ItemDto> getAllItem() throws Exception;  
}

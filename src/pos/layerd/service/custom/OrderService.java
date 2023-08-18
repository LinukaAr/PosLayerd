
package pos.layerd.service.custom;
import pos.layerd.dto.OrderDto;
import pos.layerd.service.SuperService;

public interface OrderService extends SuperService{
    String placeOrder(OrderDto dto) throws Exception;
    
}

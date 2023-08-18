
package pos.layerd.controller;
import pos.layerd.dto.OrderDto;
import pos.layerd.service.ServiceFactory;
import pos.layerd.service.custom.OrderService;

public class OrderController {
     private OrderService orderService = (OrderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);

    public String placeOrder(OrderDto orderDto) throws Exception{
        return orderService.placeOrder(orderDto);
    }
    
}

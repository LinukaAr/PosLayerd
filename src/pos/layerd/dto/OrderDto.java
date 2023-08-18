
package pos.layerd.dto;
import java.util.List;

public class OrderDto {
     private String orderId;
    private String customerid;
    
    private List<OrderDetailDto> orderDetailDtos;

    public OrderDto() {
    }

    public OrderDto(String orderId, String customerid, List<OrderDetailDto> orderDetailDtos) {
        this.orderId = orderId;
        this.customerid = customerid;
        this.orderDetailDtos = orderDetailDtos;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the customerid
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * @param customerid the customerid to set
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * @return the orderDetailDtos
     */
    public List<OrderDetailDto> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    /**
     * @param orderDetailDtos the orderDetailDtos to set
     */
    public void setOrderDetailDtos(List<OrderDetailDto> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", customerid=" + customerid + ", orderDetailDtos=" + orderDetailDtos + '}';
    }
    
}

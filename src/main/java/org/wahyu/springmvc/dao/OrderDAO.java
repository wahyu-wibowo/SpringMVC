package org.wahyu.springmvc.dao;
 
import java.util.List;
 
import org.wahyu.springmvc.model.CartInfo;
import org.wahyu.springmvc.model.OrderDetailInfo;
import org.wahyu.springmvc.model.OrderInfo;
import org.wahyu.springmvc.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}
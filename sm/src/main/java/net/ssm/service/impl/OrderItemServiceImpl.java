package net.ssm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.ssm.service.OrderItemService;
import net.ssm.util.Pager;
import net.ssm.vo.OrderItem;
@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService{

	public void save(OrderItem object) {
	}

	public void delete(OrderItem object) {
	}

	public void delete(Integer id) {
	}

	public void delete(String ids) {
	}

	public void update(OrderItem object) {
	}

	public OrderItem findById(Integer id) {
		return null;
	}

	public List<OrderItem> findAll() {
		return null;
	}

	public List<OrderItem> findAll(OrderItem object) {
		return null;
	}

	public List<OrderItem> findAll(Pager pager) {
		return null;
	}

	public List<OrderItem> findAll(Pager pager, OrderItem object) {
		return null;
	}

	public int getDataCount() {
		return 0;
	}

	public int getDataCount(OrderItem object) {
		return 0;
	}

}

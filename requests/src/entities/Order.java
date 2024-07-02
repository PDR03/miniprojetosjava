package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus Status;
	private Clients client;
	private List<OrderItem> items = new ArrayList<>();
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	//Constructors
	public Order(Date moment, OrderStatus status, Clients client) {
		this.moment = moment;
		this.Status = status;
		this.client = client;
		
	}

	//Getters and Setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return Status;
	}

	public void setStatus(OrderStatus status) {
		Status = status;
	}
	
	public List<OrderItem> getItems() {
		return items;
	}
	
	//methods
	
	public void addItem(OrderItem item) {
		items.add(item);
		
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
		
	}
	public double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
}

package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enums.Status;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private Status status;
	private Client client;
	
	public Order(Date moment, Status status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	private List<Product> itemList = new ArrayList<>();

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Product> getItemList() {
		return itemList;
	}
	
	public void addItem(Product item) {
		itemList.add(item);
		
	}
	
	public void removeItem(Product item) {
		itemList.remove(item);
		
	}

	public double total() {
		double sum = 0.0;
		for (Product item : itemList) {
			sum += item.subTotal();
		}
		return sum;
	}

	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order Moment: " + sdf.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append(client + "\n");
		sb.append("Order Items:\n");
		for (Product item : itemList) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}

	
}
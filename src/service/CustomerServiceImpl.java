package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    public static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Linh", "linh@codegym.vn", "Ha Noi"));
        customers.put(2, new Customer(2, "Linh1", "linh1@codegym.vn", "Ha Noi 1"));
        customers.put(3, new Customer(3, "Linh2", "linh2@codegym.vn", "Ha Noi 2"));
        customers.put(4, new Customer(4, "Linh3", "linh3@codegym.vn", "Ha Noi 3"));
        customers.put(5, new Customer(5, "Linh4", "linh4@codegym.vn", "Ha Noi 4"));
        customers.put(6, new Customer(6, "Linh5", "linh5@codegym.vn", "Ha Noi 5"));

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);

    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}

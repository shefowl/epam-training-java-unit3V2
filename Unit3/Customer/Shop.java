package by.epam.Unit3.Customer;

import java.util.Arrays;

public class Shop {
    public static final int N = 5;
    private Customer [] customers;

    public Shop() {
        customers = new Customer[N];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if(o == null){
            return false;
        }

        if(this.getClass() != o.getClass()){
            return false;
        }

        Shop shop = (Shop) o;
        return Arrays.equals(getCustomers(), shop.getCustomers());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCustomers());
    }

    public Shop(Customer[] customers) {
        this.customers = customers;
    }


    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
}

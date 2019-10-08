package by.epam.Unit3.Customer;

public class CustomerLogic {
    public static Customer [] sortBySurname(Customer [] customers){
        for (int i = 0; i < customers.length; i++) {
            String min = customers[i].getSurname();
            int minIndex = i;
            for (int j = i+1; j < customers.length; j++) {
                for(int k = 0; k < customers[j].getSurname().length() || k < min.length(); k++){
                    if (customers[j].getSurname().charAt(k) < min.charAt(k)) {
                        min = customers[j].getSurname();
                        minIndex = j;
                        break;
                    }
                    else{
                        if(customers[j].getSurname().charAt(k) != min.charAt(k)){
                            break;
                        }
                    }
                }
            }
            if (i != minIndex) {
                Customer tmp = customers[i];
                customers[i] = customers[minIndex];
                customers[minIndex] = tmp;
            }
        }
        return customers;
    }

    public static boolean isCardInInterval(Customer customer, int leftRange, int rightRange){
        if(customer.getCreditCardNumber() > leftRange && customer.getCreditCardNumber() < rightRange){
            return true;
        }
        return false;
    }
}

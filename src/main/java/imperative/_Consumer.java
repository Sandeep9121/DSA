package imperative;

public class _Consumer {
    static class Customer{
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;

        }
    }

    // imperative way .
    static void greetCustomer(Customer customer){
        System.out.println("Hello"+customer.name+
        " "+"thanks for registering :"+customer.phoneNumber);

    }
    public static void main(String[] args) {
      greetCustomer(new Customer("Sandeep ","8989898998"));
    }
}

package DependencyInjection;

class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String id) {
        return "Customer Name for ID " + id + " is Bhavanshu";
    }
}

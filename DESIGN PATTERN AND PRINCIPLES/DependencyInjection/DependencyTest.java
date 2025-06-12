package DependencyInjection;

public class DependencyTest {

    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);
        service.getCustomer("C500");
    }
    
}

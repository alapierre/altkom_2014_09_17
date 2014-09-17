package pl.altkom.logistic.core.model;


import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lukasz s ...
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
@Table(name = "UZER")
public class User extends BaseEntity{
    
    private String firstName;
    
    private String lastName;

    @ManyToMany
    private Collection<Customer> customers;
    
    @OneToMany
    @JoinColumn(name = "UZER_ID")
    private Collection<Car> cars;
    @ManyToOne
    private Department department;


    
//    @OneToMany
//    private Collection<Customer> customers;
   
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Collection<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Collection<Customer> customers) {
        this.customers = customers;
    }
    
    public Collection<Car> getCars() {
        return cars;
    }

    public void setCars(Collection<Car> cars) {
        this.cars = cars;
    }
    
    
}

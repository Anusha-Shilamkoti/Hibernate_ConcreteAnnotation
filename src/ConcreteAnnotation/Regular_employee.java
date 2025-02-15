package ConcreteAnnotation;
import javax.persistence.*;  

@Entity  
@Table(name="regularemployee102")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class Regular_employee extends Employee{  
      
@Column(name="salary")    
private float salary;  
  
public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}
@Column(name="bonus")     
private int bonus;  

public int getBonus() {
	return bonus;
}

public void setBonus(int bonus) {
	this.bonus = bonus;
}


  
//setters and getters  
}  
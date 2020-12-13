package problemSolving6;

public class Employee {
    private String name;
    private int id;
    private Address address;
    private Insurance insurance;

    public Employee(String name, int id, Address address, Insurance insurance){
        setName(name);
        setId(id);
        setAddress(address);
        setInsurance(insurance);
    }

    @Override
    public String toString() {
        String insuranceString;
        if(getInsurance() == null)
            insuranceString = " No insurance details";
        else
            insuranceString = getInsurance().toString();
        return "Name: " + getName() + "\nID: " + getId() + "\nAddress: " + getAddress() + "\nInsurance Details: " + insuranceString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}

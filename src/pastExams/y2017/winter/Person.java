package pastExams.y2017.winter;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        setName(name);
        setAddress(address);
    }

    public Person(){
        this("not available","not available");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nAddress: " + getAddress();
    }
}

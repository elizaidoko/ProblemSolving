package problemSolving6;

public class TestEmployee {
    public static void main(String[] args){
        String output = "Displaying the state of the 5 Employee objects at this point";

        Insurance insurance1 = new Insurance("Irish Life Excel",5468292);
        Insurance insurance2 = new Insurance("AXA Superlative Life", 9374633);
        Insurance insurance3 = new Insurance("LA Brokers Golden Goose", 7372642);

        Employee employee1 = new Employee("Joseph Bloggs III", 536272, new Address("123 Hyde Road","Ballydehob ","Cork","Ireland","R54HT7D"),insurance1);
        Employee employee2 = new Employee("Marie O Connell",982111,new Address("Boreen na dTonnta ","Connemara","Galway","Ireland","PG52K3B"), insurance2);
        Employee employee3 = new Employee("Mark Mc Manus", 352723, new Address("Street: 87 Racecourse Lawn","Tralee","Kerry ","Ireland ","AH78P36"), insurance3);

        Employee[] allEmployees = new Employee[5];

        allEmployees[0] = employee1;
        allEmployees[1] = employee2;
        allEmployees[2] = employee3;

        for(int i=0; i<allEmployees.length;i++){
            output += "\n\nEmployee " + (i+1) + "\n\n";

            if(allEmployees[i] != null){
                output += allEmployees[i].toString() + "\n";
            }
            else output += "null" + "\n";
        }

        output += "\n\nNow searching through the array of Employee objects to find any employees whose name contains the word 'joseph'" +
        "\n\nThe details of all employees whose name contains the word 'joseph' is: ";

        int subscript = -1;

        for(int i=0; i<allEmployees.length;i++){
            if(allEmployees[i] != null && allEmployees[i].getName().toLowerCase().contains("joseph")){
                output += "\n\n" + allEmployees[i];

                subscript = i;
            }
        }

        allEmployees[subscript].setAddress(new Address("56 Main Street","Thurles", "Tipperary","Ireland","B87JH5Q"));

        output += "\n\n\nNow chamgimg the address of Joesph Bloggs III \n\n\nDisplaying the State of Joseph Bloggs III\n\n";

        output += allEmployees[subscript].toString();

        employee2.setInsurance(null);

        output += "\n\nNow removing the Insuranve details completely for the second employee object\n\n" +
        "Displaying the state of the second employee now gives\n\n" + employee2.toString();

        output += "\n\nDisplaying the state of the second employee insurance object now gives\n\n" + insurance2.toString() +
        "\n\nDisplaying the state of all employees who hail from Kerry";


        for(int i=0; i<allEmployees.length;i++){
            if(allEmployees[i] != null && allEmployees[i].getAddress().getCounty().toLowerCase().contains("kerry")){
                output += "\n\n" + allEmployees[i];

            }
        }

        Employee employee4 = new Employee("Marie O Connell",982111,new Address("Boreen na dTonnta", "Connemara", "Galway","Ireland ", "PG52K3B"), null);
        allEmployees[3] = employee4;

        Insurance insurance5 = new Insurance("LA Brokers Golden Goose", 7372642);
        Employee employee5 = new Employee("Mark Mc Manus",352723,new Address("87 Racecourse Lawn","Tralee ","Kerry","Ireland","AH78P36"), insurance5);
        allEmployees[4] = employee5;

        output += "\n\nDisplaying the state of the 5 Employee objects at this point in alphabetical order by name\n\n";

        sortEmployeesByName(allEmployees);

        for(int i=0; i<allEmployees.length;i++){
            output += "\n\nEmployee " + (i+1) + "\n\n";

            if(allEmployees[i] != null){
                output += allEmployees[i].toString() + "\n";
            }
            else output += "null" + "\n";
        }

        System.out.println(output);

    }

    public static void sortEmployeesByName(Employee[] employes){
        for ( int j=0; j < employes.length-1; j++ ) {
            int min = j;
            for (int k = j + 1; k < employes.length; k++)
                if (employes[k].getName().compareTo(employes[min].getName()) < 0) min = k;

            String temp = employes[j].getName();
            String hold = employes[j].getName();
            hold = employes[min].getName();
            String hold2 = employes[min].getName();
            hold2 = temp;
        }
    }
}

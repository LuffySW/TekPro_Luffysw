abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
    
    public StaffMember (String eName, String eAddress, String ePhone ){
        name = eName;
        address = eAddress;
        phone = ePhone;
       }

    public String toString(){
        String resuit = "Name : " + name + "\n";
        
        resuit += "Address: "+ address + "\n";
        resuit += "Phone : " + phone;

        return resuit;
    }
    
    public abstract double pay();
}


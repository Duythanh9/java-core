package Java.object;

import java.util.List;

public class Person {
    private long id;
    private String name;
    private String address;
    private List<Address> list;

    public Person(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    
    public Person() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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

    static class Address{
        private String street;
        private String city;
        private String state;
        private String zip;
        public String getStreet() {
            return street;
        }
        public void setStreet(String street) {
            this.street = street;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        public String getZip() {
            return zip;
        }
        public void setZip(String zip) {
            this.zip = zip;
        }
        public Address() {
        }
        @Override
        public String toString() {
            return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
                    +  "]";
        }

        
        

        
    }

    public List<Address> getList() {
        return list;
    }



    public void setList(List<Address> list) {
        this.list = list;
    }



    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", address=" + address + ", list=" + list + "]";
    }

    

    
    
}
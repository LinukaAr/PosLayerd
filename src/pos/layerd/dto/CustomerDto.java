
package pos.layerd.dto;


public class CustomerDto {
    private String id;
    private String titile;
    private String name;
    private String dob;
    private Double salary;
    private String address;
    private String city;
    private String province;
    private String zip;



    public CustomerDto() {
    }

    public CustomerDto(String id, String titile, String name, String dob, Double salary, String address, String city, String province, String zip) {
        this.id = id;
        this.titile = titile;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
        this.address = address;
        this.city = city;
        this.province = province;
        this.zip = zip;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the titile
     */
    public String getTitile() {
        return titile;
    }

    /**
     * @param titile the titile to set
     */
    public void setTitile(String titile) {
        this.titile = titile;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "id=" + id + ", titile=" + titile + ", name=" + name + ", dob=" + dob + ", salary=" + salary + ", address=" + address + ", city=" + city + ", province=" + province + ", zip=" + zip + '}';
    }     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

/**
 *
 * @author 3z
 */
public class SubDateBase extends DataBase{
    private String cityName;
    private int ssnNum;

    public SubDateBase(String firstName, String lastName, String phoneNumber, String city, int ssn) {
        super(firstName, lastName, phoneNumber);
        setCityName(city);
        setSsnNum(ssn);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getSsnNum() {
        return ssnNum;
    }

    public void setSsnNum(int ssnNum) {
        this.ssnNum = ssnNum;
    }
    
    public String toString(){
        return String.format("%s City: %s \n SSN: %d", super.toString(), getCityName(), getSsnNum());
    }
    
    
}

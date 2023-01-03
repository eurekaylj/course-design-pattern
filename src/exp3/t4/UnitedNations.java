package exp3.t4;

import java.util.Hashtable;

public abstract class UnitedNations {
    protected String unitedNationsName;
    protected Hashtable<String, Country> countryList;

    public UnitedNations() {
        this.countryList = new Hashtable<String, Country>();
    }

    public void addCountry(Country country) {
        if (country == null)
            return;
        countryList.put(country.getCountryName(), country);
    }

    public void deleteCountry(Country country) {
        if (country == null)
            return;
        countryList.remove(country.getCountryName());
    }

    protected void sendMessage(String from, String to, String msg) {
        Country country = countryList.get(to);
        if (country != null)
            country.receiveMessage(from, msg);
        else
            System.out.println("对不起该国家可能还未加入UN！");
    }

    public void receiveMessage(String from, String to, String msg) {
        sendMessage(from, to, msg);
    }

    public String getUnitedNationsName() {
        return unitedNationsName;
    }

    public void setUnitedNationsName(String unitedNationsName) {
        unitedNationsName = unitedNationsName;
    }
}

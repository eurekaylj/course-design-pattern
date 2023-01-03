package exp3.t4;

public class Client {
    public static void main(String[] args) {
        UnitedNations[] unitedNations = new UnitedNations[3];
        unitedNations[0] = new WTO();
        unitedNations[1] = new WHO();
        unitedNations[2] = new WFC();

        Country[] countries = new Country[4];
        countries[0] = new US();
        countries[1] = new China();
        countries[2] = new UK();
        countries[3] = new Japan();

        for (UnitedNations unitedNation : unitedNations) {
            for (Country country : countries) {
                unitedNation.addCountry(country);
            }
        }

        for (Country country : countries) {
            country.setWfc(unitedNations[2]);
            country.setWho(unitedNations[1]);
            country.setWto(unitedNations[0]);
        }

        countries[0].sendMessageByWto("China", "US send message to China through WTO.");
        countries[1].sendMessageByWho("US", "China send message to US through WHO.");
        countries[2].sendMessageByWto("China", "UK send message to China through WTO.");
        countries[3].sendMessageByWfc("China", "Japan send message to China through WFC.");
    }
}


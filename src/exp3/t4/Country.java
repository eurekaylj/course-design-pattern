package exp3.t4;

public abstract class Country {
    protected String countryName;
    protected UnitedNations wto, who, wfc;

    public void sendMessageByWto(String countryName, String msg) {
        wto.sendMessage(this.countryName, countryName, msg);
    }

    public void sendMessageByWho(String countryName, String msg) {
        who.sendMessage(this.countryName, countryName, msg);
    }

    public void sendMessageByWfc(String countryName, String msg) {
        wfc.sendMessage(this.countryName, countryName, msg);
    }

    public void receiveMessage(String countryName, String msg) {
        System.out.println(this.countryName + "收到来自" + countryName + "的消息：" + msg);
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public UnitedNations getWto() {
        return wto;
    }

    public void setWto(UnitedNations wto) {
        this.wto = wto;
    }

    public UnitedNations getWho() {
        return who;
    }

    public void setWho(UnitedNations who) {
        this.who = who;
    }

    public UnitedNations getWfc() {
        return wfc;
    }

    public void setWfc(UnitedNations wfc) {
        this.wfc = wfc;
    }
}

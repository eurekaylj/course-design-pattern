package exp2.t2;

public abstract class OperatingSystem {
    protected Language language;

    public void setLanguage(Language language) {
        this.language = language;
    }

    public abstract void operatingSystem();
}

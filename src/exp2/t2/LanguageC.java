package exp2.t2;

public class LanguageC extends Language{

    @Override
    public void language(String operatingSystem) {
        String language = "C";
        this.output.output(operatingSystem, language);
    }
}

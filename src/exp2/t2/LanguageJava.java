package exp2.t2;

public class LanguageJava extends Language{

    @Override
    public void language(String operatingSystem) {
        String language = "Java";
        this.output.output(operatingSystem, language);
    }
}

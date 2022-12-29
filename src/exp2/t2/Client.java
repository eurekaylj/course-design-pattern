package exp2.t2;

public class Client {
    public static void main(String[] args) {
        Output output = null;
        Language language = null;
        OperatingSystem system = null;

        output = (Output) XMLUtil.getBean("Output");
        language = (Language) XMLUtil.getBean("Language");
        system = (OperatingSystem) XMLUtil.getBean("OperatingSystem");

        system.setLanguage(language);
        language.setOutput(output);
        system.operatingSystem();
    }
}

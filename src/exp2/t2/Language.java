package exp2.t2;

public abstract class Language {
    Output output;

    public void setOutput(Output output) {
        this.output = output;
    }

    public abstract void language(String operatingSystem);
}

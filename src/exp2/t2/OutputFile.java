package exp2.t2;

public class OutputFile implements Output {
    @Override
    public void output(String operatingSystem, String language) {
        String output = "File";
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Language: " + language);
        System.out.println("Output: " + output);
    }
}

package exp1.t3;

import exp1.t3.XMLUtil;

public class Client {
    public static void main(String args[]) {
        try {
            ImageReader reader;
            ImageReaderFactory factory;

            factory = (ImageReaderFactory) XMLUtil.getBean();
            reader = factory.creatImageReader();

            reader.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

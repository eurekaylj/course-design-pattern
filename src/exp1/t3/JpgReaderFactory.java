package exp1.t3;

public class JpgReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader creatImageReader() {
        return new JpgReader();
    }
}

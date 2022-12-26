package exp1.t3;

public class GifReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader creatImageReader() {
        return new GifReader();
    }
}

package exp1.t9.sec2;

import java.io.*;

public class Customer implements Serializable {
    private String name;
    private Address address = null;

    public Customer() {
        this.address = new Address();
    }

    public Address getAddress() {
        return address;
    }

    public Object deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ois.readObject());
    }
}

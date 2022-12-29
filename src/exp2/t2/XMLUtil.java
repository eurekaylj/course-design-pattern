package exp2.t2;

import javax.xml.parsers.*;

import org.w3c.dom.*;

import java.io.*;

public class XMLUtil {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(String args) {
        try {
            //创建一个文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("./src/exp2/t2/config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = null;
            String className = null;

            if (args.equals("OperatingSystem")) {
                classNode = nl.item(0).getFirstChild();
            } else if (args.equals("Language")) {
                classNode = nl.item(1).getFirstChild();
            } else if (args.equals("Output")) {
                classNode = nl.item(2).getFirstChild();
            }
            className = classNode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c = Class.forName("exp2.t2." + className);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }

    }
}


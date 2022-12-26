package exp1.t1;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtil{
    // 该方法用于从XML配置文件中提取品牌名称，并返回该品牌名称
    public static String getType() {
        try {
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("./src/exp1/t1/config.xml"));

            // 获取包含品牌名称的文本节点
            NodeList nl = doc.getElementsByTagName("type");
            Node classNode = nl.item(0).getFirstChild();
            String type = classNode.getNodeValue().trim();
            return type;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

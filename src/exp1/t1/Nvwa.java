package exp1.t1;

import java.util.Objects;

public class Nvwa {
        public static Person creatPerson(String type) throws Exception {
            if (type.equals("M"))
                return new Man();
            else if (type.equals("W"))
                return new Woman();
            else if (type.equals("R"))
                return new Robot();
            else {
                throw new Exception("对不起，暂不能生产该类型产品！");
            }
        }
}

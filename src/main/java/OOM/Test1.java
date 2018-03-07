package OOM;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangxb on 2018/1/29.
 */
public class Test1 {
    static  class  OOMObject{

    }
    public static void main(String[] args){
        List<OOMObject> oomObjects = new ArrayList<>();

        while (true){
            oomObjects.add(new OOMObject());
        }
    }
}

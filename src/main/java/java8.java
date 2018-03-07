import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by yangxb on 2018/1/9.
 */
public class java8 {

    public static void main(String[] args){
        java8 java8 = new java8();

        java8.userMap(new HashMap());

        Predicate<Integer> result = x -> x>5;

        System.out.println(result);
        int x =1;
        System.out.println(result);

        System.out.println(result.test(1));
      //  new ArrayList<Integer>().stream().filter(integer -> integer>5);

        testWSASXAS res = () -> System.out.println("sdsds");

        testWSASXAS testWSASXAS = new testWSASXAS() {
            @Override
            public void test2() {
                System.out.println("sdsdsd");
            }
        };

    }

/*    public interface  Predicate<T>{
        boolean test(T t);
    }*/
    private void userMap(Map<String,String> map){

        System.out.println("yes");
    }

}

import org.junit.Test;

import java.util.List;

public class MyTest {


    @Test
    public void Test1(){
        Solusion1 solusion1 = new Solusion1();
        List<String> list1 = solusion1.letterCombinations("23");
        System.out.println(list1);
    }

    @Test
    public void Test2(){
        Solusion1 solusion1 = new Solusion1();
        List<String> list2 = solusion1.letterCombinations("");
        System.out.println(list2);
    }

    @Test
    public void Test3(){
        Solusion1 solusion1 = new Solusion1();
        List<String> list2 = solusion1.letterCombinations("2");
        System.out.println(list2);
    }

}

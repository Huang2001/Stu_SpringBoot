package MybatisTest;


import com.Stu.Service.Implement.Mapper1Implement;
import com.Stu.SpringStart;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringStart.class)
public class Test1
{
    @Autowired
    private Mapper1Implement mapper1Implement;

    @Test
    public void test1()
    {
        System.out.println(mapper1Implement.selectTable1(1));
     //mapper1Implement.insertTable1("huangheng");
       // mapper1Implement.insertTable1("hengliang");
    }
}

import com.person.Person2;
import com.person.Person3;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo2 {
    @Test
    public void test02(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beanTest.xml");
        Person3 person3= (Person3) ac.getBean("person3");
        System.out.println(person3);
    }
}

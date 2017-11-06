import com.person.Person2;
import com.person.Person3;
import com.person.Person4;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo2 {
    @Test
    public void test02(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("beanTest.xml");
        Person3 person= (Person3) ac.getBean("person3");
        Person3 person1= (Person3) ac.getBean("person3");
        System.out.println(person.equals(person1));
        System.out.println(person);
        System.out.println(person1);
        Person4 person4= (Person4) ac.getBean("person4");
        System.out.println(person4);
    }
}

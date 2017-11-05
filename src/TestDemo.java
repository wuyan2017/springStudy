import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.person.Person;
import com.boss.Boss;
public class TestDemo {
    @org.junit.Test
    public void test01() {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        Person person= (Person) ac.getBean("person");
        System.out.println(person);
        Boss boss= (Boss) ac.getBean("boss");
        System.out.println(boss);
        com.math.math m = (com.math.math) ac.getBean("math");
        int n1 = 100, n2 = 5;
        m.add(n1, n2);
        m.sub(n1, n2);
        m.mut(n1, n2);
        m.div(n1, n2);
    }
}

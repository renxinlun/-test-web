//import com.company.People;
import com.renxinlun.service.TestBean;
import com.renxinlun.service.TestService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 开发人:renxinlun
 * <p>
 * 功能描述:
 * <p>
 * 创建日期:16/9/12.
 */
public class UrlResourceTest {
    public static void main(String args[]) {

        //根据Xml配置文件创建Resource资源对象，该对象中包含了BeanDefinition的信息
//        ClassPathResource resource = new ClassPathResource("spring.xml");
        //创建DefaultListableBeanFactory
//        DefaultListableBeanFactory factory = new XmlBeanFactory(resource);
        //创建XmlBeanDefinitionReader读取器，用于载入BeanDefinition。之所以需要BeanFactory作为参数，是因为会将读取的信息回调配置给factory
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(resource);

//        TestService hw = (TestService)factory.getBean("testService");
//        hw.SysTestService();
        //XmlBeanDefinitionReader执行载入BeanDefinition
//        Resource resource = new ClassPathResource("spring.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);

        // 用classpath路径
//        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        // ApplicationContext factory = new ClassPathXmlApplicationContext("appcontext.xml");

        // ClassPathXmlApplicationContext使用了file前缀是可以使用绝对路径的
        // ApplicationContext factory = new ClassPathXmlApplicationContext("file:F:/workspace/example/src/appcontext.xml");

        // 用文件系统的路径,默认指项目的根路径
//        ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:spring.xml");
        // ApplicationContext factory = new FileSystemXmlApplicationContext("webRoot/WEB-INF/appcontext.xml");


        // 使用了classpath:前缀,这样,FileSystemXmlApplicationContext也能够读取classpath下的相对路径
//        ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:appcontext.xml");
        // ApplicationContext factory = new FileSystemXmlApplicationContext("file:F:/worskspace/example/src/appcontext.xml");

        // 不加file前缀
//       ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:/spring.xml");
//       TestService hw = (TestService)factory.getBean("testService");
//       TestBean  testBean = (TestBean)factory.getBean("test123");
//       TestBean  testBea2n = (TestBean)factory.getBean("testBean");
//       hw.SysTestService();
//       System.out.println(testBean.toString());
//       System.out.println(testBea2n.toString());


       ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//       People p = (People)factory.getBean("cutesource");
//       System.out.println(p.getId());
//       System.out.println(p.getName());
//       System.out.println(p.getAge());

        TestService   hw = (TestService)ctx.getBean("testService");
         hw.SysTestService();
    }
}

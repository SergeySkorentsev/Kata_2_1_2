import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld Hbean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld Hbean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat Cbean1 = (Cat) applicationContext.getBean("cat");
        Cat Cbean2 = (Cat) applicationContext.getBean("cat");

//        System.out.println(Cbean1.getName());
//        System.out.println(Cbean2.getName());

        System.out.println(Hbean1 == Hbean2);
        System.out.println(Cbean1 == Cbean2);
    }
}
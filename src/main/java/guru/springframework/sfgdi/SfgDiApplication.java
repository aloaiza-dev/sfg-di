package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication
{

    public static void main( String[] args )
    {
        ApplicationContext ctx = SpringApplication.run( SfgDiApplication.class, args );

        MyController controller = ( MyController ) ctx.getBean( "myController" );

        System.out.println( controller.sayHello() );
        System.out.println( ctx.getBean( PropertyInjectedController.class ).getGreeting() );
        System.out.println( ctx.getBean( ConstructorInjectedController.class ).getGreeting() );
    }
}

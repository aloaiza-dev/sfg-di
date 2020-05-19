package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.GreetingRepository;
import guru.springframework.sfgdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig
{
    @Bean
    GreetingServiceFactory greetingServiceFactory( GreetingRepository repository )
    {
        return new GreetingServiceFactory( repository );
    }
}

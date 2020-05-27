package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.example.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource( "classpath:datasource.properties" )
public class PropertyConfig
{
    @Value( "${dev.username}" )
    String user;

    @Value( "${dev.password}" )
    String password;

    @Value( "${dev.url}" )
    String url;

    @Bean
    public FakeDataSource fakeDataSource()
    {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser( user );
        fakeDataSource.setPassword( password );
        fakeDataSource.setUrl( url );
        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties()
    {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}

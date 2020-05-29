package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.example.FakeDataSource;
import guru.springframework.sfgdi.example.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig
{
    @Value( "${dev.username}" )
    String user;

    @Value( "${dev.password}" )
    String password;

    @Value( "${dev.url}" )
    String url;

    @Value( "${dev.jms.username}" )
    String jmsUser;

    @Value( "${dev.jms.password}" )
    String jmsPassword;

    @Value( "${dev.jms.url}" )
    String jmsUrl;

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
    public FakeJmsBroker fakeJmsBroker()
    {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername( jmsUser );
        fakeJmsBroker.setPassword( jmsPassword );
        fakeJmsBroker.setUrl( jmsUrl );

        return fakeJmsBroker;
    }
}

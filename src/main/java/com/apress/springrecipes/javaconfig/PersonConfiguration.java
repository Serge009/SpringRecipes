package com.apress.springrecipes.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Matrix on 10.10.2014.
 */
@Configuration
public class PersonConfiguration {

    @Bean(name="theArtistFormerlyKnownAsJosh", initMethod = "startLife", destroyMethod = "die")
    public Person josh(){
        Person josh = new Person();
        josh.setName("Josh");
        return josh;
    }
}
